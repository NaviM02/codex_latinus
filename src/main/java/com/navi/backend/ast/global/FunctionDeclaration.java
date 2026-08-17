package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionDeclaration extends AstNode {
    private String name;
    private String returnType;
    private List<Parameter> parameters;
    private FunctionBody body;

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new ArrayList<>();

        if (parameters != null) {
            children.addAll(parameters);
        }

        if (body != null) {
            children.add(body);
        }

        return children;
    }

    @Override
    public String getNodeLabel() {
        return "FunctionDeclaration: " + returnType + " " + name;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("ratio"));
        writer.append(" ");
        writer.appendType(PigLatinRules.translateType(returnType));
        writer.append(" ");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(name));
        writer.append("(");

        for (int i = 0; i < parameters.size(); i++) {
            if (i > 0) writer.append(", ");
            parameters.get(i).toPigLatin(writer, indent);
        }

        writer.append(") ");
        body.toPigLatin(writer, indent);

        writer.append(" ");
        writer.appendKeyword(PigLatinRules.translateKeyword("finis"));
        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
