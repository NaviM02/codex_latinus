package com.navi.backend.ast.statements;

import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class IfStatement extends Statement {
    private Expression condition;
    private BlockStatement thenBlock;
    private List<ElseIfStatement> elseIfStatements;
    private BlockStatement elseBlock;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("si"));
        sb.append(" (");
        condition.toPigLatin(sb, indent);
        sb.append(")");
        sb.append(" {\n");
        thenBlock.toPigLatin(sb, indent + 1);
        indent(sb, indent);
        sb.append("}");

        for (ElseIfStatement elseIf : elseIfStatements) {
            elseIf.toPigLatin(sb, indent);
        }

        if (elseBlock != null) {
            sb.append(" ");
            sb.append(PigLatinRules.translateKeyword("aliter"));
            sb.append(" {\n");
            elseBlock.toPigLatin(sb, indent + 1);
            indent(sb, indent);
            sb.append("\n}");
        }

        sb.append(" ");
        sb.append(PigLatinRules.translateKeyword("finis"));
        sb.append(";\n\n");
    }
}
