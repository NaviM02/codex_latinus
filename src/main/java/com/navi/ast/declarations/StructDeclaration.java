package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructDeclaration extends AstNode {
    private String name;
    private List<AstNode> fields;
}
