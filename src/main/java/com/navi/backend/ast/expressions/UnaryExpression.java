package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class UnaryExpression extends Expression {
    private UnaryOperator operator;
    private Expression expression;

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
