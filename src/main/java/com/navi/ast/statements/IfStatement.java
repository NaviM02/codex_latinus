package com.navi.ast.statements;

import com.navi.ast.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class IfStatement extends Statement {
    private Expression condition;
    private BlockStatement thenBlock;
    private List<ElseIfStatement> elseIfStatements;
    private BlockStatement elseBlock;

}
