package com.navi.ast.expressions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberAccessExpression extends Expression {
    private Expression object;
    private String member;

}
