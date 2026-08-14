package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BinaryExpression extends Expression {
    private Expression left;
    private BinaryOperator operator;
    private Expression right;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(left, right);
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        left.toPigLatin(sb, indent);
        sb.append(" ");
        sb.append(getOperatorText(operator));
        sb.append(" ");
        right.toPigLatin(sb, indent);
    }

    private String getOperatorText(BinaryOperator operator) {
        return switch (operator) {
            case ADD -> "+";
            case SUBTRACT -> "-";
            case MULTIPLY -> "*";
            case DIVIDE -> "/";
            case EQUAL -> "==";
            case NOT_EQUAL -> "!=";
            case LESS -> "<";
            case LESS_EQUAL -> "<=";
            case GREATER -> ">";
            case GREATER_EQUAL -> ">=";
            case AND -> "&&";
            case OR -> "||";
        };
    }
}
