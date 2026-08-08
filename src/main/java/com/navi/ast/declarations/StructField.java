package com.navi.ast.declarations;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StructField extends AstNode {
    private String name;
    private String type;
    private boolean isArray;
}
