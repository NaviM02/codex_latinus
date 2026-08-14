package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructInitializer extends Initializer {
    private List<StructFieldInitializer> fields;

    @Override
    public List<? extends AstNode> getChildren() {
        return fields;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("{");

        for (int i = 0; i < fields.size(); i++) {
            fields.get(i).toPigLatin(sb, indent);

            if (i < fields.size() - 1) sb.append(", ");
        }

        sb.append("}");
    }
}
