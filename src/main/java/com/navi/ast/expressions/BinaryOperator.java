package com.navi.ast.expressions;

public enum BinaryOperator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    EQUAL,
    NOT_EQUAL,
    LESS,
    LESS_EQUAL,
    GREATER,
    GREATER_EQUAL,
    AND,
    OR;

    public static BinaryOperator fromToken(String token) {
        return switch (token) {
            case "+" -> ADD;
            case "-" -> SUBTRACT;
            case "*" -> MULTIPLY;
            case "/" -> DIVIDE;
            case "==" -> EQUAL;
            case "!=" -> NOT_EQUAL;
            case "<" -> LESS;
            case "<=" -> LESS_EQUAL;
            case ">" -> GREATER;
            case ">=" -> GREATER_EQUAL;
            case "&&" -> AND;
            case "||" -> OR;
            default -> throw new IllegalArgumentException("invalid token: " + token);
        };
    }
}
