package com.navi.backend.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionCallExpression extends Expression {
    private Expression callee;
    private List<Expression> arguments;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        callee.toPigLatin(sb, indent);
        sb.append("(");

        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) sb.append(", ");
            arguments.get(i).toPigLatin(sb, indent);
        }

        sb.append(")");
    }
}
