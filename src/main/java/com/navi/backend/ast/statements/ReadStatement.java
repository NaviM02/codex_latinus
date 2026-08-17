package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ReadStatement extends Statement {
    private Expression target;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(target);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        target.toPigLatin(writer, indent);
        writer.append(" ");
        writer.appendKeyword("%OINK_OINK\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
