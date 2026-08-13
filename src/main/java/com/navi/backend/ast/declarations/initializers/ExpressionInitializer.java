package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExpressionInitializer extends Initializer {
    private Expression expression;

    @Override
    public void toPigLatin(StringBuilder sb, int indent) {
        expression.toPigLatin(sb, indent);
    }
}
