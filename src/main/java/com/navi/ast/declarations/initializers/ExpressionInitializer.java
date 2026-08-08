package com.navi.ast.declarations.initializers;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExpressionInitializer extends Initializer {
    private Expression expression;
}
