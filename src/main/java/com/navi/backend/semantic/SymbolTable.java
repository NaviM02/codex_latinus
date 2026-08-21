package com.navi.backend.semantic;

import lombok.Getter;

import java.util.*;

@Getter
public class SymbolTable {
    private final Scope globalScope;
    private Scope currentScope;
    private final Map<String, Scope> functionScopes = new LinkedHashMap<>();
    private final Map<String, Scope> structScopes = new LinkedHashMap<>();
    private final Map<String, Scope> blockScopes = new LinkedHashMap<>();

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

    public void registerStructScope(String structName, Scope scope) {
        structScopes.put(structName, scope);
    }

    public Scope getStructScope(String structName) {
        return structScopes.get(structName);
    }

    public void registerBlockScope(String forStatement, Scope scope) {
        blockScopes.put(forStatement, scope);
    }

    public Scope getBlockScope(String forName) {
        return blockScopes.get(forName);
    }
}