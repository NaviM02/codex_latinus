package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class StructField extends AstNode {
    private final String name;
    private final String type;
    private final boolean isArray;

    public StructField(int line, int column, String name, String type, boolean isArray) {
        super(line, column);
        this.name = name;
        this.type = type;
        this.isArray = isArray;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "StructField: " + name + " : " + type;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        indent(writer, indent);
        writer.appendKeyword(PigLatinRules.translateKeyword("esto"));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));

        if (isArray) writer.appendSymbol("[]");

        writer.append(" : ");
        writer.appendType(PigLatinRules.translateType(type));

        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
