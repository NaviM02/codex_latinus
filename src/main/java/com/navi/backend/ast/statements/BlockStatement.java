package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BlockStatement extends Statement {
    private final List<Statement> statements;

    @Override
    public List<? extends AstNode> getChildren() {
        return statements;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        for (Statement statement : statements) {
            if (statement instanceof IfStatement || statement instanceof WhileStatement
                    || statement instanceof ForStatement || statement instanceof DoWhileStatement) {
                writer.append("\n");
            }

            indent(writer, indent);
            statement.toPigLatin(writer, indent);
        }
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
