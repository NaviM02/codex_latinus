package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.Getter;

import java.util.List;

@Getter
public class ArrayInitializer extends AstNode {
    private final List<Expression> values;

    public ArrayInitializer(int line, int column, List<Expression> values) {
        super(line, column);
        this.values = values;
    }

    @Override
    public List<? extends AstNode> getChildren() {
        return values;
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        writer.append("{");

        for (int i = 0; i < values.size(); i++) {
            values.get(i).toPigLatin(writer, indent);

            if (i < values.size() - 1) writer.append(", ");
        }

        writer.append("}");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
