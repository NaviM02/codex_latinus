package com.navi.semantic;

import com.navi.ast.declarations.*;
import com.navi.ast.declarations.initializers.*;
import com.navi.ast.expressions.*;
import com.navi.ast.expressions.literals.*;
import com.navi.ast.global.*;
import com.navi.ast.statements.*;

import java.util.*;

public class SemanticAnalyzer {
    private final SymbolTable symbolTable;
    private final Map<String, StructDeclaration> structs = new HashMap<>();
    private final List<String> errors = new ArrayList<>();
    private FunctionDeclaration currentFunction;
    private int loopDepth = 0;

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // for errors
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return List.copyOf(errors);
    }

    private void reportError(SemanticException exception) {
        errors.add(exception.getMessage());
    }

    // PROGRAM

    public void analyze(Program program) {
        try {
            collectStructs(program);
        } catch (SemanticException e) {
            reportError(e);
        }
        analyzeGlobalDeclarations(program);
        analyzeFunctions(program);
        Scope globalScope = symbolTable.getGlobalScope();
        for (Statement statement : program.getMainStatements()) {
            try {
                analyzeStatement(statement, globalScope);
            } catch (SemanticException e) {
                reportError(e);
            }
        }
    }

    // STRUCTS

    private void collectStructs(Program program) {
        if (program.getGlobalVariables() == null) return;
        for (Declaration declaration : program.getGlobalVariables().getDeclarations()) {
            if (declaration instanceof StructDeclaration struct) {
                if (structs.containsKey(struct.getName())) {
                    throw new SemanticException("Struct '" + struct.getName() + "' is already declared.");
                }
                analyzeStructDeclaration(struct);
                structs.put(struct.getName(), struct);
            }
        }
    }

    private void analyzeStructDeclaration(StructDeclaration struct) {
        Set<String> fieldNames = new HashSet<>();

        for (StructField field : struct.getFields()) {
            if (!fieldNames.add(field.getName())) {
                throw new SemanticException("Struct '" + struct.getName() + "' has duplicated field '" + field.getName() + "'.");
            }

            String fieldType = field.getType();

            if (!TypeSystem.isPrimitive(fieldType) && !structs.containsKey(fieldType)) {
                throw new SemanticException("Unknown type '" + fieldType + "' in field '" + field.getName() + "' of struct '" + struct.getName() + "'.");
            }
        }
    }

    // GLOBAL DECLARATIONS

    private void analyzeGlobalDeclarations(Program program) {
        if (program.getGlobalVariables() == null) return;

        Scope globalScope = symbolTable.getGlobalScope();

        for (Declaration declaration : program.getGlobalVariables().getDeclarations()) {
            try {
                analyzeDeclaration(declaration, globalScope);
            } catch (SemanticException e) {
                reportError(e);
            }
        }
    }


    // FUNCTIONS

    private void analyzeFunctions(Program program) {
        for (FunctionDeclaration function : program.getFunctions()) {
            try {
                analyzeFunction(function);
            } catch (SemanticException e) {
                reportError(e);
            }
        }
    }

    private void analyzeFunction(FunctionDeclaration function) {
        Scope functionScope = symbolTable.getFunctionScope(function.getName());

        if (functionScope == null) {
            throw new SemanticException("Scope not found for function '" + function.getName() + "'.");
        }

        currentFunction = function;

        FunctionBody body = function.getBody();

        if (body.getLocalVariables() != null) {
            for (Declaration declaration : body.getLocalVariables().getDeclarations()) {
                try {
                    analyzeDeclaration(declaration, functionScope);
                } catch (SemanticException e) {
                    reportError(e);
                }
            }
        }

        for (Statement statement : body.getBody().getStatements()) {
            try {
                analyzeStatement(statement, functionScope);
            } catch (SemanticException e) {
                reportError(e);
            }
        }

        currentFunction = null;
    }

    // DECLARATIONS

    private void analyzeDeclaration(Declaration declaration, Scope scope) {
        if (declaration instanceof VariableDeclaration variable) {
            validateTypeExists(variable.getType());
            if (variable.getInitializer() != null) {
                String valueType = analyzeInitializer(variable.getInitializer(), variable.getType(), scope);

                if (!TypeSystem.canAssign(variable.getType(), valueType)) {
                    throw new SemanticException("Cannot assign " + valueType + " to variable '" + variable.getName() + "' of type " + variable.getType());
                }
            }

            return;
        }

        if (declaration instanceof ArrayDeclaration array) {
            validateTypeExists(array.getType());
            String sizeType = analyzeExpression(array.getSize(), scope);

            if (!TypeSystem.NUMERUS.equals(sizeType)) {
                throw new SemanticException("Array size must be numerus.");
            }

            if (array.getInitializer() != null) {
                for (Expression expression : array.getInitializer().getValues()) {
                    String valueType = analyzeExpression(expression, scope);

                    if (!TypeSystem.canAssign(array.getType(), valueType)) {
                        throw new SemanticException("Invalid value in array '" + array.getName() + "'. Expected " + array.getType() + " but found " + valueType);
                    }
                }

                Integer size = evaluateConstantInteger(array.getSize());

                if (size != null && array.getInitializer().getValues().size() > size) {
                    throw new SemanticException("Array '" + array.getName() + "' has " + array.getInitializer().getValues().size() + " initializers but its size is " + size);
                }
            }

            return;
        }

        // validate in collecStructs()
        if (declaration instanceof StructDeclaration struct) return;

        throw new SemanticException("Unsupported declaration: " + declaration.getClass().getSimpleName());
    }

    // INITIALIZERS

    private String analyzeInitializer(Initializer initializer, String expectedType, Scope scope) {
        if (initializer instanceof ExpressionInitializer expressionInitializer) {
            return analyzeExpression(expressionInitializer.getExpression(), scope);
        }

        if (initializer instanceof StructInitializer structInitializer) {
            analyzeStructInitializer(structInitializer, expectedType, scope);
            return expectedType;
        }

        throw new SemanticException("Unsupported initializer: " + initializer.getClass().getSimpleName());
    }

    private void analyzeStructInitializer(StructInitializer initializer, String structType, Scope scope) {
        StructDeclaration struct = structs.get(structType);

        if (struct == null) {
            throw new SemanticException("Struct '" + structType + "' does not exist.");
        }

        Map<String, StructField> fields = new HashMap<>();

        for (StructField field : struct.getFields()) {
            fields.put(field.getName(), field);
        }

        Set<String> initialized = new HashSet<>();

        for (StructFieldInitializer fieldInitializer : initializer.getFields()) {
            String fieldName = fieldInitializer.getName();
            StructField field = fields.get(fieldName);

            if (field == null) {
                throw new SemanticException("Field '" + fieldName + "' does not exist in struct '" + structType + "'.");
            }

            if (!initialized.add(fieldName)) {
                throw new SemanticException("Field '" + fieldName + "' is initialized more than once.");
            }

            String valueType = analyzeInitializer(fieldInitializer.getValue(), field.getType(), scope);

            if (!TypeSystem.canAssign(field.getType(), valueType)) {
                throw new SemanticException("Invalid type for field '" + fieldName + "'. Expected " + field.getType() + " but found " + valueType);
            }
        }

        if (initialized.size() != fields.size()) {
            throw new SemanticException("Not all fields of struct '" + structType + "' were initialized.");
        }
    }

    // EXPRESSIONS

    private String analyzeExpression(Expression expression, Scope scope) {
        // literals
        if (expression instanceof NumberLiteral) return TypeSystem.NUMERUS;
        if (expression instanceof DecimalLiteral) return TypeSystem.DECIMALIS;
        if (expression instanceof StringLiteral) return TypeSystem.TEXTUM;
        if (expression instanceof CharLiteral) return TypeSystem.LITTERA;
        if (expression instanceof BooleanLiteral) return TypeSystem.BOOLEAN;

        // variables
        if (expression instanceof VariableExpression variable) {
            Symbol symbol = scope.resolve(variable.getName());

            if (symbol == null) {
                throw new SemanticException("Variable '" + variable.getName() + "' is not declared.");
            }

            if (symbol.getKind() == SymbolKind.STRUCT) {
                return symbol.getType();
            }

            return symbol.getType();
        }

        // binary
        if (expression instanceof BinaryExpression binary) {
            String left = analyzeExpression(binary.getLeft(), scope);
            String right = analyzeExpression(binary.getRight(), scope);
            return analyzeBinaryExpression(binary.getOperator(), left, right);
        }

        // unary
        if (expression instanceof UnaryExpression unary) {
            String type = analyzeExpression(unary.getExpression(), scope);
            if (unary.getOperator() == UnaryOperator.POST_INCREMENT || unary.getOperator() == UnaryOperator.POST_DECREMENT) {
                validateAssignmentTarget(unary.getExpression(), scope);
            }

            return analyzeUnaryExpression(unary.getOperator(), type);
        }

        // array access
        if (expression instanceof ArrayAccessExpression arrayAccess) {
            return analyzeArrayAccess(arrayAccess, scope);
        }

        // Struct member
        if (expression instanceof MemberAccessExpression memberAccess) {
            return analyzeMemberAccess(memberAccess, scope);
        }

        // Function call
        if (expression instanceof FunctionCallExpression functionCall) {
            return analyzeFunctionCall(functionCall, scope);
        }

        throw new SemanticException("Unsupported expression: " + expression.getClass().getSimpleName());
    }

    // BINARY EXPRESSIONS

    private String analyzeBinaryExpression(BinaryOperator operator, String left, String right) {
        if (!TypeSystem.isPrimitive(left) || !TypeSystem.isPrimitive(right)) {
            throw new SemanticException("Only primitive values can be operated.");
        }

        return switch (operator) {
            case ADD -> {
                if (left.equals(TypeSystem.TEXTUM) || right.equals(TypeSystem.TEXTUM)) {
                    yield TypeSystem.TEXTUM;
                }
                yield TypeSystem.promote(left, right);
            }

            case SUBTRACT, MULTIPLY, DIVIDE -> {
                if (left.equals(TypeSystem.TEXTUM) || right.equals(TypeSystem.TEXTUM)) {
                    throw new SemanticException("Operator " + operator + " cannot be used with textum.");
                }
                if (left.equals(TypeSystem.BOOLEAN) || right.equals(TypeSystem.BOOLEAN)) {
                    throw new SemanticException("Arithmetic operators require numeric values.");
                }
                yield TypeSystem.promote(left, right);
            }

            case LESS, LESS_EQUAL, GREATER, GREATER_EQUAL -> {
                if (left.equals(TypeSystem.TEXTUM) || right.equals(TypeSystem.TEXTUM)) {
                    throw new SemanticException("Relational operators cannot be used with textum.");
                }
                if (left.equals(TypeSystem.BOOLEAN) || right.equals(TypeSystem.BOOLEAN)) {
                    throw new SemanticException("Relational operators require numeric values.");
                }
                yield TypeSystem.BOOLEAN;
            }

            case EQUAL, NOT_EQUAL -> {
                if (!areComparable(left, right)) {
                    throw new SemanticException("Cannot compare " + left + " with " + right);
                }
                yield TypeSystem.BOOLEAN;
            }

            case AND, OR -> {
                if (!left.equals(TypeSystem.BOOLEAN) || !right.equals(TypeSystem.BOOLEAN)) {
                    throw new SemanticException("Logical operators require boolean operands.");
                }
                yield TypeSystem.BOOLEAN;
            }
        };
    }

    private boolean areComparable(String left, String right) {
        if (left.equals(right)) return true;

        if (TypeSystem.isPrimitive(left) && TypeSystem.isPrimitive(right)) {
            return TypeSystem.canAssign(left, right) || TypeSystem.canAssign(right, left);
        }

        return false;
    }

    // UNARY EXPRESSIONS

    private String analyzeUnaryExpression(UnaryOperator operator, String type) {
        return switch (operator) {
            case NOT -> {
                if (!TypeSystem.BOOLEAN.equals(type)) {
                    throw new SemanticException("Operator 'non' requires a boolean.");
                }
                yield TypeSystem.BOOLEAN;
            }

            case NEGATE -> {
                if (!TypeSystem.NUMERUS.equals(type) && !TypeSystem.DECIMALIS.equals(type)) {
                    throw new SemanticException("Unary '-' requires a numeric value.");
                }
                yield type;
            }

            case POST_INCREMENT, POST_DECREMENT -> {
                if (!TypeSystem.NUMERUS.equals(type) && !TypeSystem.DECIMALIS.equals(type)) {
                    throw new SemanticException("Increment/decrement requires a numeric value.");
                }
                yield type;
            }
        };
    }

    // ARRAY ACCESS

    private String analyzeArrayAccess(ArrayAccessExpression arrayAccess, Scope scope) {
        String indexType = analyzeExpression(arrayAccess.getIndex(), scope);

        if (!TypeSystem.NUMERUS.equals(indexType)) {
            throw new SemanticException("Array index must be numerus.");
        }

        Expression arrayExpression = arrayAccess.getArray();
        Symbol arraySymbol = resolveArraySymbol(arrayExpression, scope);

        if (arraySymbol == null) {
            /*
             * Example of MemberAccessExpression:
             * persona.animales[1]
             */
            if (arrayExpression instanceof MemberAccessExpression member) {
                return analyzeArrayMemberAccess(member, scope);
            }
            throw new SemanticException("Expression is not an array.");
        }

        if (arraySymbol.getKind() != SymbolKind.ARRAY) {
            throw new SemanticException("'" + arraySymbol.getName() + "' is not an array.");
        }
        return arraySymbol.getType();
    }

    private Symbol resolveArraySymbol(Expression expression, Scope scope) {
        if (expression instanceof VariableExpression variable) {
            Symbol symbol = scope.resolve(variable.getName());

            if (symbol != null && symbol.getKind() == SymbolKind.ARRAY) {
                return symbol;
            }
        }
        return null;
    }

    private String analyzeArrayMemberAccess(MemberAccessExpression memberAccess, Scope scope) {
        String objectType = analyzeExpression(memberAccess.getObject(), scope);
        StructDeclaration struct = structs.get(objectType);

        if (struct == null) {
            throw new SemanticException("Type '" + objectType + "' is not a struct.");
        }

        StructField field = findStructField(struct, memberAccess.getMember());

        if (field == null) {
            throw new SemanticException("Struct '" + objectType + "' has no field '" + memberAccess.getMember() + "'.");
        }

        if (!field.isArray()) {
            throw new SemanticException("Field '" + memberAccess.getMember() + "' is not an array.");
        }

        return field.getType();
    }

    // MEMBER ACCESS

    private String analyzeMemberAccess(MemberAccessExpression memberAccess, Scope scope) {
        String objectType = analyzeExpression(memberAccess.getObject(), scope);
        StructDeclaration struct = structs.get(objectType);

        if (struct == null) {
            throw new SemanticException("Type '" + objectType + "' is not a struct.");
        }

        StructField field = findStructField(struct, memberAccess.getMember());

        if (field == null) {
            throw new SemanticException("Struct '" + objectType + "' has no field '" + memberAccess.getMember() + "'.");
        }

        return field.getType();
    }

    private StructField findStructField(StructDeclaration struct, String fieldName) {
        for (StructField field : struct.getFields()) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }

        return null;
    }

    // FUNCTION CALL

    private String analyzeFunctionCall(FunctionCallExpression call, Scope scope) {

        if (!(call.getCallee() instanceof VariableExpression variable)) {
            throw new SemanticException("Invalid function call.");
        }

        String functionName = variable.getName();
        Symbol function = scope.resolve(functionName);

        if (function == null || function.getKind() != SymbolKind.FUNCTION) {
            throw new SemanticException("Function '" + functionName + "' is not declared.");
        }

        List<Expression> arguments = call.getArguments();
        List<String> parameters = function.getParameterTypes();

        if (arguments.size() != parameters.size()) {
            throw new SemanticException("Function '" + functionName + "' expects " + parameters.size() + " arguments but got " + arguments.size());
        }

        for (int i = 0; i < arguments.size(); i++) {
            String argumentType = analyzeExpression(arguments.get(i), scope);
            String parameterType = parameters.get(i);

            if (!TypeSystem.canAssign(parameterType, argumentType)) {
                throw new SemanticException("Invalid argument " + (i + 1) + " in function '" + functionName + "'. Expected " + parameterType + " but found " + argumentType);
            }
        }

        return function.getType();
    }

    // STATEMENTS

    private void analyzeStatement(Statement statement, Scope scope) {
        // assignment
        if (statement instanceof AssignmentStatement assignment) {
            String targetType = analyzeAssignmentTarget(assignment.getTarget(), scope);
            String valueType = analyzeInitializer(assignment.getInitializer(), targetType, scope);

            if (!TypeSystem.canAssign(targetType, valueType)) {
                throw new SemanticException("Cannot assign " + valueType + " to " + targetType);
            }

            return;
        }

        // increment / decrement
        if (statement instanceof IncrementStatement increment) {
            String targetType = analyzeAssignmentTarget(increment.getTarget(), scope);

            if (!targetType.equals(TypeSystem.NUMERUS) && !targetType.equals(TypeSystem.DECIMALIS)) {
                throw new SemanticException("Increment/decrement requires a numeric target.");
            }

            return;
        }

        // block
        if (statement instanceof BlockStatement block) {
            analyzeBlock(block, scope);
            return;
        }

        // if
        if (statement instanceof IfStatement ifStatement) {
            try {
                requireBoolean(ifStatement.getCondition(), scope, "if");
            } catch (SemanticException e) {
                reportError(e);
            }
            analyzeBlock(ifStatement.getThenBlock(), scope);

            for (ElseIfStatement elseIf : ifStatement.getElseIfStatements()) {
                try {
                    requireBoolean(elseIf.getCondition(), scope, "else-if");
                } catch (SemanticException e) {
                    reportError(e);
                }
                analyzeBlock(elseIf.getBlock(), scope);
            }

            if (ifStatement.getElseBlock() != null) {
                analyzeBlock(ifStatement.getElseBlock(), scope);
            }

            return;
        }

        // while
        if (statement instanceof WhileStatement whileStatement) {
            try {
                requireBoolean(whileStatement.getCondition(), scope, "while");
            } catch (SemanticException e) {
                reportError(e);
            }
            loopDepth++;

            analyzeBlock(whileStatement.getBlock(), scope);
            loopDepth--;

            return;
        }

        // do while
        if (statement instanceof DoWhileStatement doWhile) {
            loopDepth++;
            analyzeBlock(doWhile.getBlock(), scope);

            loopDepth--;
            try {
                requireBoolean(doWhile.getCondition(), scope, "do-while");
            } catch (SemanticException e) {
                reportError(e);
            }

            return;
        }

        // for

        if (statement instanceof ForStatement forStatement) {
            Scope forScope = new Scope(scope);
            analyzeDeclaration(forStatement.getInitializer(), forScope);
            requireBoolean(forStatement.getCondition(), forScope, "for");

            analyzeExpression(forStatement.getUpdate(), forScope);
            loopDepth++;

            analyzeBlock(forStatement.getBlock(), forScope);
            loopDepth--;

            return;
        }

        // return

        if (statement instanceof ReturnStatement returnStatement) {
            analyzeReturn(returnStatement, scope);
            return;
        }

        // break

        if (statement instanceof BreakStatement) {
            if (loopDepth == 0) {
                throw new SemanticException("'break' can only be used inside a loop.");
            }
            return;
        }

        // continue

        if (statement instanceof ContinueStatement) {
            if (loopDepth == 0) {
                throw new SemanticException("'continue' can only be used inside a loop.");
            }
            return;
        }

        // print
        if (statement instanceof PrintStatement print) {
            for (Expression expression : print.getExpressions()) {
                analyzeExpression(expression, scope);
            }
            return;
        }

        // read
        if (statement instanceof ReadStatement read) {
            if (read.getTarget() != null) {
                analyzeAssignmentTarget(read.getTarget(), scope);
            }
            return;
        }

        throw new SemanticException("Unsupported statement: " + statement.getClass().getSimpleName());
    }

    // BLOCKS

    private void analyzeBlock(BlockStatement block, Scope scope) {
        for (Statement statement : block.getStatements()) {
            try {
                analyzeStatement(statement, scope);
            } catch (SemanticException e) {
                reportError(e);
            }
        }
    }

    // ASSIGNMENT TARGET

    private String analyzeAssignmentTarget(Expression expression, Scope scope) {
        if (expression instanceof VariableExpression) {
            return analyzeExpression(expression, scope);
        }

        if (expression instanceof ArrayAccessExpression arrayAccess) {
            return analyzeArrayAccess(arrayAccess, scope);
        }

        if (expression instanceof MemberAccessExpression memberAccess) {
            return analyzeMemberAccess(memberAccess, scope);
        }

        throw new SemanticException("Expression cannot be used as assignment target.");
    }

    private void validateAssignmentTarget(Expression expression, Scope scope) {
        analyzeAssignmentTarget(expression, scope);
    }

    // RETURN

    private void analyzeReturn(ReturnStatement returnStatement, Scope scope) {
        if (currentFunction == null) {
            throw new SemanticException("Return statement outside a function.");
        }

        String expectedType = currentFunction.getReturnType();
        Expression expression = returnStatement.getExpression();

        /*
         * Procedure.
         */
        if (TypeSystem.VOID.equals(expectedType)) {
            if (expression != null) {
                throw new SemanticException("Void function cannot return a value.");
            }
            return;
        }

        /*
         * Function with return.
         */
        if (expression == null) {
            throw new SemanticException("Function '" + currentFunction.getName() + "' must return a value of type " + expectedType);
        }

        String actualType = analyzeExpression(expression, scope);

        if (!TypeSystem.canAssign(expectedType, actualType)) {
            throw new SemanticException("Function '" + currentFunction.getName() + "' must return " + expectedType + " but found " + actualType);
        }
    }

    // BOOLEAN

    private void requireBoolean(Expression expression, Scope scope, String context) {
        String type = analyzeExpression(expression, scope);

        if (!TypeSystem.BOOLEAN.equals(type)) {
            throw new SemanticException(context + " condition must be boolean, found " + type);
        }
    }

    // TYPES

    private void validateTypeExists(String type) {
        if (TypeSystem.isPrimitive(type)) return;
        if (structs.containsKey(type)) return;
        throw new SemanticException("Unknown type '" + type + "'.");
    }

    // CONSTANT INTEGER

    private Integer evaluateConstantInteger(Expression expression) {
        if (expression instanceof NumberLiteral number) {
            return number.getValue();
        }
        return null;
    }
}