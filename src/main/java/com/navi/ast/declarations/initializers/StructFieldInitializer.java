package com.navi.ast.declarations.initializers;

import com.navi.ast.AstNode;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StructFieldInitializer extends AstNode {
    private String name;
    private Initializer value;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" : ");

        value.toPigLatin(sb, indent);
    }
}
