package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import com.navi.ast.locations.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AssignmentStatement extends Statement {
    private Location location;
    private Expression expression;

}
