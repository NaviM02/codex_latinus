package com.navi.backend.ast.visitors;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.*;
import com.navi.backend.ast.declarations.*;
import com.navi.backend.ast.declarations.initializers.ExpressionInitializer;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.declarations.initializers.StructFieldInitializer;
import com.navi.backend.ast.declarations.initializers.StructInitializer;
import com.navi.backend.ast.expressions.Expression;
import com.navi.backend.ast.global.FunctionBody;
import com.navi.backend.ast.global.FunctionDeclaration;
import com.navi.backend.ast.global.LocalVariableSection;
import com.navi.backend.ast.global.Parameter;
import com.navi.backend.ast.lexer_parser.PigLatinParser;
import com.navi.backend.ast.statements.BlockStatement;
import com.navi.backend.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class DeclarationVisitor extends StatementVisitor {
    @Override
    public AstNode visitDeclaration(PigLatinParser.DeclarationContext ctx) {
        if (ctx.variableDeclaration() != null) {
            return visit(ctx.variableDeclaration());
        }

        if (ctx.arrayDeclaration() != null) {
            return visit(ctx.arrayDeclaration());
        }

        if (ctx.structDeclaration() != null) {
            return visit(ctx.structDeclaration());
        }

        return null;
    }

    @Override
    public AstNode visitNormalVarDeclaration(PigLatinParser.NormalVarDeclarationContext ctx) {
        Initializer initializer = null;

        if (ctx.initializer() != null) {
            initializer = (Initializer) visit(ctx.initializer());
        }

        return new VariableDeclaration(
            ctx.ID().getText(),
            ctx.type().getText(),
            initializer
        );
    }

    @Override
    public AstNode visitArrayDeclaration(PigLatinParser.ArrayDeclarationContext ctx) {
        String type = "boolean";

        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        ArrayInitializer initializer = null;

        if (ctx.arrayInitializer() != null) {
            initializer = (ArrayInitializer) visit(ctx.arrayInitializer());
        }

        return new ArrayDeclaration(
            ctx.ID().getText(),
            (Expression) visit(ctx.expression()),
            type,
            initializer
        );
    }

    @Override
    public AstNode visitArrayInitializer(PigLatinParser.ArrayInitializerContext ctx) {
        List<Expression> values = new ArrayList<>();

        for (PigLatinParser.ExpressionContext expression : ctx.values) {
            values.add((Expression) visit(expression));
        }

        return new ArrayInitializer(values);
    }

    @Override
    public AstNode visitExprInit(PigLatinParser.ExprInitContext ctx) {
        return new ExpressionInitializer((Expression) visit(ctx.expression()));
    }

    @Override
    public AstNode visitStructInit(PigLatinParser.StructInitContext ctx) {
        return visit(ctx.structInitializer());
    }

    @Override
    public AstNode visitStructInitializer(PigLatinParser.StructInitializerContext ctx) {
        List<StructFieldInitializer> fields = new ArrayList<>();

        for (PigLatinParser.StructFieldInitializerContext field : ctx.structFieldInitializer()) {
            fields.add((StructFieldInitializer) visit(field));
        }

        return new StructInitializer(fields);
    }

    @Override
    public AstNode visitStructFieldInitializer(PigLatinParser.StructFieldInitializerContext ctx) {
        return new StructFieldInitializer(
            ctx.ID().getText(),
            (Initializer) visit(ctx.initializer())
        );
    }

    @Override
    public AstNode visitStructDeclaration(PigLatinParser.StructDeclarationContext ctx) {
        List<StructField> fields = new ArrayList<>();

        for (PigLatinParser.StructFieldWithSemicolonContext field : ctx.structFieldWithSemicolon()) {
            fields.add((StructField) visit(field));
        }

        for (PigLatinParser.StructFieldWithCommaContext field : ctx.structFieldWithComma()) {
            fields.add((StructField) visit(field));
        }

        return new StructDeclaration(ctx.ID().getText(), fields);
    }

    @Override
    public AstNode visitStructVariableFieldSemicolon(PigLatinParser.StructVariableFieldSemicolonContext ctx) {
        return new StructField(ctx.ID().getText(), ctx.type().getText(), false);
    }

    @Override
    public AstNode visitStructArrayFieldSemicolon(PigLatinParser.StructArrayFieldSemicolonContext ctx) {
        String type = "boolean";

        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        return new StructField(ctx.ID().getText(), type, true);
    }

    @Override
    public AstNode visitStructVariableFieldComma(PigLatinParser.StructVariableFieldCommaContext ctx) {
        return new StructField(ctx.ID().getText(), ctx.type().getText(), false);
    }

    @Override
    public AstNode visitStructArrayFieldComma(PigLatinParser.StructArrayFieldCommaContext ctx) {
        String type = "boolean";

        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        return new StructField(ctx.ID().getText(), type, true);
    }

    @Override
    public AstNode visitFunctionDeclaration(PigLatinParser.FunctionDeclarationContext ctx) {
        if (ctx.procedureDeclaration() != null) {
            return visit(ctx.procedureDeclaration());
        }

        return visit(ctx.functionWithReturn());
    }

    @Override
    public AstNode visitProcedureDeclaration(PigLatinParser.ProcedureDeclarationContext ctx) {
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameterList() != null) {
            for (PigLatinParser.ParameterContext parameter : ctx.parameterList().parameter()) {
                parameters.add((Parameter) visit(parameter));
            }
        }

        return new FunctionDeclaration(
            ctx.ID().getText(),
            null,
            parameters,
            (FunctionBody) visit(ctx.functionBody())
        );
    }

    @Override
    public AstNode visitFunctionWithReturn(PigLatinParser.FunctionWithReturnContext ctx) {
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameterList() != null) {
            for (PigLatinParser.ParameterContext parameter : ctx.parameterList().parameter()) {
                parameters.add((Parameter) visit(parameter));
            }
        }

        return new FunctionDeclaration(
            ctx.ID().getText(),
            ctx.type().getText(),
            parameters,
            (FunctionBody) visit(ctx.functionBody())
        );
    }

    @Override
    public AstNode visitParameter(PigLatinParser.ParameterContext ctx) {
        return new Parameter(ctx.ID().getText(), ctx.type().getText());
    }

    @Override
    public AstNode visitFunctionBody(PigLatinParser.FunctionBodyContext ctx) {
        LocalVariableSection localVariables = null;

        if (ctx.localVariableSection() != null) {
            localVariables = (LocalVariableSection) visit(ctx.localVariableSection());
        }

        List<Statement> statements = new ArrayList<>();

        for (PigLatinParser.StatementContext statement : ctx.statement()) {
            statements.add((Statement) visit(statement));
        }

        return new FunctionBody(
            localVariables,
            new BlockStatement(statements)
        );
    }

    @Override
    public AstNode visitLocalVariableSection(PigLatinParser.LocalVariableSectionContext ctx) {
        List<Declaration> declarations = new ArrayList<>();

        for (PigLatinParser.DeclarationContext declaration : ctx.declaration()) {
            declarations.add((Declaration) visit(declaration));
        }

        return new LocalVariableSection(declarations);
    }
}
