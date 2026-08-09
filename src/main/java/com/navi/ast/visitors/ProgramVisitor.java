package com.navi.ast.visitors;

import com.navi.ast.AstNode;
import com.navi.ast.global.FunctionDeclaration;
import com.navi.ast.global.GlobalVariableSection;
import com.navi.ast.global.Program;
import com.navi.ast.lexer_parser.LatinParser;
import com.navi.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor extends DeclarationVisitor {
    @Override
    public AstNode visitProgram(LatinParser.ProgramContext ctx) {
        GlobalVariableSection globalVariables = null;
        List<FunctionDeclaration> functions = new ArrayList<>();
        List<Statement> mainStatements = new ArrayList<>();

        if (ctx.globalVariablesSection() != null) {
            globalVariables = (GlobalVariableSection) visit(ctx.globalVariablesSection());
        }

        if (ctx.functionSection() != null) {
            for (LatinParser.FunctionDeclarationContext function : ctx.functionSection().functionDeclaration()) {
                functions.add((FunctionDeclaration) visit(function));
            }
        }

        for (LatinParser.StatementContext statement : ctx.mainSection().statement()) {
            mainStatements.add((Statement) visit(statement));
        }

        return new Program(globalVariables, functions, mainStatements);
    }

    @Override
    public AstNode visitGlobalVariablesSection(LatinParser.GlobalVariablesSectionContext ctx) {
        List<com.navi.ast.declarations.Declaration> declarations = new ArrayList<>();

        for (LatinParser.DeclarationContext declaration : ctx.declaration()) {
            declarations.add((com.navi.ast.declarations.Declaration) visit(declaration));
        }

        return new GlobalVariableSection(declarations);
    }
}
