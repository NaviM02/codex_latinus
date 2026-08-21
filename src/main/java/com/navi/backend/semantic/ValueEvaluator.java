package com.navi.backend.semantic;

import com.navi.backend.ast.declarations.ArrayInitializer;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.declarations.initializers.ExpressionInitializer;
import com.navi.backend.ast.declarations.initializers.StructInitializer;
import com.navi.backend.ast.expressions.*;
import com.navi.backend.ast.expressions.literals.*;
import com.navi.backend.semantic.errors.SemanticException;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
public class ValueEvaluator {
    private Scope currentScope;

    public ValueEvaluator(Scope currentScope) {
        this.currentScope = currentScope;
    }

    public Object evaluateInitializer(Initializer initializer) {
        if (initializer instanceof ExpressionInitializer expression) return evaluateExpression(expression.getExpression());
        if (initializer instanceof StructInitializer) return null;
        throw new SemanticException("Unsupported initializer: " + initializer.getClass().getSimpleName());
    }

    public Object evaluateExpression(Expression expression) {
        if (expression instanceof NumberLiteral number) return number.getValue();
        if (expression instanceof DecimalLiteral decimal) return decimal.getValue();
        if (expression instanceof CharLiteral character) return character.getValue();
        if (expression instanceof StringLiteral string) return string.getValue();
        if (expression instanceof BooleanLiteral bool) return bool.isValue();

        if (expression instanceof VariableExpression variable) {
            Symbol symbol = currentScope.resolve(variable.getName());
            if (symbol == null) {
                throw new SemanticException("Variable '" + variable.getName() + "' is not declared.");
            }

            // null means that the value cannot yet be determined during analysis.
            return symbol.getValue();
        }

        if (expression instanceof BinaryExpression binary) {
            Object left = evaluateExpression(binary.getLeft());
            Object right = evaluateExpression(binary.getRight());

            // If either value is unknown, the result is also unknown.
            if (left == null || right == null) return null;

            return evaluateBinaryExpression(binary.getOperator(), left, right);
        }

        if (expression instanceof UnaryExpression unary) {
            Object value = evaluateExpression(unary.getExpression());
            if (value == null) return null;
            return evaluateUnaryExpression(unary.getOperator(), value);
        }

        // A function call cannot be evaluated here without executing the entire function
        if (expression instanceof FunctionCallExpression) return null;

        if (expression instanceof ArrayAccessExpression) return null;

        throw new SemanticException("Cannot evaluate expression of type " + expression.getClass().getSimpleName());
    }

    private Object evaluateBinaryExpression(BinaryOperator operator, Object left, Object right) {
        return switch (operator) {
            case ADD -> {
                if (left instanceof String || right instanceof String) yield String.valueOf(left) + String.valueOf(right);
                if (left instanceof Integer l && right instanceof Integer r) yield l + r;
                if (left instanceof Number l && right instanceof Number r) yield l.doubleValue() + r.doubleValue();

                throw new SemanticException("Cannot add values of type " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
            }

            case SUBTRACT -> {
                if (left instanceof Integer l && right instanceof Integer r) yield l - r;
                if (left instanceof Number l && right instanceof Number r) yield l.doubleValue() - r.doubleValue();
                throw new SemanticException("Cannot subtract non-numeric values.");
            }

            case MULTIPLY -> {
                if (left instanceof Integer l && right instanceof Integer r) yield l * r;
                if (left instanceof Number l && right instanceof Number r) yield l.doubleValue() * r.doubleValue();

                throw new SemanticException("Cannot multiply non-numeric values.");
            }

            case DIVIDE -> {
                if (left instanceof Integer l && right instanceof Integer r) {
                    if (r == 0) throw new SemanticException("Division by zero.");
                    yield l / r;
                }

                if (left instanceof Number l && right instanceof Number r) {
                    if (r.doubleValue() == 0.0) throw new SemanticException("Division by zero.");
                    yield l.doubleValue() / r.doubleValue();
                }

                throw new SemanticException("Cannot divide non-numeric values.");
            }

            case LESS -> compareNumbers(left, right) < 0;

            case LESS_EQUAL -> compareNumbers(left, right) <= 0;

            case GREATER -> compareNumbers(left, right) > 0;

            case GREATER_EQUAL -> compareNumbers(left, right) >= 0;

            case EQUAL -> areValuesEqual(left, right);

            case NOT_EQUAL -> !areValuesEqual(left, right);

            case AND -> {
                if (!(left instanceof Boolean l) || !(right instanceof Boolean r)) throw new SemanticException("Logical operators require boolean values.");
                yield l && r;
            }

            case OR -> {
                if (!(left instanceof Boolean l) || !(right instanceof Boolean r)) throw new SemanticException("Logical operators require boolean values.");
                yield l || r;
            }
        };
    }

    private Object evaluateUnaryExpression(UnaryOperator operator, Object value) {
        return switch (operator) {
            case NOT -> {
                if (!(value instanceof Boolean booleanValue)) throw new SemanticException("Operator 'non' requires a boolean.");
                yield !booleanValue;
            }

            case NEGATE -> {
                if (value instanceof Integer integerValue) yield -integerValue;
                if (value instanceof Number numberValue) yield -numberValue.doubleValue();
                throw new SemanticException("Unary '-' requires a numeric value.");
            }

            case POST_INCREMENT, POST_DECREMENT -> value;
        };
    }

    public void assignValue(Expression target, Object value) {
        if (target instanceof VariableExpression variable) {
            Symbol symbol = currentScope.resolve(variable.getName());
            if (symbol == null) throw new SemanticException("Variable '" + variable.getName() + "' is not declared.");

            symbol.setValue(value);
            return;
        }

        if (target instanceof ArrayAccessExpression) return;
        if (target instanceof MemberAccessExpression) return;
        throw new SemanticException("Expression cannot be used as assignment target.");
    }

    private int compareNumbers(Object left, Object right) {
        if (!(left instanceof Number leftNumber) || !(right instanceof Number rightNumber)) {
            throw new SemanticException("Relational operators require numeric values.");
        }

        return Double.compare(leftNumber.doubleValue(), rightNumber.doubleValue());
    }

    private boolean areValuesEqual(Object left, Object right) {
        if (left == null || right == null) return left == right;

        if (left instanceof Number leftNumber && right instanceof Number rightNumber) {
            return Double.compare(leftNumber.doubleValue(), rightNumber.doubleValue()) == 0;
        }

        return left.equals(right);
    }
}