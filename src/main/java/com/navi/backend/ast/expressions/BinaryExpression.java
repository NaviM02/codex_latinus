package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        left.toPigLatin(writer, indent);
        writer.append(" ");
        writer.appendOperator(getOperatorText(operator));
        writer.append(" ");
        right.toPigLatin(writer, indent);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
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
