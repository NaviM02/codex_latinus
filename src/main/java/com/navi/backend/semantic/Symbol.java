package com.navi.backend.semantic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
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
    @Setter
    private Object value;
    @Setter
    private Integer arraySize;

    public Symbol(String name, SymbolKind kind, String type) {
        this(name, kind, type, List.of(), null, null);
    }

    public Symbol(String name, SymbolKind kind, String type, List<String> parameterTypes) {
        this(name, kind, type, parameterTypes, null, null);
    }

}