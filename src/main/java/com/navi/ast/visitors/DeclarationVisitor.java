package com.navi.ast.visitors;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.*;
import com.navi.ast.declarations.initializers.ExpressionInitializer;
import com.navi.ast.declarations.initializers.Initializer;
import com.navi.ast.declarations.initializers.StructFieldInitializer;
import com.navi.ast.declarations.initializers.StructInitializer;
import com.navi.ast.expressions.Expression;
import com.navi.ast.expressions.literals.BooleanLiteral;
import com.navi.ast.global.FunctionBody;
import com.navi.ast.global.FunctionDeclaration;
import com.navi.ast.global.LocalVariableSection;
import com.navi.ast.global.Parameter;
import com.navi.ast.lexer_parser.LatinParser;
import com.navi.ast.statements.BlockStatement;
import com.navi.ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class DeclarationVisitor extends StatementVisitor {
    @Override
    public AstNode visitDeclaration(LatinParser.DeclarationContext ctx) {
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
    public AstNode visitNormalVarDeclaration(LatinParser.NormalVarDeclarationContext ctx) {
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
    public AstNode visitBooleanVarDeclaration(LatinParser.BooleanVarDeclarationContext ctx) {
        boolean value = ctx.booleanLiteral().VERUM() != null;

        return new VariableDeclaration(
            ctx.ID().getText(),
            "boolean",
            new ExpressionInitializer(new BooleanLiteral(value))
        );
    }

    @Override
    public AstNode visitArrayDeclaration(LatinParser.ArrayDeclarationContext ctx) {
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
    public AstNode visitArrayInitializer(LatinParser.ArrayInitializerContext ctx) {
        List<Expression> values = new ArrayList<>();

        for (LatinParser.ExpressionContext expression : ctx.values) {
            values.add((Expression) visit(expression));
        }

        return new ArrayInitializer(values);
    }

    @Override
    public AstNode visitExprInit(LatinParser.ExprInitContext ctx) {
        return new ExpressionInitializer((Expression) visit(ctx.expression()));
    }

    @Override
    public AstNode visitStructInit(LatinParser.StructInitContext ctx) {
        return visit(ctx.structInitializer());
    }

    @Override
    public AstNode visitStructInitializer(LatinParser.StructInitializerContext ctx) {
        List<StructFieldInitializer> fields = new ArrayList<>();

        for (LatinParser.StructFieldInitializerContext field : ctx.structFieldInitializer()) {
            fields.add((StructFieldInitializer) visit(field));
        }

        return new StructInitializer(fields);
    }

    @Override
    public AstNode visitStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx) {
        return new StructFieldInitializer(
            ctx.ID().getText(),
            (Initializer) visit(ctx.initializer())
        );
    }

    @Override
    public AstNode visitStructDeclaration(LatinParser.StructDeclarationContext ctx) {
        List<StructField> fields = new ArrayList<>();

        for (LatinParser.StructFieldWithSemicolonContext field : ctx.structFieldWithSemicolon()) {
            fields.add((StructField) visit(field));
        }

        for (LatinParser.StructFieldWithCommaContext field : ctx.structFieldWithComma()) {
            fields.add((StructField) visit(field));
        }

        return new StructDeclaration(ctx.ID().getText(), fields);
    }

    @Override
    public AstNode visitStructVariableFieldSemicolon(LatinParser.StructVariableFieldSemicolonContext ctx) {
        return new StructField(ctx.ID().getText(), ctx.type().getText(), false);
    }

    @Override
    public AstNode visitStructBooleanFieldSemicolon(LatinParser.StructBooleanFieldSemicolonContext ctx) {
        return new StructField(ctx.ID().getText(), "boolean", false);
    }

    @Override
    public AstNode visitStructArrayFieldSemicolon(LatinParser.StructArrayFieldSemicolonContext ctx) {
        String type = "boolean";

        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        return new StructField(ctx.ID().getText(), type, true);
    }

    @Override
    public AstNode visitStructVariableFieldComma(LatinParser.StructVariableFieldCommaContext ctx) {
        return new StructField(ctx.ID().getText(), ctx.type().getText(), false);
    }

    @Override
    public AstNode visitStructBooleanFieldComma(LatinParser.StructBooleanFieldCommaContext ctx) {
        return new StructField(ctx.ID().getText(), "boolean", false);
    }

    @Override
    public AstNode visitStructArrayFieldComma(LatinParser.StructArrayFieldCommaContext ctx) {
        String type = "boolean";

        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        return new StructField(ctx.ID().getText(), type, true);
    }

    @Override
    public AstNode visitFunctionDeclaration(LatinParser.FunctionDeclarationContext ctx) {
        if (ctx.procedureDeclaration() != null) {
            return visit(ctx.procedureDeclaration());
        }

        return visit(ctx.functionWithReturn());
    }

    @Override
    public AstNode visitProcedureDeclaration(LatinParser.ProcedureDeclarationContext ctx) {
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameterList() != null) {
            for (LatinParser.ParameterContext parameter : ctx.parameterList().parameter()) {
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
    public AstNode visitFunctionWithReturn(LatinParser.FunctionWithReturnContext ctx) {
        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameterList() != null) {
            for (LatinParser.ParameterContext parameter : ctx.parameterList().parameter()) {
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
    public AstNode visitParameter(LatinParser.ParameterContext ctx) {
        return new Parameter(ctx.ID().getText(), ctx.type().getText());
    }

    @Override
    public AstNode visitFunctionBody(LatinParser.FunctionBodyContext ctx) {
        LocalVariableSection localVariables = null;

        if (ctx.localVariableSection() != null) {
            localVariables = (LocalVariableSection) visit(ctx.localVariableSection());
        }

        List<Statement> statements = new ArrayList<>();

        for (LatinParser.StatementContext statement : ctx.statement()) {
            statements.add((Statement) visit(statement));
        }

        return new FunctionBody(
            localVariables,
            new BlockStatement(statements)
        );
    }

    @Override
    public AstNode visitLocalVariableSection(LatinParser.LocalVariableSectionContext ctx) {
        List<Declaration> declarations = new ArrayList<>();

        for (LatinParser.DeclarationContext declaration : ctx.declaration()) {
            declarations.add((Declaration) visit(declaration));
        }

        return new LocalVariableSection(declarations);
    }
}
