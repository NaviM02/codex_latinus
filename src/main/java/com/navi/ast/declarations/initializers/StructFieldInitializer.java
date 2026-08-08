package com.navi.ast.declarations.initializers;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StructFieldInitializer extends AstNode {
    private String name;
    private Initializer value;
}
