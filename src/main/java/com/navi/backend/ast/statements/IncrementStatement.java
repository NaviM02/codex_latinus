package com.navi.backend.ast.statements;

import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.expressions.UnaryOperator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IncrementStatement extends Statement {
    private Expression target;
    private UnaryOperator operator;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        target.toPigLatin(sb, indent);

        if (operator == UnaryOperator.POST_INCREMENT) {
            sb.append("++");
        } else {
            sb.append("--");
        }

        sb.append(";\n");
    }
}