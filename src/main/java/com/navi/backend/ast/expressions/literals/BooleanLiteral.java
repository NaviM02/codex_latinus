package com.navi.backend.ast.expressions.literals;

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
public class BooleanLiteral extends Expression {
    private boolean value;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of();
    }

    @Override
    public String getNodeLabel() {
        return "BooleanLiteral: " + value;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        String valueText = value ? "verum" : "falsus";
        writer.appendBoolean(PigLatinRules.translateKeyword(valueText));
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
