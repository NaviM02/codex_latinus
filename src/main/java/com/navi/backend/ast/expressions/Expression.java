package com.navi.backend.ast.expressions;

import com.navi.backend.ast.AstNode;
import lombok.Getter;

@Getter
public abstract class Expression extends AstNode {
    protected Expression(int line, int column) {
        super(line, column);
    }
}
