package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class VariableDeclaration extends Declaration {
    private final String name;
    private final String type;
    private final Initializer initializer;

    public VariableDeclaration(int line, int column, String name, String type, Initializer initializer) {
        super(line, column);
        this.name = name;
        this.type = type;
        this.initializer = initializer;
    }

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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("esto"));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" : ");
        writer.appendType(PigLatinRules.translateType(type));

        if (initializer != null) {
            writer.append(" ");
            initializer.toPigLatin(writer, indent);
        }

        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
