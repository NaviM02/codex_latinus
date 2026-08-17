package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructField extends AstNode {
    private String name;
    private String type;
    private boolean isArray;

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
