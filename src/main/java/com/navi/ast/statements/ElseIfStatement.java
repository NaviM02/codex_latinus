package com.navi.ast.statements;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ElseIfStatement extends AstNode {
    private Expression condition;
    private BlockStatement block;

}
