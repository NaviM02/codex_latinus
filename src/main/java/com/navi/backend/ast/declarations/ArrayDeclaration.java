package com.navi.backend.ast.declarations;

import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArrayDeclaration extends Declaration {
    private String name;
    private Expression size;
    private String type;
    private ArrayInitializer initializer;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("esto"));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" : ");
        sb.append(PigLatinRules.translateType(type));

        sb.append("[");
        size.toPigLatin(sb, indent);
        sb.append("]");

        if (initializer != null) {
            sb.append(" ");
            initializer.toPigLatin(sb, indent);
        }

        sb.append(";\n");
    }
}
