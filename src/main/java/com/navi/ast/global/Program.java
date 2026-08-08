package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.ast.statements.Statement;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Program extends AstNode {
    private final List<GlobalVariableSection> globalVariables;
    private final List<FunctionDeclaration> functions;
    private final List<Statement> mainStatements;
}
