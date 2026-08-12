package com.navi.ast.statements;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BlockStatement extends Statement {
    private final List<Statement> statements;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        for (Statement statement : statements) {
            if (statement instanceof IfStatement || statement instanceof WhileStatement
                    || statement instanceof ForStatement || statement instanceof DoWhileStatement) {
                sb.append("\n");
            }

            indent(sb, indent);
            statement.toPigLatin(sb, indent);
        }
    }
}
