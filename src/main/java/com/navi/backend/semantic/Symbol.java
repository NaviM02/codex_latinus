package com.navi.backend.semantic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Symbol {
    private String name;
    private SymbolKind kind;
    private String type;
    private List<String> parameterTypes;

    // constructor without parameterTypes
    public Symbol(String name, SymbolKind kind, String type) {
        this(name, kind, type, List.of());
    }
}