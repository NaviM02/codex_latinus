package com.navi.backend.semantic;

import com.navi.backend.ast.declarations.*;
import com.navi.backend.ast.declarations.initializers.*;
import com.navi.backend.ast.expressions.*;
import com.navi.backend.ast.expressions.literals.*;
import com.navi.backend.ast.global.*;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.declarations.initializers.ExpressionInitializer;
import com.navi.backend.ast.declarations.initializers.StructFieldInitializer;
import com.navi.backend.ast.declarations.initializers.StructInitializer;
import com.navi.backend.ast.global.FunctionBody;
import com.navi.backend.ast.global.FunctionDeclaration;
import com.navi.backend.ast.global.Program;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.semantic.errors.SemanticException;

import java.util.*;

public class SemanticAnalyzerVisitor implements AstVisitor<String> {
    private final SymbolTable symbolTable;
    private final Map<String, StructDeclaration> structs = new HashMap<>();
    private final List<String> errors = new ArrayList<>();
    private FunctionDeclaration currentFunction;
    private Scope currentScope;
    private int loopDepth = 0;

    // execution(?
    private final ValueEvaluator valueEvaluator;

    public SemanticAnalyzerVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.currentScope = symbolTable.getGlobalScope();
        this.valueEvaluator = new ValueEvaluator(currentScope);
    }

    public void analyze(Program program) {
        program.accept(this);
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

    @Override
    public String visit(Program node) {
        if (node.getGlobalVariables() != null) {
            for (Declaration declaration : node.getGlobalVariables().getDeclarations()) {
                if (declaration instanceof StructDeclaration struct) {
                    try {
                        collectStruct(struct);
                    } catch (SemanticException e) {
                        reportError(e);
                    }
                }
            }
        }
        if (node.getGlobalVariables() != null) {
            node.getGlobalVariables().accept(this);
        }

        if (node.getFunctions() != null) {
            for (FunctionDeclaration function : node.getFunctions()) {
                try {
                    function.accept(this);
                } catch (SemanticException e) {
                    reportError(e);
                }
            }
        }

        currentScope = symbolTable.getGlobalScope();
        valueEvaluator.setCurrentScope(currentScope);

        if (node.getMainStatements() != null) {
            for (Statement statement : node.getMainStatements()) {
                try {
                    statement.accept(this);
                } catch (SemanticException e) {
                    reportError(e);
                }
            }
        }

        return null;
    }

    @Override
    public String visit(GlobalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            try {
                declaration.accept(this);
            } catch (SemanticException e) {
                reportError(e);
            }
        }
        return null;
    }

    @Override
    public String visit(LocalVariableSection node) {
        for (Declaration declaration : node.getDeclarations()) {
            try {
                declaration.accept(this);
            } catch (SemanticException e) {
                reportError(e);
            }
        }

        return null;
    }

    @Override
    public String visit(FunctionDeclaration node) {
        Scope previousScope = currentScope;
        Scope functionScope = symbolTable.getFunctionScope(node.getName());

        if (functionScope == null) {
            throw new SemanticException("Scope not found for function '" + node.getName() + "'.");
        }

        currentFunction = node;
        currentScope = functionScope;
        valueEvaluator.setCurrentScope(currentScope);

        try {
            if (node.getBody() != null) {
                node.getBody().accept(this);
            }
        } finally {
            currentFunction = null;
            currentScope = previousScope;
            valueEvaluator.setCurrentScope(currentScope);
        }

        return null;
    }

    @Override
    public String visit(FunctionBody node) {
        if (node.getLocalVariables() != null) {
            node.getLocalVariables().accept(this);
        }

        if (node.getBody() != null) {
            node.getBody().accept(this);
        }

        return null;
    }

    @Override
    public String visit(Parameter node) {
        return null;
    }

    @Override
    public String visit(VariableDeclaration node) {
        validateTypeExists(node.getType());

        if (node.getInitializer() != null) {
            String valueType = analyzeInitializer(node.getInitializer(), node.getType());

            if (!TypeSystem.canAssign(node.getType(), valueType)) {
                throw new SemanticException("Cannot assign " + valueType + " to variable '" + node.getName() + "' of type " + node.getType());
            }

            Object value = valueEvaluator.evaluateInitializer(node.getInitializer());
            Symbol symbol = currentScope.resolve(node.getName());
            if (symbol != null) symbol.setValue(value);
        }
        return null;
    }

    @Override
    public String visit(ArrayDeclaration node) {
        validateTypeExists(node.getType());
        String sizeType = node.getSize().accept(this);

        if (!TypeSystem.NUMERUS.equals(sizeType)) {
            throw new SemanticException("Array size must be numerus.");
        }

        if (node.getInitializer() != null) {
            for (Expression expression : node.getInitializer().getValues()) {
                String valueType = expression.accept(this);

                if (!TypeSystem.canAssign(node.getType(), valueType)) {
                    throw new SemanticException("Invalid value in array '" + node.getName() + "'. Expected " + node.getType() + " but found " + valueType);
                }
            }

            Integer size = evaluateConstantInteger(node.getSize());

            if (size != null && node.getInitializer().getValues().size() > size) {
                throw new SemanticException("Array '" + node.getName() + "' has " + node.getInitializer().getValues().size() + " initializers but its size is " + size);
            }
        }

        return null;
    }

    @Override
    public String visit(ArrayInitializer node) {
        return null;
    }

    @Override
    public String visit(StructDeclaration node) {
        return null;
    }

    @Override
    public String visit(StructField node) {
        return null;
    }

    @Override
    public String visit(ExpressionInitializer node) {
        return node.getExpression().accept(this);
    }

    @Override
    public String visit(StructInitializer node) {
        return null;
    }

    @Override
    public String visit(StructFieldInitializer node) {
        return null;
    }

    @Override
    public String visit(AssignmentStatement node) {
        String targetType = analyzeAssignmentTarget(node.getTarget());
        String valueType = analyzeInitializer(node.getInitializer(), targetType);

        if (!TypeSystem.canAssign(targetType, valueType)) {
            throw new SemanticException("Cannot assign " + valueType + " to " + targetType);
        }

        Object value = valueEvaluator.evaluateInitializer(node.getInitializer());
        valueEvaluator.assignValue(node.getTarget(), value);

        return null;
    }

    @Override
    public String visit(BlockStatement node) {
        for (Statement statement : node.getStatements()) {
            try {
                statement.accept(this);
            } catch (SemanticException e) {
                reportError(e);
            }
        }

        return null;
    }

    @Override
    public String visit(BreakStatement node) {
        if (loopDepth == 0) {
            throw new SemanticException("'break' can only be used inside a loop.");
        }
        return null;
    }

    @Override
    public String visit(ContinueStatement node) {
        if (loopDepth == 0) {
            throw new SemanticException("'continue' can only be used inside a loop.");
        }
        return null;
    }

    @Override
    public String visit(DoWhileStatement node) {
        loopDepth++;

        try {
            node.getBlock().accept(this);
        } finally {
            loopDepth--;
        }

        try {
            requireBoolean(node.getCondition(), "facere-dum");
        } catch (SemanticException e) {
            reportError(e);
        }

        return null;
    }

    @Override
    public String visit(ElseIfStatement node) {
        requireBoolean(node.getCondition(), "aliter");
        node.getBlock().accept(this);
        return null;
    }

    @Override
    public String visit(ForStatement node) {
        Scope previousScope = currentScope;
        currentScope = new Scope(previousScope);
        valueEvaluator.setCurrentScope(currentScope);

        try {
            node.getInitializer().accept(this);
            requireBoolean(node.getCondition(), "per");
            node.getUpdate().accept(this);
            loopDepth++;

            try {
                node.getBlock().accept(this);
            } finally {
                loopDepth--;
            }

        } finally {
            currentScope = previousScope;
            valueEvaluator.setCurrentScope(currentScope);
        }

        return null;
    }

    @Override
    public String visit(IfStatement node) {
        try {
            requireBoolean(node.getCondition(), "'si'");
        } catch (SemanticException e) {
            reportError(e);
        }

        node.getThenBlock().accept(this);

        for (ElseIfStatement elseIf : node.getElseIfStatements()) {
            try {
                elseIf.accept(this);
            } catch (SemanticException e) {
                reportError(e);
            }
        }

        if (node.getElseBlock() != null) {
            node.getElseBlock().accept(this);
        }

        return null;
    }

    @Override
    public String visit(IncrementStatement node) {
        String targetType = analyzeAssignmentTarget(node.getTarget());

        if (!targetType.equals(TypeSystem.NUMERUS) && !targetType.equals(TypeSystem.DECIMALIS)) {
            throw new SemanticException("Increment/decrement requires a numeric target.");
        }

        return null;
    }

    @Override
    public String visit(PrintStatement node) {
        for (Expression expression : node.getExpressions()) {
            expression.accept(this);
        }

        return null;
    }

    @Override
    public String visit(ReadStatement node) {
        if (node.getTarget() != null) {
            analyzeAssignmentTarget(node.getTarget());
        }
        return null;
    }

    @Override
    public String visit(ReturnStatement node) {
        if (currentFunction == null) {
            throw new SemanticException("Return statement outside a function.");
        }

        String expectedType = currentFunction.getReturnType();
        Expression expression = node.getExpression();

        if (TypeSystem.VOID.equals(expectedType)) {
            if (expression != null) {
                throw new SemanticException("Void function cannot return a value.");
            }

            return null;
        }

        if (expression == null) {
            throw new SemanticException("Function '" + currentFunction.getName() + "' must return a value of type " + expectedType);
        }

        String actualType = expression.accept(this);

        if (!TypeSystem.canAssign(expectedType, actualType)) {
            throw new SemanticException("Function '" + currentFunction.getName() + "' must return " + expectedType + " but found " + actualType);
        }

        return null;
    }

    @Override
    public String visit(WhileStatement node) {
        try {
            requireBoolean(node.getCondition(), "dum");
        } catch (SemanticException e) {
            reportError(e);
        }

        loopDepth++;

        try {
            node.getBlock().accept(this);
        } finally {
            loopDepth--;
        }
        return null;
    }

    @Override
    public String visit(ArrayAccessExpression node) {
        String indexType = node.getIndex().accept(this);

        if (!TypeSystem.NUMERUS.equals(indexType)) {
            throw new SemanticException("Array index must be numerus.");
        }

        Expression arrayExpression = node.getArray();

        /*
         * Normal case:
         * variableArray[1]
         */
        Symbol arraySymbol = resolveArraySymbol(arrayExpression);

        if (arraySymbol != null) {
            if (arraySymbol.getKind() != SymbolKind.ARRAY) {
                throw new SemanticException("'" + arraySymbol.getName() + "' is not an array.");
            }

            return arraySymbol.getType();
        }

        /*
         * Case of an array used inside an initializer:
         * series animales : Animal
         * animales: Animal[7]
         *
         * Here "Animal[7]" represents a structure of type Animal
         * with size 7, not an access to an existing array.
         */
        if (arrayExpression instanceof VariableExpression variable) {
            if (structs.containsKey(variable.getName())) {
                return variable.getName();
            }
            throw new SemanticException("Variable '" + variable.getName() + "' is not declared.");
        }

        /*
         * Array that belongs to a structure:
         * mi_selva.animales[1]
         */
        if (arrayExpression instanceof MemberAccessExpression member) {
            return analyzeArrayMemberAccess(member);
        }

        throw new SemanticException("Expression is not an array.");
    }

    @Override
    public String visit(BinaryExpression node) {
        String left = node.getLeft().accept(this);
        String right = node.getRight().accept(this);

        return analyzeBinaryExpression(node.getOperator(), left, right);
    }

    @Override
    public String visit(FunctionCallExpression node) {
        if (!(node.getCallee() instanceof VariableExpression variable)) {
            throw new SemanticException("Invalid function call.");
        }

        String functionName = variable.getName();
        Symbol function = currentScope.resolve(functionName);

        if (function == null || function.getKind() != SymbolKind.FUNCTION) {
            throw new SemanticException("Function '" + functionName + "' is not declared.");
        }

        List<Expression> arguments = node.getArguments();
        List<String> parameters = function.getParameterTypes();

        if (arguments.size() != parameters.size()) {
            throw new SemanticException("Function '" + functionName + "' expects " + parameters.size() + " arguments but got " + arguments.size());
        }

        for (int i = 0; i < arguments.size(); i++) {
            String argumentType = arguments.get(i).accept(this);
            String parameterType = parameters.get(i);

            if (!TypeSystem.canAssign(parameterType, argumentType)) {
                throw new SemanticException("Invalid argument " + (i + 1) + " in function '" + functionName + "'. Expected " + parameterType + " but found " + argumentType);
            }
        }

        return function.getType();
    }

    @Override
    public String visit(MemberAccessExpression node) {
        String objectType = node.getObject().accept(this);
        StructDeclaration struct = structs.get(objectType);

        if (struct == null) {
            throw new SemanticException("Type '" + objectType + "' is not a struct.");
        }

        StructField field = findStructField(struct, node.getMember());

        if (field == null) {
            throw new SemanticException("Struct '" + objectType + "' has no field '" + node.getMember() + "'.");
        }

        return field.getType();
    }

    @Override
    public String visit(UnaryExpression node) {
        String type = node.getExpression().accept(this);

        if (node.getOperator() == UnaryOperator.POST_INCREMENT || node.getOperator() == UnaryOperator.POST_DECREMENT) {
            validateAssignmentTarget(node.getExpression());
        }

        return analyzeUnaryExpression(node.getOperator(), type);
    }

    @Override
    public String visit(VariableExpression node) {
        Symbol symbol = currentScope.resolve(node.getName());

        if (symbol == null) {
            throw new SemanticException("Variable '" + node.getName() + "' is not declared.");
        }

        return symbol.getType();
    }


    @Override
    public String visit(BooleanLiteral node) {
        return TypeSystem.BOOLEAN;
    }

    @Override
    public String visit(CharLiteral node) {
        return TypeSystem.LITTERA;
    }

    @Override
    public String visit(DecimalLiteral node) {
        return TypeSystem.DECIMALIS;
    }

    @Override
    public String visit(NumberLiteral node) {
        return TypeSystem.NUMERUS;
    }

    @Override
    public String visit(StringLiteral node) {
        return TypeSystem.TEXTUM;
    }

    // HELPERS
    private void collectStruct(StructDeclaration struct) {
        if (structs.containsKey(struct.getName())) {
            throw new SemanticException("Struct '" + struct.getName() + "' is already declared.");
        }
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

        structs.put(struct.getName(), struct);
    }

    private String analyzeInitializer(Initializer initializer, String expectedType) {
        if (initializer instanceof ExpressionInitializer expression) {
            return expression.getExpression().accept(this);
        }

        if (initializer instanceof StructInitializer structInitializer) {
            analyzeStructInitializer(structInitializer, expectedType);
            return expectedType;
        }

        throw new SemanticException("Unsupported initializer: " + initializer.getClass().getSimpleName());
    }

    private void analyzeStructInitializer(StructInitializer initializer, String structType) {
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

            String valueType = analyzeInitializer(fieldInitializer.getValue(), field.getType());

            if (!TypeSystem.canAssign(field.getType(), valueType)) {
                throw new SemanticException("Invalid type for field '" + fieldName + "'. Expected " + field.getType() + " but found " + valueType);
            }
        }

        if (initialized.size() != fields.size()) {
            throw new SemanticException("Not all fields of struct '" + structType + "' were initialized.");
        }
    }

    private String analyzeAssignmentTarget(Expression expression) {
        if (expression instanceof VariableExpression) return expression.accept(this);
        if (expression instanceof ArrayAccessExpression arrayAccess) return arrayAccess.accept(this);
        if (expression instanceof MemberAccessExpression memberAccess) return memberAccess.accept(this);

        throw new SemanticException("Expression cannot be used as assignment target.");
    }

    private void validateAssignmentTarget(Expression expression) {
        analyzeAssignmentTarget(expression);
    }

    private Symbol resolveArraySymbol(Expression expression) {
        if (expression instanceof VariableExpression variable) {
            Symbol symbol = currentScope.resolve(variable.getName());
            if (symbol != null && symbol.getKind() == SymbolKind.ARRAY) return symbol;
        }

        return null;
    }

    private String analyzeArrayMemberAccess(MemberAccessExpression node) {
        String objectType = node.getObject().accept(this);
        StructDeclaration struct = structs.get(objectType);

        if (struct == null) throw new SemanticException("Type '" + objectType + "' is not a struct.");

        StructField field = findStructField(struct, node.getMember());

        if (field == null) throw new SemanticException("Struct '" + objectType + "' has no field '" + node.getMember() + "'.");
        if (!field.isArray()) throw new SemanticException("Field '" + node.getMember() + "' is not an array.");

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

    private String analyzeBinaryExpression(BinaryOperator operator, String left, String right) {
        if (!TypeSystem.isPrimitive(left) || !TypeSystem.isPrimitive(right)) throw new SemanticException("Only primitive values can be operated.");

        boolean hasStringType = left.equals(TypeSystem.TEXTUM) || right.equals(TypeSystem.TEXTUM);
        boolean hasBooleanType = left.equals(TypeSystem.BOOLEAN) || right.equals(TypeSystem.BOOLEAN);
        return switch (operator) {
            case ADD -> {
                if (hasStringType) yield TypeSystem.TEXTUM;
                yield TypeSystem.promote(left, right);
            }

            case SUBTRACT, MULTIPLY, DIVIDE -> {
                if (hasStringType) throw new SemanticException("Operator " + operator + " cannot be used with textum.");
                if (hasBooleanType) throw new SemanticException("Arithmetic operators require numeric values.");
                yield TypeSystem.promote(left, right);
            }

            case LESS, LESS_EQUAL, GREATER, GREATER_EQUAL -> {
                if (hasStringType) throw new SemanticException("Relational operators cannot be used with textum.");
                if (hasBooleanType) throw new SemanticException("Relational operators require numeric values.");
                yield TypeSystem.BOOLEAN;
            }

            case EQUAL, NOT_EQUAL -> {
                if (!areComparable(left, right)) throw new SemanticException("Cannot compare " + left + " with " + right);
                yield TypeSystem.BOOLEAN;
            }

            case AND, OR -> {
                if (!left.equals(TypeSystem.BOOLEAN) || !right.equals(TypeSystem.BOOLEAN)) throw new SemanticException("Logical operators require boolean operands.");
                yield TypeSystem.BOOLEAN;
            }
        };
    }

    private boolean areComparable(String left, String right) {
        if (left.equals(right)) return true;
        if (TypeSystem.isPrimitive(left) && TypeSystem.isPrimitive(right)) return TypeSystem.canAssign(left, right) || TypeSystem.canAssign(right, left);
        return false;
    }

    private String analyzeUnaryExpression(UnaryOperator operator, String type) {
        boolean isNotNumeric = !TypeSystem.NUMERUS.equals(type) && !TypeSystem.DECIMALIS.equals(type);
        return switch (operator) {
            case NOT -> {
                if (!TypeSystem.BOOLEAN.equals(type)) throw new SemanticException("Operator 'non' requires a boolean.");
                yield TypeSystem.BOOLEAN;
            }

            case NEGATE -> {
                if (isNotNumeric) throw new SemanticException("Unary '-' requires a numeric value.");
                yield type;
            }

            case POST_INCREMENT, POST_DECREMENT -> {
                if (isNotNumeric) throw new SemanticException("Increment/decrement requires a numeric value.");
                yield type;
            }
        };
    }

    private void requireBoolean(Expression expression, String context) {
        String type = expression.accept(this);
        if (!TypeSystem.BOOLEAN.equals(type)) throw new SemanticException(context + " condition must be boolean, found " + type);
    }

    private void validateTypeExists(String type) {
        if (TypeSystem.isPrimitive(type)) return;
        if (structs.containsKey(type)) return;
        throw new SemanticException("Unknown type '" + type + "'.");
    }

    private Integer evaluateConstantInteger(Expression expression) {
        if (expression instanceof NumberLiteral number) return number.getValue();
        return null;
    }
}