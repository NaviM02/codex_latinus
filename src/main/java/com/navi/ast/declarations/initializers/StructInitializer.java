package com.navi.ast.declarations.initializers;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class StructInitializer extends Initializer {
    private List<StructFieldInitializer> fields;
}
