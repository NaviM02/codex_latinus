package com.navi.ast.global;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FunctionDeclaration extends AstNode {
    private String name;
    private String returnType;
    private List<Parameter> parameters;
    private FunctionBody body;
}
