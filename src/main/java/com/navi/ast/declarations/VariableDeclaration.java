package com.navi.ast.declarations;

import com.navi.ast.declarations.initializers.Initializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class VariableDeclaration extends Declaration {
    private String name;
    private String type;
    private Initializer initializer;
}
