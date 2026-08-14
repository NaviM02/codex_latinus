package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.VariableDeclaration;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ForStatement extends Statement {
    private VariableDeclaration initializer;
    private Expression condition;
    private Expression update;
    private BlockStatement block;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(initializer, condition, update, block);
    }

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
