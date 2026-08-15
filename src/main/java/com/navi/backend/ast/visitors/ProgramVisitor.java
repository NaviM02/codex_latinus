package com.navi.backend.ast.visitors;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.global.FunctionDeclaration;
import com.navi.backend.ast.global.GlobalVariableSection;
import com.navi.backend.ast.global.Program;
import com.navi.backend.ast.declarations.Declaration;
import com.navi.backend.lexer_parser.PigLatinParser;
import com.navi.backend.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor extends DeclarationVisitor {
    @Override
    public AstNode visitProgram(PigLatinParser.ProgramContext ctx) {
        GlobalVariableSection globalVariables = null;
        List<FunctionDeclaration> functions = new ArrayList<>();
        List<Statement> mainStatements = new ArrayList<>();

        if (ctx.globalVariablesSection() != null) {
            globalVariables = (GlobalVariableSection) visit(ctx.globalVariablesSection());
        }

        if (ctx.functionSection() != null) {
            for (PigLatinParser.FunctionDeclarationContext function : ctx.functionSection().functionDeclaration()) {
                functions.add((FunctionDeclaration) visit(function));
            }
        }

        for (PigLatinParser.StatementContext statement : ctx.mainSection().statement()) {
            mainStatements.add((Statement) visit(statement));
        }

        return new Program(globalVariables, functions, mainStatements);
    }

    @Override
    public AstNode visitGlobalVariablesSection(PigLatinParser.GlobalVariablesSectionContext ctx) {
        List<Declaration> declarations = new ArrayList<>();

        for (PigLatinParser.DeclarationContext declaration : ctx.declaration()) {
            declarations.add((Declaration) visit(declaration));
        }

        return new GlobalVariableSection(declarations);
    }
}
