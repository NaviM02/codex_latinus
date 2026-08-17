package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.visitors.AstVisitor;
import com.navi.backend.pig_latin.PigLatinWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ExpressionInitializer extends Initializer {
    private Expression expression;

    @Override
    public List<? extends AstNode> getChildren() {
        return List.of(expression);
    }

    @Override
    public void toPigLatin(PigLatinWriter writer, int indent) {
        expression.toPigLatin(writer, indent);
    }

    @Override
    public <R> R accept(AstVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
