package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArrayInitializer extends AstNode {
    private List<Expression> values;
}
