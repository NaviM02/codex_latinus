package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.translator.PigLatinRules;
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
