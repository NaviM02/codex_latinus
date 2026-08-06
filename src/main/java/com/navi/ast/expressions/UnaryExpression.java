package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UnaryExpression extends Expression {
    private UnaryOperator operator;
    private Expression expression;
}
