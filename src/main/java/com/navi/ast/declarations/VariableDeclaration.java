package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class VariableDeclaration extends AstNode {
    private final String name;
    private final String type;
    private final Expression initializer;
}
