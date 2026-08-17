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
public class StringLiteral extends Expression {
    private String value;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "StringLiteral: " + value;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendString("\"" + value + "\"");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
