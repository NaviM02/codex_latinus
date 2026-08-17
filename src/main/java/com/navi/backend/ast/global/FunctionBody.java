package com.navi.backend.ast.global;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.statements.BlockStatement;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
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
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.append("{\n");

        if (localVariables != null) {
            localVariables.toPigLatin(writer, indent);
        }

        if (body != null) {
            body.toPigLatin(writer, indent);
        }

        writer.append("}");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
