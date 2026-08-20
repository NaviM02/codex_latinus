package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public class PrintStatement extends Statement {
    private final List<Expression> expressions;

    public PrintStatement(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return expressions;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword("%OINK");
        writer.append(" ");

        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) {
                writer.append(" ");
                writer.appendKeyword("%OINK");
                writer.append(" ");
            }
            expressions.get(i).toPigLatin(writer, indent);
        }

        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
