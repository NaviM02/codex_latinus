package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReturnStatement extends Statement {
    private Expression expression;

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
