package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class StructFieldInitializer extends AstNode {
    private final String name;
    private final Initializer value;

    public StructFieldInitializer(int line, int column, String name, Initializer value) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(value);
    }

    @Override
    public String getNodeLabel() {
        return "StructFieldInitializer: " + name;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        indent(writer, indent);
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" : ");

        value.toPigLatin(writer, indent);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
