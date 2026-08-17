package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        object.toPigLatin(writer, indent);
        writer.append(".");
        writer.appendIdentifier(PigLatinRules.translateIdentifier(member));
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
