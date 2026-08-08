package com.navi.ast.declarations;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructDeclaration extends Declaration {
    private String name;
    private List<StructField> fields;
}
