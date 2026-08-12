package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.ast.statements.BlockStatement;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FunctionBody extends AstNode {
    private LocalVariableSection localVariables;
    private BlockStatement body;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        sb.append("{\n");

        if (localVariables != null) {
            localVariables.toPigLatin(sb, indent);
        }

        if (body != null) {
            body.toPigLatin(sb, indent);
        }

        sb.append("}");
    }
}
