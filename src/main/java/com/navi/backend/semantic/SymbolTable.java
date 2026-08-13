package com.navi.backend.semantic;

import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public class SymbolTable {
    private final Scope globalScope;
    private Scope currentScope;
    private final Map<String, Scope> functionScopes = new LinkedHashMap<>();

    public SymbolTable() {
        globalScope = new Scope(null);
        currentScope = globalScope;
    }

    public boolean define(Symbol symbol) {
        return currentScope.define(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }

    public void enterScope() {
        currentScope = new Scope(currentScope);
    }

    public void exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }
    public void registerFunctionScope(String functionName) {
        functionScopes.put(functionName, currentScope);
    }

    public Scope getFunctionScope(String functionName) {
        return functionScopes.get(functionName);
    }
}