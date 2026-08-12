package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import com.navi.ast.expressions.UnaryOperator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IncrementStatement extends Statement {
    private Expression target;
    private UnaryOperator operator;
}