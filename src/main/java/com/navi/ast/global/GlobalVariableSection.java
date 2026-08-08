package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.Declaration;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class GlobalVariableSection extends AstNode {
    private List<Declaration> declarations;
}
