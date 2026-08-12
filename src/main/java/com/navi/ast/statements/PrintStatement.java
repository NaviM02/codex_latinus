package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PrintStatement extends Statement {
    private List<Expression> expressions;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("%OINK ");

        for (int i = 0; i < expressions.size(); i++) {
            if (i > 0) sb.append(" %OINK ");
            expressions.get(i).toPigLatin(sb, indent);
        }

        sb.append(";\n");
    }
}
