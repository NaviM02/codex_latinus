package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
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
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("%OINK ");

        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) sb.append(" %OINK ");
            expressions.get(i).toPigLatin(sb, indent);
        }

        sb.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
