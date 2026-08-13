package com.navi.backend.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArrayAccessExpression extends Expression {
    private Expression array;
    private Expression index;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        array.toPigLatin(sb, indent);
        sb.append("[");
        index.toPigLatin(sb, indent);
        sb.append("]");
    }
}
