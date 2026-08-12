package com.navi.ast.expressions.literals;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StringLiteral extends Expression {
    private String value;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("\"").append(value).append("\"");
    }
}
