package com.navi.ast.global;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Parameter extends AstNode {
    private String name;
    private String type;
}
