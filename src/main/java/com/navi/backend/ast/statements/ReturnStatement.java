package com.navi.backend.ast.statements;

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
public class ReturnStatement extends Statement {
    private Expression expression;

    @Override
    public List<? extends AstNode> getChildren() {
        if (expression == null) {
            return List.of();
        }

        return List.of(expression);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("reddere"));

        if (expression != null) {
            writer.append(" ");
            expression.toPigLatin(writer, indent);
        }

        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
