package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ElseIfStatement extends AstNode {
    private Expression condition;
    private BlockStatement block;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(condition, block);
    }

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
