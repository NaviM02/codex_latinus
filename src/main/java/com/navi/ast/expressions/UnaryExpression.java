package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UnaryExpression extends Expression {
    private UnaryOperator operator;
    private Expression expression;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        switch (operator) {
            case NOT -> {
                sb.append("non ");
                expression.toPigLatin(sb, indent);
            }
            case NEGATE -> {
                sb.append("-");
                expression.toPigLatin(sb, indent);
            }
            case POST_INCREMENT -> {
                expression.toPigLatin(sb, indent);
                sb.append("++");
            }
            case POST_DECREMENT -> {
                expression.toPigLatin(sb, indent);
                sb.append("--");
            }
        }
    }
}
