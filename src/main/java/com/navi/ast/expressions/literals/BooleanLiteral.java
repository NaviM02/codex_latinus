package com.navi.ast.expressions.literals;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BooleanLiteral extends Expression {
    private boolean value;

}
