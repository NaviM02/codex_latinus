package com.navi.backend.ast.expressions.literals;

import com.navi.backend.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CharLiteral extends Expression {
    private char value;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("'").append(value).append("'");
    }
}
