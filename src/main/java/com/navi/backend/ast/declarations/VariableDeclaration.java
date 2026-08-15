package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class VariableDeclaration extends Declaration {
    private String name;
    private String type;
    private Initializer initializer;

    @Override
    public List<? extends AstNode> getChildren() {
        if (initializer == null) {
            return List.of();
        }

        return List.of(initializer);
    }

    @Override
    public String getNodeLabel() {
        return "VariableDeclaration: " + name + " : " + type;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("esto"));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append(" : ");
        sb.append(PigLatinRules.translateType(type));

        if (initializer != null) {
            sb.append(" ");
            initializer.toPigLatin(sb, indent);
        }

        sb.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
