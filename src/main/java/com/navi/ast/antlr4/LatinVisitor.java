package com.navi.ast.antlr4;// Generated from Latin.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LatinParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#globalVariablesSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariablesSection(LatinParser.GlobalVariablesSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSection(LatinParser.FunctionSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#mainSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSection(LatinParser.MainSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#declarationSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSection(LatinParser.DeclarationSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(LatinParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(LatinParser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(LatinParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(LatinParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionWithReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithReturn(LatinParser.FunctionWithReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(LatinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#localVariableSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableSection(LatinParser.LocalVariableSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LatinParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(LatinParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(LatinParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LatinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(LatinParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(LatinParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(LatinParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LatinParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LatinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(LatinParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(LatinParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LatinParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(LatinParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(LatinParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(LatinParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LatinParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(LatinParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(LatinParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(LatinParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralExpr(LatinParser.NumberLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteralExpr(LatinParser.DecimalLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(LatinParser.StringLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteralExpr(LatinParser.CharLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteralExpr(LatinParser.TrueLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteralExpr(LatinParser.FalseLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(LatinParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(LatinParser.ParenthesizedExprContext ctx);
}