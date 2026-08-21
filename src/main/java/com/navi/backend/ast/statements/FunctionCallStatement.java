package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FunctionCallStatement extends Statement {
    private final Expression callee;
    private final List<Expression> arguments;

    public FunctionCallStatement(int line, int column, Expression callee, List<Expression> arguments) {
        super(line, column);
        this.callee = callee;
        this.arguments = arguments;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        List<AstNode> children = new ArrayList<>();
        children.add(callee);
        children.addAll(arguments);
        return children;
    }

    @Override
    public String getNodeLabel() {
        return "FunctionCallStatement";
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        callee.toPigLatin(writer, indent);
        writer.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            arguments.get(i).toPigLatin(writer, indent);
            if (i < arguments.size() - 1) {
                writer.append(", ");
            }
        }
        writer.append(");");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
