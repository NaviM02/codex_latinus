package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArrayInitializer extends AstNode {
    private List<Expression> values;

    @Override
    public List<? extends AstNode> getChildren() {
        return values;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("{");

        for (int i = 0; i < values.size(); i++) {
            values.get(i).toPigLatin(sb, indent);

            if (i < values.size() - 1) sb.append(", ");
        }

        sb.append("}");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
