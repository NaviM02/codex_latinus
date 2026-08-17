package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionCallExpression extends Expression {
    private Expression callee;
    private List<Expression> arguments;

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new java.util.ArrayList<>();

        children.add(callee);
        children.addAll(arguments);

        return children;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        callee.toPigLatin(writer, indent);
        writer.append("(");

        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) writer.append(", ");
            arguments.get(i).toPigLatin(writer, indent);
        }

        writer.append(")");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
