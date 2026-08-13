package com.navi.backend.ast.declarations;

import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructDeclaration extends Declaration {
    private String name;
    private List<StructField> fields;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("estructura"));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" {\n");

        for (StructField field : fields) {
            field.toPigLatin(sb, indent);
        }

        sb.append("}\n");
    }
}
