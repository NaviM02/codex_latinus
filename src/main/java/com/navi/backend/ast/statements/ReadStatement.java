package com.navi.backend.ast.statements;

import com.navi.backend.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReadStatement extends Statement {
    private Expression target;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        target.toPigLatin(sb, indent);
        sb.append(" %OINK_OINK\n");
    }
}
