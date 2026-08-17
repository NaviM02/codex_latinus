package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Parameter extends AstNode {
    private String name;
    private String type;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "Parameter: " + name + " : " + type;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("esto"));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" : ");
        writer.appendType(PigLatinRules.translateType(type));
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
