package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" : ");

        value.toPigLatin(writer, indent);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
