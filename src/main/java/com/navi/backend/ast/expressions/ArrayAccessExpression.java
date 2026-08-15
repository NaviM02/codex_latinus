package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArrayAccessExpression extends Expression {
    private Expression array;
    private Expression index;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(array, index);
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        array.toPigLatin(sb, indent);
        sb.append("[");
        index.toPigLatin(sb, indent);
        sb.append("]");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
