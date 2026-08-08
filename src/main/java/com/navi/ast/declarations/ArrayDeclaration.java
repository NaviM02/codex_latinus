package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArrayDeclaration extends Declaration {
    private String name;
    private Expression size;
    private String type;
    private ArrayInitializer initializer;
}
