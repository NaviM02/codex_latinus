package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionCallExpression extends Expression {
    private Expression callee;
    private List<Expression> arguments;

}
