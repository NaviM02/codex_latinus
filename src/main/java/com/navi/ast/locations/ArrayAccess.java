package com.navi.ast.locations;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArrayAccess extends LocationAccess {
    private Expression index;
}
