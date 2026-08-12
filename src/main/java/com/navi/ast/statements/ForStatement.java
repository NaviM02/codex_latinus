package com.navi.ast.statements;

import com.navi.ast.declarations.VariableDeclaration;
import com.navi.ast.expressions.Expression;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ForStatement extends Statement {
    private VariableDeclaration initializer;
    private Expression condition;
    private Expression update;
    private BlockStatement block;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("per"));
        sb.append(" (");
        initializer.toPigLatin(sb, indent);
        sb.append(" ");
        condition.toPigLatin(sb, indent);
        sb.append("; ");
        update.toPigLatin(sb, indent);
        sb.append(")");

        sb.append(" {\n");
        block.toPigLatin(sb, indent + 1);
        sb.append("\n}");
    }
}
