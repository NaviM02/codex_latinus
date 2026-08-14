package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.statements.BlockStatement;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionBody extends AstNode {
    private LocalVariableSection localVariables;
    private BlockStatement body;

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new ArrayList<>();

        if (localVariables != null) {
            children.add(localVariables);
        }

        if (body != null) {
            children.add(body);
        }

        return children;
    }

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
