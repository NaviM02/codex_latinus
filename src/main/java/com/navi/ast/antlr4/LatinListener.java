package com.navi.ast.antlr4;// Generated from Latin.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatinParser}.
 */
public interface LatinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LatinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LatinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#globalVariablesSection}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariablesSection(LatinParser.GlobalVariablesSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#globalVariablesSection}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariablesSection(LatinParser.GlobalVariablesSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionSection}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSection(LatinParser.FunctionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionSection}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSection(LatinParser.FunctionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void enterMainSection(LatinParser.MainSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void exitMainSection(LatinParser.MainSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSection(LatinParser.DeclarationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSection(LatinParser.DeclarationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(LatinParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(LatinParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(LatinParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(LatinParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(LatinParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(LatinParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(LatinParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(LatinParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionWithReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWithReturn(LatinParser.FunctionWithReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionWithReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWithReturn(LatinParser.FunctionWithReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(LatinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(LatinParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#localVariableSection}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableSection(LatinParser.LocalVariableSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#localVariableSection}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableSection(LatinParser.LocalVariableSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LatinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LatinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(LatinParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(LatinParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(LatinParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(LatinParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LatinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LatinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(LatinParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(LatinParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(LatinParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(LatinParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(LatinParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(LatinParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LatinParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LatinParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LatinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LatinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(LatinParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(LatinParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(LatinParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(LatinParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LatinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LatinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(LatinParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(LatinParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(LatinParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(LatinParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(LatinParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(LatinParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LatinParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LatinParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(LatinParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(LatinParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(LatinParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(LatinParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(LatinParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(LatinParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralExpr(LatinParser.NumberLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralExpr(LatinParser.NumberLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteralExpr(LatinParser.DecimalLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteralExpr(LatinParser.DecimalLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(LatinParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(LatinParser.StringLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteralExpr(LatinParser.CharLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteralExpr(LatinParser.CharLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralExpr(LatinParser.TrueLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralExpr(LatinParser.TrueLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralExpr(LatinParser.FalseLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralExpr(LatinParser.FalseLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(LatinParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(LatinParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(LatinParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link LatinParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(LatinParser.ParenthesizedExprContext ctx);
}