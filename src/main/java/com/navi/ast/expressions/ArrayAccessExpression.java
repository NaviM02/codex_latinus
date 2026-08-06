package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArrayAccessExpression extends Expression {
    private Expression array;
    private Expression index;

}
