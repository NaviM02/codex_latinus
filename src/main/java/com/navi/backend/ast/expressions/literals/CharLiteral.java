package com.navi.backend.ast.expressions.literals;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CharLiteral extends Expression {
    private char value;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "CharLiteral: " + value;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("'").append(value).append("'");
    }
}
