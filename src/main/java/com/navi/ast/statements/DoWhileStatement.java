package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoWhileStatement extends Statement {
    private BlockStatement block;
    private Expression condition;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("facere"));
        sb.append(" {\n");
        block.toPigLatin(sb, indent + 1);
        sb.append("\n}");
        sb.append(PigLatinRules.translateKeyword("dum"));

        sb.append(" (");
        condition.toPigLatin(sb, indent);
        sb.append(");");
        sb.append("\n");
    }
}
