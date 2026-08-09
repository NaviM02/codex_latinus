package com.navi.ast.visitors;

import com.navi.ast.AstNode;
import com.navi.ast.expressions.*;
import com.navi.ast.expressions.literals.*;
import com.navi.ast.lexer_parser.LatinBaseVisitor;
import com.navi.ast.lexer_parser.LatinParser;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends LatinBaseVisitor<AstNode> {
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
    public AstNode visitNegateExpr(LatinParser.NegateExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.NEGATE,
            (Expression) visit(ctx.unaryExpression())
        );
    }

    @Override
    public AstNode visitPostIncrementExpr(LatinParser.PostIncrementExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.POST_INCREMENT,
            (Expression) visit(ctx.postfixExpression())
        );
    }

    @Override
    public AstNode visitPostDecrementExpr(LatinParser.PostDecrementExprContext ctx) {
        return new UnaryExpression(
            UnaryOperator.POST_DECREMENT,
            (Expression) visit(ctx.postfixExpression())
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
}
