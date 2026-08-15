package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MemberAccessExpression extends Expression {
    private Expression object;
    private String member;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(object);
    }

    @Override
    public String getNodeLabel() {
        return "MemberAccessExpression: " + member;
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        object.toPigLatin(sb, indent);
        sb.append(".");
        sb.append(PigLatinRules.translateIdentifier(member));
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
