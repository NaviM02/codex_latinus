package com.navi.backend.ast.statements;

import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.expressions.Expression;
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
