package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PrintStatement extends Statement {
    private List<Expression> expressions;
}
