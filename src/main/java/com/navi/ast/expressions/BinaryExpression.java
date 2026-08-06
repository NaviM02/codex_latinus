package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BinaryExpression extends Expression {
    private Expression left;
    private Expression right;
    private BinaryOperator operator;
}
