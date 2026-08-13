package com.navi.backend.ast.visitors;

import com.navi.backend.ast.AstNode;
import com.navi.backend.ast.declarations.VariableDeclaration;
import com.navi.backend.ast.declarations.initializers.Initializer;
import com.navi.backend.ast.expressions.*;
import com.navi.backend.ast.expressions.*;
import com.navi.backend.ast.lexer_parser.PigLatinParser;
import com.navi.backend.ast.statements.*;
import com.navi.backend.ast.statements.*;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends ExpressionVisitor {
    @Override
    public AstNode visitAssignmentStmt(PigLatinParser.AssignmentStmtContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public AstNode visitAssignment(PigLatinParser.AssignmentContext ctx) {
        return new AssignmentStatement(
            (Expression) visit(ctx.postfixExpression()),
            (Initializer) visit(ctx.initializer())
        );
    }

    @Override
    public AstNode visitBlock(PigLatinParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (PigLatinParser.StatementContext statement : ctx.statement()) {
            statements.add((Statement) visit(statement));
        }

        return new BlockStatement(statements);
    }

    @Override
    public AstNode visitIncrementStmt(PigLatinParser.IncrementStmtContext ctx) {
        return visit(ctx.incrementStatement());
    }

    @Override
    public AstNode visitIncrementStatement(PigLatinParser.IncrementStatementContext ctx) {
        Expression target = (Expression) visit(ctx.incrementableExpression());
        if (ctx.PLUSPLUS() != null) {
            return new IncrementStatement(target, UnaryOperator.POST_INCREMENT);
        }
        return new IncrementStatement(target, UnaryOperator.POST_DECREMENT);
    }

    @Override
    public AstNode visitIncrementVariable(PigLatinParser.IncrementVariableContext ctx) {
        return new VariableExpression(ctx.ID().getText());
    }

    @Override
    public AstNode visitIncrementArrayAccess(PigLatinParser.IncrementArrayAccessContext ctx) {
        return new ArrayAccessExpression(
            (Expression) visit(ctx.postfixExpression()),
            (Expression) visit(ctx.expression())
        );
    }

    @Override
    public AstNode visitIncrementMemberAccess(PigLatinParser.IncrementMemberAccessContext ctx) {
        return new MemberAccessExpression(
            (Expression) visit(ctx.postfixExpression()),
            ctx.ID().getText()
        );
    }

    @Override
    public AstNode visitIfStmt(PigLatinParser.IfStmtContext ctx) {
        return visit(ctx.ifStatement());
    }

    @Override
    public AstNode visitIfStatement(PigLatinParser.IfStatementContext ctx) {
        List<ElseIfStatement> elseIfs = new ArrayList<>();

        for (PigLatinParser.ElseIfStatementContext elseIf : ctx.elseIfStatement()) {
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
    public AstNode visitElseIfStatement(PigLatinParser.ElseIfStatementContext ctx) {
        return new ElseIfStatement(
            (Expression) visit(ctx.expression()),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitElseStatement(PigLatinParser.ElseStatementContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public AstNode visitWhileStmt(PigLatinParser.WhileStmtContext ctx) {
        return visit(ctx.whileStatement());
    }

    @Override
    public AstNode visitWhileStatement(PigLatinParser.WhileStatementContext ctx) {
        return new WhileStatement(
            (Expression) visit(ctx.expression()),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitDoWhileStmt(PigLatinParser.DoWhileStmtContext ctx) {
        return visit(ctx.doWhileStatement());
    }

    @Override
    public AstNode visitDoWhileStatement(PigLatinParser.DoWhileStatementContext ctx) {
        return new DoWhileStatement(
            (BlockStatement) visit(ctx.block()),
            (Expression) visit(ctx.expression())
        );
    }

    @Override
    public AstNode visitForStmt(PigLatinParser.ForStmtContext ctx) {
        return visit(ctx.forStatement());
    }

    @Override
    public AstNode visitForStatement(PigLatinParser.ForStatementContext ctx) {
        return new ForStatement(
            (VariableDeclaration) visit(ctx.variableDeclaration()),
            (Expression) visit(ctx.expression(0)),
            (Expression) visit(ctx.expression(1)),
            (BlockStatement) visit(ctx.block())
        );
    }

    @Override
    public AstNode visitReturnStmt(PigLatinParser.ReturnStmtContext ctx) {
        return new ReturnStatement(
            (Expression) visit(ctx.returnStatement().expression())
        );
    }

    @Override
    public AstNode visitBreakStmt(PigLatinParser.BreakStmtContext ctx) {
        return new BreakStatement();
    }

    @Override
    public AstNode visitContinueStmt(PigLatinParser.ContinueStmtContext ctx) {
        return new ContinueStatement();
    }

    @Override
    public AstNode visitPrintStatement(PigLatinParser.PrintStatementContext ctx) {
        List<Expression> expressions = new ArrayList<>();

        for (PigLatinParser.ExpressionContext expr : ctx.expressions) {
            expressions.add((Expression) visit(expr));
        }

        return new PrintStatement(expressions);
    }

    @Override
    public AstNode visitReadStatement(PigLatinParser.ReadStatementContext ctx) {
        Expression target = null;

        if (ctx.postfixExpression() != null) {
            target = (Expression) visit(ctx.postfixExpression());
        }

        return new ReadStatement(target);
    }
}