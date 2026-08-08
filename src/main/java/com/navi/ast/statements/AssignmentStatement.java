package com.navi.ast.statements;

import com.navi.ast.declarations.initializers.Initializer;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AssignmentStatement extends Statement {
    private Expression target;
    private Initializer initializer;

}
