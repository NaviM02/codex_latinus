package com.navi.ast.statements;

import com.navi.ast.declarations.initializers.Initializer;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AssignmentStatement extends Statement {
    private Expression target;
    private Initializer initializer;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        target.toPigLatin(sb, indent);
        sb.append(" = ");
        initializer.toPigLatin(sb, indent);
        sb.append(";\n");
    }
}
