package com.navi.ast.lexer_parser;// Generated from Latin.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code StructVariableFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterStructVariableFieldSemicolon(LatinParser.StructVariableFieldSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructVariableFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitStructVariableFieldSemicolon(LatinParser.StructVariableFieldSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructBooleanFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterStructBooleanFieldSemicolon(LatinParser.StructBooleanFieldSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructBooleanFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitStructBooleanFieldSemicolon(LatinParser.StructBooleanFieldSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructArrayFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterStructArrayFieldSemicolon(LatinParser.StructArrayFieldSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructArrayFieldSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldWithSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitStructArrayFieldSemicolon(LatinParser.StructArrayFieldSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructVariableFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void enterStructVariableFieldComma(LatinParser.StructVariableFieldCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructVariableFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void exitStructVariableFieldComma(LatinParser.StructVariableFieldCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructBooleanFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void enterStructBooleanFieldComma(LatinParser.StructBooleanFieldCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructBooleanFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void exitStructBooleanFieldComma(LatinParser.StructBooleanFieldCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructArrayFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void enterStructArrayFieldComma(LatinParser.StructArrayFieldCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructArrayFieldComma}
	 * labeled alternative in {@link LatinParser#structFieldWithComma}.
	 * @param ctx the parse tree
	 */
	void exitStructArrayFieldComma(LatinParser.StructArrayFieldCommaContext ctx);
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
	 * Enter a parse tree produced by the {@code NormalVarDeclaration}
	 * labeled alternative in {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarDeclaration(LatinParser.NormalVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarDeclaration}
	 * labeled alternative in {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarDeclaration(LatinParser.NormalVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanVarDeclaration}
	 * labeled alternative in {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVarDeclaration(LatinParser.BooleanVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanVarDeclaration}
	 * labeled alternative in {@link LatinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVarDeclaration(LatinParser.BooleanVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInit}
	 * labeled alternative in {@link LatinParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterExprInit(LatinParser.ExprInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInit}
	 * labeled alternative in {@link LatinParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitExprInit(LatinParser.ExprInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructInit}
	 * labeled alternative in {@link LatinParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterStructInit(LatinParser.StructInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructInit}
	 * labeled alternative in {@link LatinParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitStructInit(LatinParser.StructInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructInitializer(LatinParser.StructInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructInitializer(LatinParser.StructInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structFieldInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structFieldInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(LatinParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(LatinParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(LatinParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(LatinParser.BooleanLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(LatinParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(LatinParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(LatinParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(LatinParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(LatinParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(LatinParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(LatinParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(LatinParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(LatinParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(LatinParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LatinParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LatinParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(LatinParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(LatinParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(LatinParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(LatinParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(LatinParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(LatinParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(LatinParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStmt}
	 * labeled alternative in {@link LatinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(LatinParser.ReadStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code ToLogicalAndExpr}
	 * labeled alternative in {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterToLogicalAndExpr(LatinParser.ToLogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToLogicalAndExpr}
	 * labeled alternative in {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitToLogicalAndExpr(LatinParser.ToLogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LatinParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LatinParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LatinParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LatinParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LatinParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToEqualityExpr}
	 * labeled alternative in {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterToEqualityExpr(LatinParser.ToEqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToEqualityExpr}
	 * labeled alternative in {@link LatinParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitToEqualityExpr(LatinParser.ToEqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(LatinParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(LatinParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToComparisonExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterToComparisonExpr(LatinParser.ToComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToComparisonExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitToComparisonExpr(LatinParser.ToComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(LatinParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualExpr}
	 * labeled alternative in {@link LatinParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(LatinParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAdditiveExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterToAdditiveExpr(LatinParser.ToAdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAdditiveExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitToAdditiveExpr(LatinParser.ToAdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpr(LatinParser.GreaterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpr(LatinParser.GreaterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualExpr(LatinParser.GreaterEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualExpr(LatinParser.GreaterEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(LatinParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(LatinParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualExpr(LatinParser.LessEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualExpr}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualExpr(LatinParser.LessEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultiplicativeExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterToMultiplicativeExpr(LatinParser.ToMultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultiplicativeExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitToMultiplicativeExpr(LatinParser.ToMultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(LatinParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(LatinParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpr(LatinParser.SubtractionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpr}
	 * labeled alternative in {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpr(LatinParser.SubtractionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToUnaryExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterToUnaryExpr(LatinParser.ToUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToUnaryExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitToUnaryExpr(LatinParser.ToUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpr(LatinParser.DivisionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpr(LatinParser.DivisionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(LatinParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpr}
	 * labeled alternative in {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(LatinParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LatinParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LatinParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpr(LatinParser.PreIncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpr(LatinParser.PreIncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecrementExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpr(LatinParser.PreDecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecrementExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpr(LatinParser.PreDecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToPostfixExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterToPostfixExpr(LatinParser.ToPostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToPostfixExpr}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitToPostfixExpr(LatinParser.ToPostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(LatinParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(LatinParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(LatinParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(LatinParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(LatinParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(LatinParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToPrimaryExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterToPrimaryExpr(LatinParser.ToPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToPrimaryExpr}
	 * labeled alternative in {@link LatinParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitToPrimaryExpr(LatinParser.ToPrimaryExprContext ctx);
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