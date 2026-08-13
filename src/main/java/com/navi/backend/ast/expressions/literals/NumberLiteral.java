package com.navi.backend.ast.expressions.literals;

import com.navi.backend.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NumberLiteral extends Expression {
    private int value;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(value);
    }
}
