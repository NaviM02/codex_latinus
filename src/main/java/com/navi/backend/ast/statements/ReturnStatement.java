package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
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
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("reddere"));

        if (expression != null) {
            sb.append(" ");
            expression.toPigLatin(sb, indent);
        }

        sb.append(";\n");
    }
}
