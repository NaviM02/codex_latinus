package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArrayAccessExpression extends Expression {
    private Expression array;
    private Expression index;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(array, index);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        array.toPigLatin(writer, indent);
        writer.append("[");
        index.toPigLatin(writer, indent);
        writer.append("]");
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
