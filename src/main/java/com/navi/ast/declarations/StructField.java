package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StructField extends AstNode {
    private String name;
    private String type;
    private boolean isArray;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("esto"));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));

        if (isArray) sb.append("[]");

        sb.append(" : ");
        sb.append(PigLatinRules.translateType(type));

        sb.append(";\n");
    }
}
