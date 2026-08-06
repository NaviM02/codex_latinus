package com.navi.ast.visitors;

import com.navi.ast.AstNode;
import com.navi.ast.declarations.VariableDeclaration;
import com.navi.ast.expressions.*;
import com.navi.ast.expressions.literals.*;
import com.navi.ast.lexer_parser.LatinBaseVisitor;
import com.navi.ast.lexer_parser.LatinParser;
import com.navi.ast.locations.ArrayAccess;
import com.navi.ast.locations.Location;
import com.navi.ast.locations.LocationAccess;
import com.navi.ast.locations.MemberAccess;
import com.navi.ast.statements.*;

import java.util.ArrayList;
import java.util.List;

public class AstBuilderVisitor extends LatinBaseVisitor<AstNode> {

    // expressions
    @Override
    public AstNode visitNumberLiteralExpr(LatinParser.NumberLiteralExprContext ctx) {
        return new NumberLiteral(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public AstNode visitDecimalLiteralExpr(LatinParser.DecimalLiteralExprContext ctx) {
        return new DecimalLiteral(Double.parseDouble(ctx.DECIMAL().getText()));
    }

    @Override
    public AstNode visitStringLiteralExpr(LatinParser.StringLiteralExprContext ctx) {
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        return new StringLiteral(text);
    }

    @Override
    public AstNode visitCharLiteralExpr(LatinParser.CharLiteralExprContext ctx) {
        char c = ctx.CHAR().getText().charAt(1);
        return new CharLiteral(c);
    }

    @Override
    public AstNode visitTrueLiteralExpr(LatinParser.TrueLiteralExprContext ctx) {
        return new BooleanLiteral(true);
    }

    @Override
    public AstNode visitFalseLiteralExpr(LatinParser.FalseLiteralExprContext ctx) {
        return new BooleanLiteral(false);
    }

    @Override
    public AstNode visitVariableExpr(LatinParser.VariableExprContext ctx) {
        return new VariableExpression(ctx.ID().getText());
    }

    @Override
    public AstNode visitParenthesizedExpr(LatinParser.ParenthesizedExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitToLogicalAndExpr(LatinParser.ToLogicalAndExprContext ctx) {
        return visit(ctx.logicalAndExpression());
    }

    @Override
    public AstNode visitToEqualityExpr(LatinParser.ToEqualityExprContext ctx) {
        return visit(ctx.equalityExpression());
    }

    @Override
    public AstNode visitToComparisonExpr(LatinParser.ToComparisonExprContext ctx) {
        return visit(ctx.comparisonExpression());
    }

    @Override
    public AstNode visitToAdditiveExpr(LatinParser.ToAdditiveExprContext ctx) {
        return visit(ctx.additiveExpression());
    }

    @Override
    public AstNode visitToMultiplicativeExpr(LatinParser.ToMultiplicativeExprContext ctx) {
        return visit(ctx.multiplicativeExpression());
    }

    @Override
    public AstNode visitToUnaryExpr(LatinParser.ToUnaryExprContext ctx) {
        return visit(ctx.unaryExpression());
    }

    @Override
    public AstNode visitOrExpr(LatinParser.OrExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.logicalOrExpression()),
            BinaryOperator.OR,
            (Expression) visit(ctx.logicalAndExpression())
        );
    }

    @Override
    public AstNode visitAndExpr(LatinParser.AndExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.logicalAndExpression()),
            BinaryOperator.AND,
            (Expression) visit(ctx.equalityExpression())
        );
    }

    @Override
    public AstNode visitEqualExpr(LatinParser.EqualExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.equalityExpression()),
            BinaryOperator.EQUAL,
            (Expression) visit(ctx.comparisonExpression())
        );
    }

    @Override
    public AstNode visitNotEqualExpr(LatinParser.NotEqualExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.equalityExpression()),
            BinaryOperator.NOT_EQUAL,
            (Expression) visit(ctx.comparisonExpression())
        );
    }

    @Override
    public AstNode visitLessExpr(LatinParser.LessExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.comparisonExpression()),
            BinaryOperator.LESS,
            (Expression) visit(ctx.additiveExpression())
        );
    }

    @Override
    public AstNode visitGreaterExpr(LatinParser.GreaterExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.comparisonExpression()),
            BinaryOperator.GREATER,
            (Expression) visit(ctx.additiveExpression())
        );
    }

    @Override
    public AstNode visitLessEqualExpr(LatinParser.LessEqualExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.comparisonExpression()),
            BinaryOperator.LESS_EQUAL,
            (Expression) visit(ctx.additiveExpression())
        );
    }

    @Override
    public AstNode visitGreaterEqualExpr(LatinParser.GreaterEqualExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.comparisonExpression()),
            BinaryOperator.GREATER_EQUAL,
            (Expression) visit(ctx.additiveExpression())
        );
    }

    @Override
    public AstNode visitAdditionExpr(LatinParser.AdditionExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.additiveExpression()),
            BinaryOperator.ADD,
            (Expression) visit(ctx.multiplicativeExpression())
        );
    }

    @Override
    public AstNode visitSubtractionExpr(LatinParser.SubtractionExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.additiveExpression()),
            BinaryOperator.SUBTRACT,
            (Expression) visit(ctx.multiplicativeExpression())
        );
    }

    @Override
    public AstNode visitMultiplicationExpr(LatinParser.MultiplicationExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.multiplicativeExpression()),
            BinaryOperator.MULTIPLY,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitDivisionExpr(LatinParser.DivisionExprContext ctx) {
        return new BinaryExpression(
            (Expression) visit(ctx.multiplicativeExpression()),
            BinaryOperator.DIVIDE,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitNotExpr(LatinParser.NotExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.NOT,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitPreIncrementExpr(LatinParser.PreIncrementExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.PRE_INCREMENT,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitPreDecrementExpr(LatinParser.PreDecrementExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.PRE_DECREMENT,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitArrayAccessExpr(LatinParser.ArrayAccessExprContext ctx) {
        return new ArrayAccessExpression(
            (Expression) visit(ctx.postfixExpression()),
            (Expression) visit(ctx.expression())
        );
    }

    @Override
    public AstNode visitMemberAccessExpr(LatinParser.MemberAccessExprContext ctx) {
        return new MemberAccessExpression(
            (Expression) visit(ctx.postfixExpression()),
            ctx.ID().getText()
        );
    }

    @Override
    public AstNode visitFunctionCallExpr(LatinParser.FunctionCallExprContext ctx) {
        List<Expression> arguments = new ArrayList<>();

        if (ctx.functionArguments().argumentList() != null) {
            for (LatinParser.ExpressionContext expr : ctx.functionArguments().argumentList().expression()) {
                arguments.add((Expression) visit(expr));
            }
        }

        return new FunctionCallExpression(
            (Expression) visit(ctx.postfixExpression()),
            arguments
        );
    }

    @Override
    public AstNode visitToPrimaryExpr(LatinParser.ToPrimaryExprContext ctx) {
        return visit(ctx.primaryExpression());
    }

    // statements
    @Override
    public AstNode visitLocation(LatinParser.LocationContext ctx) {
        List<LocationAccess> accesses = new ArrayList<>();

        for (LatinParser.LocationAccessContext accessCtx : ctx.accesses) {
            accesses.add((LocationAccess) visit(accessCtx));
        }

        return new Location(ctx.base.getText(), accesses);
    }

    @Override
    public AstNode visitArrayLocationAccess(LatinParser.ArrayLocationAccessContext ctx) {
        return new ArrayAccess((Expression) visit(ctx.expression()));
    }

    @Override
    public AstNode visitMemberLocationAccess(LatinParser.MemberLocationAccessContext ctx) {
        return new MemberAccess(ctx.ID().getText());
    }

    @Override
    public AstNode visitAssignmentStmt(LatinParser.AssignmentStmtContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public AstNode visitAssignment(LatinParser.AssignmentContext ctx) {
        return new AssignmentStatement(
            (Location) visit(ctx.location()),
            (Expression) visit(ctx.expression())
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
    public AstNode visitPrintStatement(LatinParser.PrintStatementContext ctx) {
        List<Expression> expressions = new ArrayList<>();

        for (LatinParser.ExpressionContext expr : ctx.expressions) {
            expressions.add((Expression) visit(expr));
        }

        return new PrintStatement(expressions);
    }
}
