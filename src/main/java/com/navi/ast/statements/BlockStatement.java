package com.navi.ast.statements;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BlockStatement extends Statement {
    private final List<Statement> statements;
}
