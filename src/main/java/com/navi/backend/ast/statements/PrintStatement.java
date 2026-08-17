package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PrintStatement extends Statement {
    private List<Expression> expressions;

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
