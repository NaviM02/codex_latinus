package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionCallExpression extends Expression {
    private Expression callee;
    private List<Expression> arguments;

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new java.util.ArrayList<>();

        children.add(callee);
        children.addAll(arguments);

        return children;
    }

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
