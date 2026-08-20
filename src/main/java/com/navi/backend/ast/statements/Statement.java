package com.navi.backend.ast.statements;

import com.navi.backend.ast.AstNode;

public abstract class Statement extends AstNode {
    protected Statement(int line, int column) {
        super(line, column);
    }
}
