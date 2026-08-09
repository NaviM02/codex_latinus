package com.navi.semantic;

import com.navi.ast.declarations.ArrayDeclaration;
import com.navi.ast.declarations.Declaration;
import com.navi.ast.declarations.StructDeclaration;
import com.navi.ast.declarations.VariableDeclaration;
import com.navi.ast.global.FunctionDeclaration;
import com.navi.ast.global.GlobalVariableSection;
import com.navi.ast.global.LocalVariableSection;
import com.navi.ast.global.Parameter;
import com.navi.ast.global.Program;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SymbolTableBuilder {
    private final SymbolTable symbolTable;

    public void build(Program program) {
        buildGlobalVariables(program.getGlobalVariables());
        buildFunctions(program);
    }

    private void buildGlobalVariables(GlobalVariableSection section) {
        if (section == null) {
            return;
        }

        for (Declaration declaration : section.getDeclarations()) {
            defineDeclaration(declaration);
        }
    }

    private void buildFunctions(Program program) {
        for (FunctionDeclaration function : program.getFunctions()) {
            List<String> parameterTypes = function.getParameters()
                    .stream()
                    .map(Parameter::getType)
                    .toList();

            String returnType = function.getReturnType();

            if (returnType == null) {
                returnType = TypeSystem.VOID;
            }

            Symbol functionSymbol = new Symbol(function.getName(), SymbolKind.FUNCTION, returnType, parameterTypes);

            if (!symbolTable.define(functionSymbol)) {
                throw new SemanticException("Function '" + function.getName() + "' is already declared.");
            }

            symbolTable.enterScope();

            buildParameters(function);
            buildLocalVariables(function);

            symbolTable.registerFunctionScope(function.getName());
            symbolTable.exitScope();
        }
    }

    private void buildParameters(FunctionDeclaration function) {
        if (function.getParameters() == null) return;

        for (Parameter parameter : function.getParameters()) {
            Symbol parameterSymbol = new Symbol(parameter.getName(), SymbolKind.PARAMETER, parameter.getType());
            symbolTable.define(parameterSymbol);
        }
    }

    private void buildLocalVariables(FunctionDeclaration function) {
        LocalVariableSection localVariables = function.getBody().getLocalVariables();
        if (localVariables == null) return;

        for (Declaration declaration : localVariables.getDeclarations()) {
            defineDeclaration(declaration);
        }
    }

    private void defineDeclaration(Declaration declaration) {
        if (declaration instanceof VariableDeclaration variable) {
            Symbol symbol = new Symbol(variable.getName(), SymbolKind.VARIABLE, variable.getType());
            symbolTable.define(symbol);
            return;
        }

        if (declaration instanceof ArrayDeclaration array) {
            Symbol symbol = new Symbol(array.getName(), SymbolKind.ARRAY, array.getType());
            symbolTable.define(symbol);
            return;
        }

        if (declaration instanceof StructDeclaration struct) {
            Symbol symbol = new Symbol(struct.getName(), SymbolKind.STRUCT, null);
            symbolTable.define(symbol);
        }
    }
}