package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructFieldInitializer extends AstNode {
    private String name;
    private Initializer value;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(value);
    }

    @Override
    public String getNodeLabel() {
        return "StructFieldInitializer: " + name;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" : ");

        value.toPigLatin(sb, indent);
    }
}
