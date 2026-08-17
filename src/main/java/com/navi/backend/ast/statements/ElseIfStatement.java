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
public class ElseIfStatement extends AstNode {
    private Expression condition;
    private BlockStatement block;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(condition, block);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.append(" ");
        writer.appendKeyword(PigLatinRules.translateKeyword("aliter"));

        writer.append(" (");
        condition.toPigLatin(writer, indent);
        writer.append(")");

        writer.append(" {\n");
        block.toPigLatin(writer, indent + 1);
        indent(writer, indent);
        writer.append("\n} ");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
