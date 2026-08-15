package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
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
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("ratio"));
        sb.append(" ");
        sb.append(PigLatinRules.translateType(returnType));
        sb.append(" ");
        sb.append(PigLatinRules.translateIdentifier(name));
        sb.append("(");

        for (int i = 0; i < parameters.size(); i++) {
            if (i > 0) sb.append(", ");
            parameters.get(i).toPigLatin(sb, indent);
        }

        sb.append(") ");
        body.toPigLatin(sb, indent);

        sb.append(PigLatinRules.translateKeyword(" finis"));
        sb.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
