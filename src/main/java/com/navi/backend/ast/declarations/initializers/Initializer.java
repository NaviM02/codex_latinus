package com.navi.backend.ast.declarations.initializers;

import com.navi.backend.ast.AstNode;

public abstract class Initializer extends AstNode {
    public Initializer(int line, int column) {
        super(line, column);
    }
}
