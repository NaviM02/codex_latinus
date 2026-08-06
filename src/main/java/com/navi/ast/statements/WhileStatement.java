package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WhileStatement extends Statement {
    private Expression condition;
    private BlockStatement block;

}
