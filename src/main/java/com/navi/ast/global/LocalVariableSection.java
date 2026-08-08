package com.navi.ast.global;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.Declaration;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class LocalVariableSection extends AstNode {
    private final List<Declaration> declarations;
}
