package com.navi.ast.statements;

import com.navi.ast.declarations.VariableDeclaration;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ForStatement extends Statement {
    private VariableDeclaration initializer;
    private Expression condition;
    private Expression update;
    private BlockStatement block;

}
