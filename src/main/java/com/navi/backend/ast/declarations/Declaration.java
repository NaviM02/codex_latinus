package com.navi.backend.ast.declarations;

import com.navi.backend.ast.AstNode;

public abstract class Declaration extends AstNode {
    protected Declaration(int line, int column) {
        super(line, column);
    }
}
