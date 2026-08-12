package com.navi.ast.expressions.literals;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DecimalLiteral extends Expression {
    private double value;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(value);
    }
}
