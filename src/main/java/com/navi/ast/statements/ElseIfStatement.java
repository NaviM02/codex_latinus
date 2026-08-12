package com.navi.ast.statements;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.Expression;
import com.navi.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ElseIfStatement extends AstNode {
    private Expression condition;
    private BlockStatement block;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(" ");
        sb.append(PigLatinRules.translateKeyword("aliter"));
        sb.append(" ");
        sb.append(PigLatinRules.translateKeyword("si"));

        sb.append(" (");
        condition.toPigLatin(sb, indent);
        sb.append(")");

        sb.append(" {\n");
        block.toPigLatin(sb, indent + 1);
        indent(sb, indent);
        sb.append("\n} ");
    }
}
