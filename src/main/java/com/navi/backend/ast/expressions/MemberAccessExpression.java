package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class MemberAccessExpression extends Expression {
    private final Expression object;
    private final String member;

    public MemberAccessExpression(int line, int column, Expression object, String member) {
        super(line, column);
        this.object = object;
        this.member = member;
    }

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
