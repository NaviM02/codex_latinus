package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import com.navi.backend.translator.PigLatinRules;
import lombok.Getter;
import java.util.List;

@Getter
public class IfStatement extends Statement {
    private final Expression condition;
    private final BlockStatement thenBlock;
    private final List<ElseIfStatement> elseIfStatements;
    private final BlockStatement elseBlock;

    public IfStatement(int line, int column, Expression condition, BlockStatement thenBlock, List<ElseIfStatement> elseIfStatements, BlockStatement elseBlock) {
        super(line, column);
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseIfStatements = elseIfStatements;
        this.elseBlock = elseBlock;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new java.util.ArrayList<>();

        children.add(condition);
        children.add(thenBlock);

        if (elseIfStatements != null) {
            children.addAll(elseIfStatements);
        }

        if (elseBlock != null) {
            children.add(elseBlock);
        }

        return children;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.appendKeyword(PigLatinRules.translateKeyword("si"));
        writer.append(" (");
        condition.toPigLatin(writer, indent);
        writer.append(") {\n");
        thenBlock.toPigLatin(writer, indent + 1);
        indent(writer, indent);
        writer.append("}");

        for (ElseIfStatement elseIf : elseIfStatements) {
            elseIf.toPigLatin(writer, indent);
        }

        if (elseBlock != null) {
            writer.append(" ");
            writer.appendKeyword(PigLatinRules.translateKeyword("aliter"));
            writer.append(" {\n");
            elseBlock.toPigLatin(writer, indent + 1);
            indent(writer, indent);
            writer.append("\n}");
        }

        writer.append(" ");
        writer.appendKeyword(PigLatinRules.translateKeyword("finis"));
        writer.append(";\n\n");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
