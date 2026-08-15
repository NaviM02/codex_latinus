package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.translator.PigLatinRules;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class WhileStatement extends Statement {
    private Expression condition;
    private BlockStatement block;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(condition, block);
    }

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append(PigLatinRules.translateKeyword("dum"));
        sb.append(" (");
        condition.toPigLatin(sb, indent);
        sb.append(")");

        sb.append(" {\n");
        block.toPigLatin(sb, indent + 1);
        sb.append("\n} ");
        sb.append(PigLatinRules.translateKeyword("finis"));
        sb.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
