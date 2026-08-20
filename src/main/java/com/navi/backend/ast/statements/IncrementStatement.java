package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.expressions.UnaryOperator;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public class IncrementStatement extends Statement {
    private final Expression target;
    private final UnaryOperator operator;

    public IncrementStatement(int line, int column, Expression target, UnaryOperator operator) {
        super(line, column);
        this.target = target;
        this.operator = operator;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(target);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        target.toPigLatin(writer, indent);

        if (operator == UnaryOperator.POST_INCREMENT) {
            writer.appendOperator("++");
        } else {
            writer.appendOperator("--");
        }

        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}