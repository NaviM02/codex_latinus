package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReturnStatement extends Statement {
    private Expression expression;

}
