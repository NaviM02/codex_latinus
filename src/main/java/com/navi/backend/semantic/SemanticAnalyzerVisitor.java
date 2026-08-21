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
import com.navi.backend.semantic.errors.SemanticErrors;
import com.navi.backend.semantic.errors.SemanticException;

import java.util.*;

public class SemanticAnalyzerVisitor implements AstVisitor<String> {
    private final SymbolTable symbolTable;
    private FunctionDeclaration currentFunction;
    private int loopDepth = 0;

    // execution(?
    private final ValueEvaluator valueEvaluator;

    public SemanticAnalyzerVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.valueEvaluator = new ValueEvaluator(symbolTable.getCurrentScope());
    }

    public void analyze(Program program) {
        program.accept(this);
    }

    @Override
    public String visit(Program node) {
        if (node.getGlobalVariables() != null) {
            try {
                node.getGlobalVariables().accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
            }
        }

        if (node.getFunctions() != null) {
            for (FunctionDeclaration function : node.getFunctions()) {
                try {
                    function.accept(this);
                } catch (SemanticException e) {
                    SemanticErrors.reportError(e);
                }
            }
        }

        symbolTable.setCurrentScope(symbolTable.getGlobalScope());
        valueEvaluator.setCurrentScope(symbolTable.getCurrentScope());

        if (node.getMainStatements() != null) {
            for (Statement statement : node.getMainStatements()) {
                try {
                    statement.accept(this);
                } catch (SemanticException e) {
                    SemanticErrors.reportError(e);
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
                SemanticErrors.reportError(e);
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
                SemanticErrors.reportError(e);
            }
        }

        return null;
    }

    @Override
    public String visit(FunctionDeclaration node) {
        Scope previousScope = symbolTable.getCurrentScope();
        Scope functionScope = symbolTable.getFunctionScope(node.getName());

        if (functionScope == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Scope not found for function '" + node.getName() + "'.");
        }

        currentFunction = node;
        symbolTable.setCurrentScope(functionScope);
        valueEvaluator.setCurrentScope(symbolTable.getCurrentScope());

        try {
            if (node.getBody() != null) {
                node.getBody().accept(this);
            }
        } finally {
            currentFunction = null;
            symbolTable.setCurrentScope(previousScope);
            valueEvaluator.setCurrentScope(symbolTable.getCurrentScope());
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
        validateTypeExists(node.getType(), node.getLine(), node.getColumn());

        if (node.getInitializer() != null) {
            String valueType = analyzeInitializer(node.getInitializer(), node.getType());

            if (!TypeSystem.canAssign(node.getType(), valueType)) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Cannot assign " + valueType + " to variable '" + node.getName() + "' of type " + node.getType());
            }

            Object value = valueEvaluator.evaluateInitializer(node.getInitializer());
            Symbol symbol = symbolTable.resolve(node.getName());
            if (symbol != null) symbol.setValue(value);
        }
        return null;
    }

    @Override
    public String visit(ArrayDeclaration node) {
        validateTypeExists(node.getType(), node.getLine(), node.getColumn());
        String sizeType = node.getSize().accept(this);

        if (!TypeSystem.NUMERUS.equals(sizeType)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array size must be " + TypeSystem.NUMERUS + ".");
        }

        if (node.getInitializer() != null) {
            for (Expression expression : node.getInitializer().getValues()) {
                String valueType = expression.accept(this);

                if (!TypeSystem.canAssign(node.getType(), valueType)) {
                    throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Invalid value in array '" + node.getName() + "'. Expected " + node.getType() + " but found " + valueType);
                }
            }

            Integer size = evaluateConstantInteger(node.getSize());

            if (size != null && node.getInitializer().getValues().size() > size) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array '" + node.getName() + "' has " + node.getInitializer().getValues().size() + " initializers but its size is " + size);
            }
        }

        if (node.getSize() instanceof NumberLiteral sizeLiteral && node.getInitializer() != null) {
            int expectedSize = sizeLiteral.getValue();
            int actualSize = node.getInitializer().getValues().size();

            if (expectedSize != actualSize) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array initializer size mismatch. Expected " + expectedSize + " elements, but found " + actualSize + ".");
            }
        }
        return null;
    }

    @Override
    public String visit(ArrayInitializer node) {
        if (node.getValues() == null || node.getValues().isEmpty()) return "null";
        String firstElementType = node.getValues().get(0).accept(this);

        for (int i = 1; i < node.getValues().size(); i++) {
            String currentType = node.getValues().get(i).accept(this);
            if (!firstElementType.equals(currentType)) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() +
                        " ERROR: Heterogeneous array elements. Expected '" + firstElementType + "' but found '" + currentType + "'.");
            }
        }

        return firstElementType;
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
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Cannot assign " + valueType + " to " + targetType);
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
                SemanticErrors.reportError(e);
            }
        }

        return null;
    }

    @Override
    public String visit(BreakStatement node) {
        if (loopDepth == 0) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " 'break' can only be used inside a loop.");
        }
        return null;
    }

    @Override
    public String visit(ContinueStatement node) {
        if (loopDepth == 0) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " 'continue' can only be used inside a loop.");
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
            SemanticErrors.reportError(e);
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
        Scope previousScope = symbolTable.getCurrentScope();
        String forName = node.getLine() + ":" + node.getColumn();
        Scope forScope = symbolTable.getBlockScope(forName);

        if (forScope == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Scope not found for 'per' statement.");
        }

        symbolTable.setCurrentScope(forScope);
        valueEvaluator.setCurrentScope(symbolTable.getCurrentScope());

        try {
            if (node.getInitializer() != null) node.getInitializer().accept(this);
            requireBoolean(node.getCondition(), "per");
            if (node.getUpdate() != null) node.getUpdate().accept(this);
            loopDepth++;

            try {
                if (node.getBlock() != null) node.getBlock().accept(this);
            } finally {
                loopDepth--;
            }

        } finally {
            symbolTable.setCurrentScope(previousScope);
            valueEvaluator.setCurrentScope(symbolTable.getCurrentScope());
        }

        return null;
    }

    @Override
    public String visit(FunctionCallStatement node) {
        String functionName;

        if (node.getCallee() instanceof VariableExpression varExpr) {
            functionName = varExpr.getName();
        } else {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Expression is not a callable function.");
        }

        Symbol functionSymbol = symbolTable.resolve(functionName);

        if (functionSymbol == null || functionSymbol.getKind() != SymbolKind.FUNCTION) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Function '" + functionName + "' is not declared.");
        }

        List<String> expectedParamTypes = functionSymbol.getParameterTypes();
        List<Expression> providedArguments = node.getArguments();

        if (expectedParamTypes.size() != providedArguments.size()) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() +
                    " Function '" + functionName + "' expects " + expectedParamTypes.size() +
                    " arguments, but " + providedArguments.size() + " were provided.");
        }

        for (int i = 0; i < providedArguments.size(); i++) {
            String expectedType = expectedParamTypes.get(i);
            String actualType = providedArguments.get(i).accept(this);

            if (!expectedType.equals(actualType)) {
                throw new SemanticException("Line " + providedArguments.get(i).getLine() + ":" + providedArguments.get(i).getColumn() +
                        " Type mismatch in function '" + functionName + "' at argument " + (i + 1) +
                        ". Expected '" + expectedType + "', but got '" + actualType + "'.");
            }
        }

        return TypeSystem.VOID;
    }

    @Override
    public String visit(IfStatement node) {
        try {
            requireBoolean(node.getCondition(), "'si'");
        } catch (SemanticException e) {
            SemanticErrors.reportError(e);
        }

        node.getThenBlock().accept(this);

        for (ElseIfStatement elseIf : node.getElseIfStatements()) {
            try {
                elseIf.accept(this);
            } catch (SemanticException e) {
                SemanticErrors.reportError(e);
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
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Increment/decrement requires a numeric target.");
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
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Return statement outside a function.");
        }

        String expectedType = currentFunction.getReturnType();
        Expression expression = node.getExpression();

        if (TypeSystem.VOID.equals(expectedType)) {
            if (expression != null) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Void function cannot return a value.");
            }

            return null;
        }

        if (expression == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Function '" + currentFunction.getName() + "' must return a value of type " + expectedType);
        }

        String actualType = expression.accept(this);

        if (!TypeSystem.canAssign(expectedType, actualType)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Function '" + currentFunction.getName() + "' must return " + expectedType + " but found " + actualType);
        }

        return null;
    }

    @Override
    public String visit(WhileStatement node) {
        try {
            requireBoolean(node.getCondition(), "dum");
        } catch (SemanticException e) {
            SemanticErrors.reportError(e);
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
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array index must be " + TypeSystem.NUMERUS + ".");
        }

        Expression arrayExpression = node.getArray();

        /*
         * Case of an array used inside a struct initializer:
         * series animales : Animal
         * animales: Animal[7]
         *
         * Here "Animal[7]" represents a structure type initialization
         * with size 7, not access to an existing array variable.
         */
        if (arrayExpression instanceof VariableExpression variable) {
            if (symbolTable.getStructScope(variable.getName()) != null) {
                Integer indexValue = evaluateConstantInteger(node.getIndex());
                if (indexValue != null && indexValue < 0) {
                    throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array size cannot be negative (" + indexValue + ").");
                }
                return variable.getName();
            }
        }

        /*
         * Normal case:
         * variableArray[1]
         */
        Symbol arraySymbol = resolveArraySymbol(arrayExpression);

        if (arraySymbol != null) {
            if (arraySymbol.getKind() != SymbolKind.ARRAY) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " '" + arraySymbol.getName() + "' is not an array.");
            }

            Integer indexValue = evaluateConstantInteger(node.getIndex());
            if (indexValue != null) {
                Integer maxSize = arraySymbol.getArraySize();

                if (indexValue < 0) {
                    throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Array index cannot be negative (" + indexValue + ").");
                }

                if (maxSize != null && indexValue >= maxSize) {
                    throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() +
                            " Array index out of bounds. Index " + indexValue + " is invalid for size " + maxSize + ".");
                }
            }
            return arraySymbol.getType();
        }

        /*
         * Array that belongs to a structure:
         * mi_selva.animales[1]
         */
        if (arrayExpression instanceof MemberAccessExpression member) {
            return analyzeArrayMemberAccess(member);
        }

        /*
         * Error handling for undeclared identifiers used as arrays
         */
        if (arrayExpression instanceof VariableExpression variable) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " ERROR: Variable or Struct '" + variable.getName() + "' is not declared.");
        }

        throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Expression is not an array.");
    }

    @Override
    public String visit(BinaryExpression node) {
        String left = node.getLeft().accept(this);
        String right = node.getRight().accept(this);

        return analyzeBinaryExpression(node, left, right);
    }

    @Override
    public String visit(FunctionCallExpression node) {
        if (!(node.getCallee() instanceof VariableExpression variable)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Invalid function call.");
        }

        String functionName = variable.getName();
        Symbol function = symbolTable.resolve(functionName);

        if (function == null || function.getKind() != SymbolKind.FUNCTION) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Function '" + functionName + "' is not declared.");
        }

        List<Expression> arguments = node.getArguments();
        List<String> parameters = function.getParameterTypes();

        if (arguments.size() != parameters.size()) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Function '" + functionName + "' expects " + parameters.size() + " arguments but got " + arguments.size());
        }

        for (int i = 0; i < arguments.size(); i++) {
            String argumentType = arguments.get(i).accept(this);
            String parameterType = parameters.get(i);

            if (!TypeSystem.canAssign(parameterType, argumentType)) {
                throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Invalid argument " + (i + 1) + " in function '" + functionName + "'. Expected " + parameterType + " but found " + argumentType);
            }
        }

        return function.getType();
    }

    @Override
    public String visit(MemberAccessExpression node) {
        String objectType = node.getObject().accept(this);
        if (TypeSystem.isPrimitive(objectType)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() +
                    " Cannot access member '" + node.getMember() + "' on primitive type '" + objectType + "'.");
        }

        Scope structScope = symbolTable.getStructScope(objectType);
        if (structScope == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Type '" + objectType + "' is undefined or not a valid struct.");
        }

        Symbol fieldSymbol = structScope.resolve(node.getMember());

        if (fieldSymbol == null || (fieldSymbol.getKind() != SymbolKind.FIELD && fieldSymbol.getKind() != SymbolKind.ARRAY)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Struct '" + objectType + "' has no field '" + node.getMember() + "'.");
        }

        return fieldSymbol.getType();
    }

    @Override
    public String visit(UnaryExpression node) {
        String type = node.getExpression().accept(this);

        if (node.getOperator() == UnaryOperator.POST_INCREMENT || node.getOperator() == UnaryOperator.POST_DECREMENT) {
            validateAssignmentTarget(node.getExpression());
        }

        return analyzeUnaryExpression(node, type);
    }

    @Override
    public String visit(VariableExpression node) {
        Symbol symbol = symbolTable.resolve(node.getName());

        if (symbol == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Variable '" + node.getName() + "' is not declared.");
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

    private String analyzeInitializer(Initializer initializer, String expectedType) {
        if (initializer instanceof ExpressionInitializer expression) {
            return expression.getExpression().accept(this);
        }

        if (initializer instanceof StructInitializer structInitializer) {
            analyzeStructInitializer(structInitializer, expectedType);
            return expectedType;
        }

        throw new SemanticException("Line " + initializer.getLine() + ":" + initializer.getColumn() + " Unsupported initializer: " + initializer.getClass().getSimpleName());
    }

    private void analyzeStructInitializer(StructInitializer initializer, String structType) {
        Scope structScope = symbolTable.getStructScope(structType);

        if (structScope == null) {
            throw new SemanticException("Line " + initializer.getLine() + ":" + initializer.getColumn() + " Struct '" + structType + "' does not exist.");
        }

        Set<String> initialized = new HashSet<>();

        for (StructFieldInitializer fieldInitializer : initializer.getFields()) {
            String fieldName = fieldInitializer.getName();

            Symbol fieldSymbol = structScope.resolve(fieldName);
            if (fieldSymbol == null || (fieldSymbol.getKind() != SymbolKind.FIELD && fieldSymbol.getKind() != SymbolKind.ARRAY)) {
                throw new SemanticException("Line " + fieldInitializer.getLine() + ":" + fieldInitializer.getColumn() + " Field '" + fieldName + "' does not exist in struct '" + structType + "'.");
            }

            if (!initialized.add(fieldName)) {
                throw new SemanticException("Line " + fieldInitializer.getLine() + ":" + fieldInitializer.getColumn() + " Field '" + fieldName + "' is initialized more than once.");
            }

            String valueType = analyzeInitializer(fieldInitializer.getValue(), fieldSymbol.getType());

            if (!TypeSystem.canAssign(fieldSymbol.getType(), valueType)) {
                throw new SemanticException("Line " + fieldInitializer.getLine() + ":" + fieldInitializer.getColumn() +
                        " Invalid type for field '" + fieldName + "'. Expected " + fieldSymbol.getType() + " but found " + valueType);
            }
        }

        long totalFieldsInStruct = structScope.getSymbols().values().stream()
                .filter(sym -> sym.getKind() == SymbolKind.FIELD || sym.getKind() == SymbolKind.ARRAY)
                .count();

        if (initialized.size() != totalFieldsInStruct) {
            throw new SemanticException("Line " + initializer.getLine() + ":" + initializer.getColumn() + " Not all fields of struct '" + structType + "' were initialized.");
        }
    }

    private String analyzeAssignmentTarget(Expression expression) {
        if (expression instanceof VariableExpression) return expression.accept(this);
        if (expression instanceof ArrayAccessExpression arrayAccess) return arrayAccess.accept(this);
        if (expression instanceof MemberAccessExpression memberAccess) return memberAccess.accept(this);

        throw new SemanticException("Line " + expression.getLine() + ":" + expression.getColumn() + " Expression cannot be used as assignment target.");
    }

    private void validateAssignmentTarget(Expression expression) {
        analyzeAssignmentTarget(expression);
    }

    private Symbol resolveArraySymbol(Expression expression) {
        if (expression instanceof VariableExpression variable) {
            Symbol symbol = symbolTable.resolve(variable.getName());
            if (symbol != null && symbol.getKind() == SymbolKind.ARRAY) return symbol;
        }

        return null;
    }

    private String analyzeArrayMemberAccess(MemberAccessExpression node) {
        String objectType = node.getObject().accept(this);
        Scope structScope = symbolTable.getStructScope(objectType);

        if (structScope == null) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Type '" + objectType + "' is not a struct.");
        }

        Symbol fieldSymbol = structScope.resolve(node.getMember());

        if (fieldSymbol == null || (fieldSymbol.getKind() != SymbolKind.FIELD && fieldSymbol.getKind() != SymbolKind.ARRAY)) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Struct '" + objectType + "' has no field '" + node.getMember() + "'.");
        }

        if (fieldSymbol.getKind() != SymbolKind.ARRAY) {
            throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Field '" + node.getMember() + "' is not an array.");
        }

        return fieldSymbol.getType();
    }


    private String analyzeBinaryExpression(BinaryExpression node, String left, String right) {
        BinaryOperator operator = node.getOperator();
        if (!TypeSystem.isPrimitive(left) || !TypeSystem.isPrimitive(right)) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Only primitive values can be operated.");

        boolean hasStringType = left.equals(TypeSystem.TEXTUM) || right.equals(TypeSystem.TEXTUM);
        boolean hasBooleanType = left.equals(TypeSystem.BOOLEAN) || right.equals(TypeSystem.BOOLEAN);
        return switch (operator) {
            case ADD -> {
                if (hasStringType) yield TypeSystem.TEXTUM;
                yield TypeSystem.promote(left, right);
            }

            case SUBTRACT, MULTIPLY, DIVIDE -> {
                if (hasStringType) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Operator " + operator + " cannot be used with " + TypeSystem.TEXTUM + ".");
                if (hasBooleanType) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Arithmetic operators require numeric values.");
                yield TypeSystem.promote(left, right);
            }

            case LESS, LESS_EQUAL, GREATER, GREATER_EQUAL -> {
                if (hasStringType) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Relational operators cannot be used with " + TypeSystem.TEXTUM + ".");
                if (hasBooleanType) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Relational operators require numeric values.");
                yield TypeSystem.BOOLEAN;
            }

            case EQUAL, NOT_EQUAL -> {
                if (!areComparable(left, right)) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Cannot compare " + left + " with " + right);
                yield TypeSystem.BOOLEAN;
            }

            case AND, OR -> {
                if (!left.equals(TypeSystem.BOOLEAN) || !right.equals(TypeSystem.BOOLEAN)) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Logical operators require boolean operands.");
                yield TypeSystem.BOOLEAN;
            }
        };
    }

    private boolean areComparable(String left, String right) {
        if (left.equals(right)) return true;
        if (TypeSystem.isPrimitive(left) && TypeSystem.isPrimitive(right)) return TypeSystem.canAssign(left, right) || TypeSystem.canAssign(right, left);
        return false;
    }

    private String analyzeUnaryExpression(UnaryExpression node, String type) {
        UnaryOperator operator = node.getOperator();
        boolean isNotNumeric = !TypeSystem.NUMERUS.equals(type) && !TypeSystem.DECIMALIS.equals(type);
        return switch (operator) {
            case NOT -> {
                if (!TypeSystem.BOOLEAN.equals(type)) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Operator 'non' requires a boolean.");
                yield TypeSystem.BOOLEAN;
            }

            case NEGATE -> {
                if (isNotNumeric) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Unary '-' requires a numeric value.");
                yield type;
            }

            case POST_INCREMENT, POST_DECREMENT -> {
                if (isNotNumeric) throw new SemanticException("Line " + node.getLine() + ":" + node.getColumn() + " Increment/decrement requires a numeric value.");
                yield type;
            }
        };
    }

    private void requireBoolean(Expression expression, String context) {
        String type = expression.accept(this);
        if (!TypeSystem.BOOLEAN.equals(type)) throw new SemanticException("Line " + expression.getLine() + ":" + expression.getColumn() + " " + context + " condition must be boolean, found " + type);
    }

    private void validateTypeExists(String type, int line, int column) {
        if (TypeSystem.isPrimitive(type)) return;
        if (symbolTable.getStructScope(type) != null) return;
        throw new SemanticException("Line " + line + ":" + column + " Unknown type '" + type + "'.");
    }

    private Integer evaluateConstantInteger(Expression expression) {
        if (expression == null) return null;
        if (expression instanceof NumberLiteral number) return number.getValue();

        if (expression instanceof UnaryExpression unary) {
            if (unary.getOperator() == UnaryOperator.NEGATE) {
                Integer innerValue = evaluateConstantInteger(unary.getExpression());
                if (innerValue != null) return -innerValue;
            }
        }
        return null;
    }
}