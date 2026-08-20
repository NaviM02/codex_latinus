package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public class UnaryExpression extends Expression {
    private final UnaryOperator operator;
    private final Expression expression;

    public UnaryExpression(int line, int column, UnaryOperator operator, Expression expression) {
        super(line, column);
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(expression);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        switch (operator) {
            case NOT -> {
                writer.appendOperator("non");
                writer.append(" ");
                expression.toPigLatin(writer, indent);
            }
            case NEGATE -> {
                writer.appendOperator("-");
                expression.toPigLatin(writer, indent);
            }
            case POST_INCREMENT -> {
                expression.toPigLatin(writer, indent);
                writer.appendOperator("++");
            }
            case POST_DECREMENT -> {
                expression.toPigLatin(writer, indent);
                writer.appendOperator("--");
            }
        }
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
