package com.navi.ast.visitors;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.VariableDeclaration;
import com.navi.ast.declarations.initializers.Initializer;
import com.navi.ast.expressions.Expression;
import com.navi.ast.lexer_parser.LatinParser;
import com.navi.ast.statements.*;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends ExpressionVisitor {
    @Override
    public AstNode visitAssignmentStmt(LatinParser.AssignmentStmtContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public AstNode visitAssignment(LatinParser.AssignmentContext ctx) {
        return new AssignmentStatement(
                (Expression) visit(ctx.postfixExpression()),
                (Initializer) visit(ctx.initializer())
        );
    }

    @Override
    public AstNode visitBlock(LatinParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (LatinParser.StatementContext statement : ctx.statement()) {
            statements.add((Statement) visit(statement));
        }

        return new BlockStatement(statements);
    }

    @Override
    public AstNode visitIfStmt(LatinParser.IfStmtContext ctx) {
        return visit(ctx.ifStatement());
    }

    @Override
    public AstNode visitIfStatement(LatinParser.IfStatementContext ctx) {
        List<ElseIfStatement> elseIfs = new ArrayList<>();

        for (LatinParser.ElseIfStatementContext elseIf : ctx.elseIfStatement()) {
            elseIfs.add((ElseIfStatement) visit(elseIf));
        }

        BlockStatement elseBlock = null;

        if (ctx.elseStatement() != null) {
            elseBlock = (BlockStatement) visit(ctx.elseStatement());
        }

        return new IfStatement(
                (Expression) visit(ctx.expression()),
                (BlockStatement) visit(ctx.block()),
                elseIfs,
                elseBlock
        );
    }

    @Override
    public AstNode visitElseIfStatement(LatinParser.ElseIfStatementContext ctx) {
        return new ElseIfStatement(
            (Expression) visit(ctx.expression()),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitElseStatement(LatinParser.ElseStatementContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public AstNode visitWhileStmt(LatinParser.WhileStmtContext ctx) {
        return visit(ctx.whileStatement());
    }

    @Override
    public AstNode visitWhileStatement(LatinParser.WhileStatementContext ctx) {
        return new WhileStatement(
            (Expression) visit(ctx.expression()),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitDoWhileStmt(LatinParser.DoWhileStmtContext ctx) {
        return visit(ctx.doWhileStatement());
    }

    @Override
    public AstNode visitDoWhileStatement(LatinParser.DoWhileStatementContext ctx) {
        return new DoWhileStatement(
            (BlockStatement) visit(ctx.block()),
            (Expression) visit(ctx.expression())
        );
    }

    @Override
    public AstNode visitForStmt(LatinParser.ForStmtContext ctx) {
        return visit(ctx.forStatement());
    }

    @Override
    public AstNode visitForStatement(LatinParser.ForStatementContext ctx) {
        return new ForStatement(
            (VariableDeclaration) visit(ctx.variableDeclaration()),
            (Expression) visit(ctx.expression(0)),
            (Expression) visit(ctx.expression(1)),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitReturnStmt(LatinParser.ReturnStmtContext ctx) {
        return new ReturnStatement(
            (Expression) visit(ctx.returnStatement().expression())
        );
    }

    @Override
    public AstNode visitBreakStmt(LatinParser.BreakStmtContext ctx) {
        return new BreakStatement();
    }

    @Override
    public AstNode visitContinueStmt(LatinParser.ContinueStmtContext ctx) {
        return new ContinueStatement();
    }

    @Override
    public AstNode visitPrintStatement(LatinParser.PrintStatementContext ctx) {
        List<Expression> expressions = new ArrayList<>();

        for (LatinParser.ExpressionContext expr : ctx.expressions) {
            expressions.add((Expression) visit(expr));
        }

        return new PrintStatement(expressions);
    }

    @Override
    public AstNode visitReadStatement(LatinParser.ReadStatementContext ctx) {
        Expression target = null;

        if (ctx.postfixExpression() != null) {
            target = (Expression) visit(ctx.postfixExpression());
        }

        return new ReadStatement(target);
    }
}