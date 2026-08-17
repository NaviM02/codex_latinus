package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArrayDeclaration extends Declaration {
    private String name;
    private Expression size;
    private String type;
    private ArrayInitializer initializer;

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new java.util.ArrayList<>();

        if (size != null) {
            children.add(size);
        }

        if (initializer != null) {
            children.add(initializer);
        }

        return children;
    }

    @Override
    public String getNodeLabel() {
        return "ArrayDeclaration: " + name + " : " + type;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("esto"));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append(" : ");
        writer.appendType(PigLatinRules.translateType(type));

        writer.append("[");
        size.toPigLatin(writer, indent);
        writer.append("]");

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
