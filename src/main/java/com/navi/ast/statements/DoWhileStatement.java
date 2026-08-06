package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoWhileStatement extends Statement {
    private BlockStatement block;
    private Expression condition;

}
