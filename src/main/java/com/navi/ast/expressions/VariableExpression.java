package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class VariableExpression extends Expression {
    private String name;

}
