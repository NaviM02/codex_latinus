package com.navi.backend.ast.expressions.literals;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendChar("'" + value + "'");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
