package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.VariableDeclaration;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;

import java.util.List;

@Getter
public class ForStatement extends Statement {
    private final VariableDeclaration initializer;
    private final Expression condition;
    private final Expression update;
    private final BlockStatement block;

    public ForStatement(int line, int column, VariableDeclaration initializer, Expression condition, Expression update, BlockStatement block) {
        super(line, column);
        this.initializer = initializer;
        this.condition = condition;
        this.update = update;
        this.block = block;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(initializer, condition, update, block);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("per"));
        writer.append(" (");
        initializer.toPigLatin(writer, indent);
        writer.append(" ");
        condition.toPigLatin(writer, indent);
        writer.append("; ");
        update.toPigLatin(writer, indent);
        writer.append(")");

        writer.append(" {\n");
        block.toPigLatin(writer, indent + 1);
        writer.append("\n");
        indent(writer, indent);
        writer.append("}\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
