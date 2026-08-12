package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Parameter extends AstNode {
    private String name;
    private String type;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("esto"));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" : ");
        sb.append(PigLatinRules.translateType(type));
    }
}
