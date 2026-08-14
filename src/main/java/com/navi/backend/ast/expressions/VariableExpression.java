package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class VariableExpression extends Expression {
    private String name;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "VariableExpression: " + name;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateIdentifier(name));
    }
}
