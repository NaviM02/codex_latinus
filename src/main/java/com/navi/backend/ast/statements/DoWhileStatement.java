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
public class DoWhileStatement extends Statement {
    private BlockStatement block;
    private Expression condition;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(block, condition);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("facere"));
        writer.append(" {\n");
        block.toPigLatin(writer, indent + 1);
        writer.append("\n}");
        writer.appendKeyword(PigLatinRules.translateKeyword("dum"));

        writer.append(" (");
        condition.toPigLatin(writer, indent);
        writer.append(");");
        writer.append("\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
