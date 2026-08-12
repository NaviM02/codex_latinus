package com.navi.ast.expressions;

import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberAccessExpression extends Expression {
    private Expression object;
    private String member;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        object.toPigLatin(sb, indent);
        sb.append(".");
        sb.append(PigLatinRules.translateIdentifier(member));
    }
}
