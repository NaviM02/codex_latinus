package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class AssignmentStatement extends Statement {
    private Expression target;
    private Initializer initializer;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(target, initializer);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        target.toPigLatin(writer, indent);
        writer.append(" ");
        writer.appendOperator("=");
        writer.append(" ");
        initializer.toPigLatin(writer, indent);
        writer.append(";\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
