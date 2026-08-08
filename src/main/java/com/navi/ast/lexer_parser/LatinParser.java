package com.navi.ast.lexer_parser;// Generated from Latin.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LatinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VARIABLES_SECTION=12, FUNCTIONS_SECTION=13, MAIN_SECTION=14, 
		FINIS_PROGRAM=15, STRUCTURA=16, FINIS=17, ESTO=18, SERIES=19, ACTIO=20, 
		RATIO=21, SI=22, ALITER=23, DUM=24, FACERE=25, PER=26, REDDERE=27, PERGE=28, 
		INTERRUMPE=29, VARIABILES=30, NUMERUS=31, DECIMALIS=32, TEXTUM=33, LITTERA=34, 
		VERUM=35, FALSUS=36, PLUS=37, MINUS=38, MULT=39, DIV=40, PLUSPLUS=41, 
		MINUSMINUS=42, AND=43, OR=44, NON=45, EQUAL=46, NOT_EQUAL=47, LESS=48, 
		GREATER=49, LESS_EQUAL=50, GREATER_EQUAL=51, READ=52, PRINT=53, NUMBER=54, 
		DECIMAL=55, STRING=56, CHAR=57, ID=58, LINE_COMMENT=59, BLOCK_COMMENT=60, 
		WS=61;
	public static final int
		RULE_program = 0, RULE_globalVariablesSection = 1, RULE_functionSection = 2, 
		RULE_mainSection = 3, RULE_structDeclaration = 4, RULE_structFieldWithSemicolon = 5, 
		RULE_structFieldWithComma = 6, RULE_functionDeclaration = 7, RULE_procedureDeclaration = 8, 
		RULE_functionWithReturn = 9, RULE_parameterList = 10, RULE_parameter = 11, 
		RULE_functionBody = 12, RULE_declaration = 13, RULE_localVariableSection = 14, 
		RULE_variableDeclaration = 15, RULE_initializer = 16, RULE_structInitializer = 17, 
		RULE_structFieldInitializer = 18, RULE_arrayConstructor = 19, RULE_booleanLiteral = 20, 
		RULE_arrayDeclaration = 21, RULE_arrayInitializer = 22, RULE_type = 23, 
		RULE_statement = 24, RULE_assignment = 25, RULE_ifStatement = 26, RULE_elseIfStatement = 27, 
		RULE_elseStatement = 28, RULE_block = 29, RULE_whileStatement = 30, RULE_doWhileStatement = 31, 
		RULE_forStatement = 32, RULE_returnStatement = 33, RULE_continueStatement = 34, 
		RULE_breakStatement = 35, RULE_readStatement = 36, RULE_printStatement = 37, 
		RULE_expression = 38, RULE_logicalOrExpression = 39, RULE_logicalAndExpression = 40, 
		RULE_equalityExpression = 41, RULE_comparisonExpression = 42, RULE_additiveExpression = 43, 
		RULE_multiplicativeExpression = 44, RULE_unaryExpression = 45, RULE_postfixExpression = 46, 
		RULE_functionArguments = 47, RULE_argumentList = 48, RULE_primaryExpression = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalVariablesSection", "functionSection", "mainSection", 
			"structDeclaration", "structFieldWithSemicolon", "structFieldWithComma", 
			"functionDeclaration", "procedureDeclaration", "functionWithReturn", 
			"parameterList", "parameter", "functionBody", "declaration", "localVariableSection", 
			"variableDeclaration", "initializer", "structInitializer", "structFieldInitializer", 
			"arrayConstructor", "booleanLiteral", "arrayDeclaration", "arrayInitializer", 
			"type", "statement", "assignment", "ifStatement", "elseIfStatement", 
			"elseStatement", "block", "whileStatement", "doWhileStatement", "forStatement", 
			"returnStatement", "continueStatement", "breakStatement", "readStatement", 
			"printStatement", "expression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "comparisonExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "postfixExpression", "functionArguments", "argumentList", 
			"primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "':'", "','", "'('", "')'", "'['", "']'", 
			"'='", "'.'", "'VARIABILES>'", "'MUNERA>'", "'MAIOR>'", "'FINIS'", "'structura'", 
			"'finis'", "'esto'", "'series'", "'actio'", "'ratio'", "'si'", "'aliter'", 
			"'dum'", "'facere'", "'per'", "'reddere'", "'perge'", "'interrumpe'", 
			"'VARIABILES'", "'numerus'", "'decimalis'", "'textum'", "'littera'", 
			"'verum'", "'falsus'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'&&'", 
			"'||'", "'non'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", 
			"'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VARIABLES_SECTION", "FUNCTIONS_SECTION", "MAIN_SECTION", "FINIS_PROGRAM", 
			"STRUCTURA", "FINIS", "ESTO", "SERIES", "ACTIO", "RATIO", "SI", "ALITER", 
			"DUM", "FACERE", "PER", "REDDERE", "PERGE", "INTERRUMPE", "VARIABILES", 
			"NUMERUS", "DECIMALIS", "TEXTUM", "LITTERA", "VERUM", "FALSUS", "PLUS", 
			"MINUS", "MULT", "DIV", "PLUSPLUS", "MINUSMINUS", "AND", "OR", "NON", 
			"EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", 
			"READ", "PRINT", "NUMBER", "DECIMAL", "STRING", "CHAR", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Latin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainSectionContext mainSection() {
			return getRuleContext(MainSectionContext.class,0);
		}
		public TerminalNode FINIS_PROGRAM() { return getToken(LatinParser.FINIS_PROGRAM, 0); }
		public TerminalNode EOF() { return getToken(LatinParser.EOF, 0); }
		public GlobalVariablesSectionContext globalVariablesSection() {
			return getRuleContext(GlobalVariablesSectionContext.class,0);
		}
		public FunctionSectionContext functionSection() {
			return getRuleContext(FunctionSectionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLES_SECTION) {
				{
				setState(100);
				globalVariablesSection();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS_SECTION) {
				{
				setState(103);
				functionSection();
				}
			}

			setState(106);
			mainSection();
			setState(107);
			match(FINIS_PROGRAM);
			setState(108);
			match(T__0);
			setState(109);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVariablesSectionContext extends ParserRuleContext {
		public TerminalNode VARIABLES_SECTION() { return getToken(LatinParser.VARIABLES_SECTION, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public GlobalVariablesSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariablesSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterGlobalVariablesSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitGlobalVariablesSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitGlobalVariablesSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariablesSectionContext globalVariablesSection() throws RecognitionException {
		GlobalVariablesSectionContext _localctx = new GlobalVariablesSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalVariablesSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VARIABLES_SECTION);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(112);
				declaration();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSectionContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS_SECTION() { return getToken(LatinParser.FUNCTIONS_SECTION, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public FunctionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSectionContext functionSection() throws RecognitionException {
		FunctionSectionContext _localctx = new FunctionSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(FUNCTIONS_SECTION);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(119);
				functionDeclaration();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainSectionContext extends ParserRuleContext {
		public TerminalNode MAIN_SECTION() { return getToken(LatinParser.MAIN_SECTION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterMainSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitMainSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitMainSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSectionContext mainSection() throws RecognitionException {
		MainSectionContext _localctx = new MainSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(MAIN_SECTION);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCTURA() { return getToken(LatinParser.STRUCTURA, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public List<StructFieldWithSemicolonContext> structFieldWithSemicolon() {
			return getRuleContexts(StructFieldWithSemicolonContext.class);
		}
		public StructFieldWithSemicolonContext structFieldWithSemicolon(int i) {
			return getRuleContext(StructFieldWithSemicolonContext.class,i);
		}
		public List<StructFieldWithCommaContext> structFieldWithComma() {
			return getRuleContexts(StructFieldWithCommaContext.class);
		}
		public StructFieldWithCommaContext structFieldWithComma(int i) {
			return getRuleContext(StructFieldWithCommaContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structDeclaration);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(STRUCTURA);
				setState(133);
				match(ID);
				setState(134);
				match(T__1);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESTO || _la==SERIES) {
					{
					{
					setState(135);
					structFieldWithSemicolon();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__2);
				setState(142);
				match(FINIS);
				setState(143);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(STRUCTURA);
				setState(145);
				match(ID);
				setState(146);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESTO || _la==SERIES) {
					{
					{
					setState(147);
					structFieldWithComma();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__2);
				setState(154);
				match(FINIS);
				setState(155);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldWithSemicolonContext extends ParserRuleContext {
		public StructFieldWithSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldWithSemicolon; }
	 
		public StructFieldWithSemicolonContext() { }
		public void copyFrom(StructFieldWithSemicolonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructArrayFieldSemicolonContext extends StructFieldWithSemicolonContext {
		public TerminalNode SERIES() { return getToken(LatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructArrayFieldSemicolonContext(StructFieldWithSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructArrayFieldSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructArrayFieldSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructArrayFieldSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructVariableFieldSemicolonContext extends StructFieldWithSemicolonContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructVariableFieldSemicolonContext(StructFieldWithSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructVariableFieldSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructVariableFieldSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructVariableFieldSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructBooleanFieldSemicolonContext extends StructFieldWithSemicolonContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StructBooleanFieldSemicolonContext(StructFieldWithSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructBooleanFieldSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructBooleanFieldSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructBooleanFieldSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldWithSemicolonContext structFieldWithSemicolon() throws RecognitionException {
		StructFieldWithSemicolonContext _localctx = new StructFieldWithSemicolonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structFieldWithSemicolon);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new StructVariableFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ESTO);
				setState(159);
				match(ID);
				setState(160);
				match(T__3);
				setState(161);
				type();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(162);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				_localctx = new StructBooleanFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ESTO);
				setState(166);
				match(ID);
				setState(167);
				match(T__3);
				setState(168);
				booleanLiteral();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(169);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				_localctx = new StructArrayFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(SERIES);
				setState(173);
				match(ID);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(174);
					match(T__3);
					setState(175);
					type();
					}
				}

				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(178);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldWithCommaContext extends ParserRuleContext {
		public StructFieldWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldWithComma; }
	 
		public StructFieldWithCommaContext() { }
		public void copyFrom(StructFieldWithCommaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructBooleanFieldCommaContext extends StructFieldWithCommaContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StructBooleanFieldCommaContext(StructFieldWithCommaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructBooleanFieldComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructBooleanFieldComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructBooleanFieldComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructArrayFieldCommaContext extends StructFieldWithCommaContext {
		public TerminalNode SERIES() { return getToken(LatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructArrayFieldCommaContext(StructFieldWithCommaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructArrayFieldComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructArrayFieldComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructArrayFieldComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructVariableFieldCommaContext extends StructFieldWithCommaContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructVariableFieldCommaContext(StructFieldWithCommaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructVariableFieldComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructVariableFieldComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructVariableFieldComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldWithCommaContext structFieldWithComma() throws RecognitionException {
		StructFieldWithCommaContext _localctx = new StructFieldWithCommaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structFieldWithComma);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new StructVariableFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(ESTO);
				setState(184);
				match(ID);
				setState(185);
				match(T__3);
				setState(186);
				type();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(187);
					match(T__4);
					}
				}

				}
				break;
			case 2:
				_localctx = new StructBooleanFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ESTO);
				setState(191);
				match(ID);
				setState(192);
				match(T__3);
				setState(193);
				booleanLiteral();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(194);
					match(T__4);
					}
				}

				}
				break;
			case 3:
				_localctx = new StructArrayFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(SERIES);
				setState(198);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(199);
					match(T__3);
					setState(200);
					type();
					}
				}

				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(203);
					match(T__4);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionWithReturnContext functionWithReturn() {
			return getRuleContext(FunctionWithReturnContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				procedureDeclaration();
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				functionWithReturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode ACTIO() { return getToken(LatinParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ACTIO);
			setState(213);
			match(ID);
			setState(214);
			match(T__5);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(215);
				parameterList();
				}
			}

			setState(218);
			match(T__6);
			setState(219);
			functionBody();
			setState(220);
			match(FINIS);
			setState(221);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithReturnContext extends ParserRuleContext {
		public TerminalNode RATIO() { return getToken(LatinParser.RATIO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionWithReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionWithReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionWithReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionWithReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionWithReturnContext functionWithReturn() throws RecognitionException {
		FunctionWithReturnContext _localctx = new FunctionWithReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionWithReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(RATIO);
			setState(224);
			type();
			setState(225);
			match(ID);
			setState(226);
			match(T__5);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(227);
				parameterList();
				}
			}

			setState(230);
			match(T__6);
			setState(231);
			functionBody();
			setState(232);
			match(FINIS);
			setState(233);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterContext parameter;
		public List<ParameterContext> parameters = new ArrayList<ParameterContext>();
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((ParameterListContext)_localctx).parameter = parameter();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameter);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(236);
				match(T__4);
				setState(237);
				((ParameterListContext)_localctx).parameter = parameter();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameter);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ESTO);
			setState(244);
			match(ID);
			setState(245);
			match(T__3);
			setState(246);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public LocalVariableSectionContext localVariableSection() {
			return getRuleContext(LocalVariableSectionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__1);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(249);
				localVariableSection();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(252);
				statement();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				variableDeclaration();
				}
				break;
			case SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				arrayDeclaration();
				}
				break;
			case STRUCTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				structDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableSectionContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(LatinParser.VARIABILES, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public LocalVariableSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterLocalVariableSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitLocalVariableSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitLocalVariableSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableSectionContext localVariableSection() throws RecognitionException {
		LocalVariableSectionContext _localctx = new LocalVariableSectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localVariableSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(VARIABILES);
			setState(266);
			match(T__7);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(267);
				declaration();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanVarDeclarationContext extends VariableDeclarationContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanVarDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterBooleanVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitBooleanVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitBooleanVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalVarDeclarationContext extends VariableDeclarationContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public NormalVarDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterNormalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitNormalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitNormalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new NormalVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ESTO);
				setState(276);
				match(ID);
				setState(277);
				match(T__3);
				setState(278);
				type();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012164L) != 0)) {
					{
					setState(279);
					initializer();
					}
				}

				setState(282);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new BooleanVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(ESTO);
				setState(285);
				match(ID);
				setState(286);
				match(T__3);
				setState(287);
				booleanLiteral();
				setState(288);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	 
		public InitializerContext() { }
		public void copyFrom(InitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprInitContext extends InitializerContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprInitContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterExprInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitExprInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitExprInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructInitContext extends InitializerContext {
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public StructInitContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initializer);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case VERUM:
			case FALSUS:
			case PLUSPLUS:
			case MINUSMINUS:
			case NON:
			case NUMBER:
			case DECIMAL:
			case STRING:
			case CHAR:
			case ID:
				_localctx = new ExprInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				expression();
				}
				break;
			case T__1:
				_localctx = new StructInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				structInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructInitializerContext extends ParserRuleContext {
		public List<StructFieldInitializerContext> structFieldInitializer() {
			return getRuleContexts(StructFieldInitializerContext.class);
		}
		public StructFieldInitializerContext structFieldInitializer(int i) {
			return getRuleContext(StructFieldInitializerContext.class,i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_structInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__1);
			setState(297);
			structFieldInitializer();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(298);
				match(T__4);
				setState(299);
				structFieldInitializer();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldInitializerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public StructFieldInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructFieldInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructFieldInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructFieldInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldInitializerContext structFieldInitializer() throws RecognitionException {
		StructFieldInitializerContext _localctx = new StructFieldInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structFieldInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ID);
			setState(308);
			match(T__3);
			setState(309);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayConstructorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			type();
			setState(312);
			match(T__7);
			setState(313);
			expression();
			setState(314);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode VERUM() { return getToken(LatinParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(LatinParser.FALSUS, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==VERUM || _la==FALSUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(LatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SERIES);
			setState(319);
			match(ID);
			setState(320);
			match(T__7);
			setState(321);
			expression();
			setState(322);
			match(T__8);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(323);
				match(T__3);
				setState(324);
				type();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(327);
				arrayInitializer();
				}
			}

			setState(330);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__1);
			setState(333);
			((ArrayInitializerContext)_localctx).expression = expression();
			((ArrayInitializerContext)_localctx).values.add(((ArrayInitializerContext)_localctx).expression);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(334);
				match(T__4);
				setState(335);
				((ArrayInitializerContext)_localctx).expression = expression();
				((ArrayInitializerContext)_localctx).values.add(((ArrayInitializerContext)_localctx).expression);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(LatinParser.NUMERUS, 0); }
		public TerminalNode DECIMALIS() { return getToken(LatinParser.DECIMALIS, 0); }
		public TerminalNode TEXTUM() { return getToken(LatinParser.TEXTUM, 0); }
		public TerminalNode LITTERA() { return getToken(LatinParser.LITTERA, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230408363966464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStmtContext extends StatementContext {
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public ReadStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStmtContext extends StatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DoWhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				assignment();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				whileStatement();
				}
				break;
			case 4:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				doWhileStatement();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				forStatement();
				}
				break;
			case 6:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				returnStatement();
				}
				break;
			case 7:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				breakStatement();
				}
				break;
			case 8:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				continueStatement();
				}
				break;
			case 9:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				printStatement();
				}
				break;
			case 10:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				readStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			postfixExpression(0);
			setState(358);
			match(T__9);
			setState(359);
			initializer();
			setState(360);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(LatinParser.SI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SI);
			setState(363);
			match(T__5);
			setState(364);
			expression();
			setState(365);
			match(T__6);
			setState(366);
			block();
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					elseIfStatement();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(373);
				elseStatement();
				}
			}

			setState(376);
			match(FINIS);
			setState(377);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(LatinParser.ALITER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ALITER);
			setState(380);
			match(T__5);
			setState(381);
			expression();
			setState(382);
			match(T__6);
			setState(383);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(LatinParser.ALITER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ALITER);
			setState(386);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__1);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(389);
				statement();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(LatinParser.DUM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(DUM);
			setState(398);
			match(T__5);
			setState(399);
			expression();
			setState(400);
			match(T__6);
			setState(401);
			block();
			setState(402);
			match(FINIS);
			setState(403);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode FACERE() { return getToken(LatinParser.FACERE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DUM() { return getToken(LatinParser.DUM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(FACERE);
			setState(406);
			block();
			setState(407);
			match(DUM);
			setState(408);
			match(T__5);
			setState(409);
			expression();
			setState(410);
			match(T__6);
			setState(411);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(LatinParser.PER, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(PER);
			setState(414);
			match(T__5);
			setState(415);
			variableDeclaration();
			setState(416);
			expression();
			setState(417);
			match(T__0);
			setState(418);
			expression();
			setState(419);
			match(T__6);
			setState(420);
			block();
			setState(421);
			match(FINIS);
			setState(422);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode REDDERE() { return getToken(LatinParser.REDDERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(REDDERE);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012160L) != 0)) {
				{
				setState(425);
				expression();
				}
			}

			setState(428);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode PERGE() { return getToken(LatinParser.PERGE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(PERGE);
			setState(431);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode INTERRUMPE() { return getToken(LatinParser.INTERRUMPE, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(INTERRUMPE);
			setState(434);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LatinParser.READ, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558446456873156672L) != 0)) {
				{
				setState(436);
				postfixExpression(0);
				}
			}

			setState(439);
			match(READ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public List<TerminalNode> PRINT() { return getTokens(LatinParser.PRINT); }
		public TerminalNode PRINT(int i) {
			return getToken(LatinParser.PRINT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(PRINT);
			setState(442);
			((PrintStatementContext)_localctx).expression = expression();
			((PrintStatementContext)_localctx).expressions.add(((PrintStatementContext)_localctx).expression);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(443);
				match(PRINT);
				setState(444);
				((PrintStatementContext)_localctx).expression = expression();
				((PrintStatementContext)_localctx).expressions.add(((PrintStatementContext)_localctx).expression);
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			logicalOrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToLogicalAndExprContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public ToLogicalAndExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(LatinParser.OR, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public OrExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToLogicalAndExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(455);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(457);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(458);
					match(OR);
					setState(459);
					logicalAndExpression(0);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(LatinParser.AND, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToEqualityExprContext extends LogicalAndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public ToEqualityExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToEqualityExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(466);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(468);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(469);
					match(AND);
					setState(470);
					equalityExpression(0);
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualExprContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(LatinParser.EQUAL, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public EqualExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToComparisonExprContext extends EqualityExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ToComparisonExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualExprContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(LatinParser.NOT_EQUAL, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public NotEqualExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitNotEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToComparisonExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(477);
			comparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(479);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(480);
						match(EQUAL);
						setState(481);
						comparisonExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(482);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(483);
						match(NOT_EQUAL);
						setState(484);
						comparisonExpression(0);
						}
						break;
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToAdditiveExprContext extends ComparisonExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ToAdditiveExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterExprContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(LatinParser.GREATER, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public GreaterExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterGreaterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitGreaterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualExprContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(LatinParser.GREATER_EQUAL, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public GreaterEqualExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterGreaterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitGreaterEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitGreaterEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessExprContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode LESS() { return getToken(LatinParser.LESS, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LessExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterLessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitLessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitLessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualExprContext extends ComparisonExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode LESS_EQUAL() { return getToken(LatinParser.LESS_EQUAL, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LessEqualExprContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterLessEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitLessEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitLessEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAdditiveExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(491);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new LessExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(493);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(494);
						match(LESS);
						setState(495);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GreaterExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(496);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(497);
						match(GREATER);
						setState(498);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new LessEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(499);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(500);
						match(LESS_EQUAL);
						setState(501);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(502);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(503);
						match(GREATER_EQUAL);
						setState(504);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToMultiplicativeExprContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public ToMultiplicativeExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExprContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LatinParser.PLUS, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditionExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitAdditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitAdditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionExprContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LatinParser.MINUS, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public SubtractionExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterSubtractionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitSubtractionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitSubtractionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultiplicativeExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(511);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(513);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(514);
						match(PLUS);
						setState(515);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(516);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(517);
						match(MINUS);
						setState(518);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToUnaryExprContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ToUnaryExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionExprContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LatinParser.DIV, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public DivisionExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDivisionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDivisionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDivisionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExprContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LatinParser.MULT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicationExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(525);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(527);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(528);
						match(MULT);
						setState(529);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(530);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(531);
						match(DIV);
						setState(532);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToPostfixExprContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ToPostfixExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExprContext extends UnaryExpressionContext {
		public TerminalNode PLUSPLUS() { return getToken(LatinParser.PLUSPLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPreIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPreIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPreIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecrementExprContext extends UnaryExpressionContext {
		public TerminalNode MINUSMINUS() { return getToken(LatinParser.MINUSMINUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPreDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPreDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPreDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends UnaryExpressionContext {
		public TerminalNode NON() { return getToken(LatinParser.NON, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NotExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unaryExpression);
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(NON);
				setState(539);
				unaryExpression();
				}
				break;
			case PLUSPLUS:
				_localctx = new PreIncrementExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(PLUSPLUS);
				setState(541);
				unaryExpression();
				}
				break;
			case MINUSMINUS:
				_localctx = new PreDecrementExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(MINUSMINUS);
				setState(543);
				unaryExpression();
				}
				break;
			case T__5:
			case VERUM:
			case FALSUS:
			case NUMBER:
			case DECIMAL:
			case STRING:
			case CHAR:
			case ID:
				_localctx = new ToPostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(544);
				postfixExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public FunctionCallExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public MemberAccessExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterMemberAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitMemberAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitMemberAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToPrimaryExprContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ToPrimaryExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterToPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitToPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitToPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(548);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(560);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(550);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(551);
						match(T__7);
						setState(552);
						expression();
						setState(553);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new MemberAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(555);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(556);
						match(T__10);
						setState(557);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(558);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(559);
						functionArguments();
						}
						break;
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__5);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012160L) != 0)) {
				{
				setState(566);
				argumentList();
				}
			}

			setState(569);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((ArgumentListContext)_localctx).expression = expression();
			((ArgumentListContext)_localctx).arguments.add(((ArgumentListContext)_localctx).expression);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(572);
				match(T__4);
				setState(573);
				((ArgumentListContext)_localctx).expression = expression();
				((ArgumentListContext)_localctx).arguments.add(((ArgumentListContext)_localctx).expression);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode VERUM() { return getToken(LatinParser.VERUM, 0); }
		public TrueLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterTrueLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitTrueLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitTrueLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode NUMBER() { return getToken(LatinParser.NUMBER, 0); }
		public NumberLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterNumberLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitNumberLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitNumberLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode FALSUS() { return getToken(LatinParser.FALSUS, 0); }
		public FalseLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterFalseLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitFalseLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitFalseLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(LatinParser.STRING, 0); }
		public StringLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStringLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStringLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStringLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode CHAR() { return getToken(LatinParser.CHAR, 0); }
		public CharLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterCharLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitCharLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitCharLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExprContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public VariableExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExprContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralExprContext extends PrimaryExpressionContext {
		public TerminalNode DECIMAL() { return getToken(LatinParser.DECIMAL, 0); }
		public DecimalLiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDecimalLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDecimalLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDecimalLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primaryExpression);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(NUMBER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(DECIMAL);
				}
				break;
			case STRING:
				_localctx = new StringLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				match(CHAR);
				}
				break;
			case VERUM:
				_localctx = new TrueLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new FalseLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
				match(FALSUS);
				}
				break;
			case ID:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(585);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new ParenthesizedExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(586);
				match(T__5);
				setState(587);
				expression();
				setState(588);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 40:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 41:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 42:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 43:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 44:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 46:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u0251\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0003\u0000f\b\u0000\u0001\u0000\u0003\u0000i\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001r\b\u0001\n\u0001\f\u0001u\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004"+
		"\u008c\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009d\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a4\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00ab\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00b1\b\u0005\u0001\u0005\u0003\u0005\u00b4\b\u0005\u0003"+
		"\u0005\u00b6\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00bd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0001\u0006\u0003\u0006\u00cd"+
		"\b\u0006\u0003\u0006\u00cf\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d9\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00e5\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ef\b\n\n\n\f\n\u00f2\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00fb\b\f"+
		"\u0001\f\u0005\f\u00fe\b\f\n\f\f\f\u0101\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0108\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u010d\b\u000e\n\u000e\f\u000e\u0110\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0119\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0123\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0127\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u012d\b\u0011\n\u0011\f\u0011\u0130\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0146\b\u0015\u0001\u0015\u0003\u0015\u0149"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0151\b\u0016\n\u0016\f\u0016\u0154\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0164\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0171\b\u001a\n\u001a\f\u001a\u0174"+
		"\t\u001a\u0001\u001a\u0003\u001a\u0177\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0187\b\u001d\n\u001d\f\u001d\u018a\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0003!\u01ab\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0001$\u0003$\u01b6\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u01be\b%\n%\f%\u01c1\t%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01cd\b\'\n\'\f\'\u01d0\t\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u01d8\b(\n(\f(\u01db"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u01e6\b)\n)\f)\u01e9\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01fa"+
		"\b*\n*\f*\u01fd\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u0208\b+\n+\f+\u020b\t+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0005,\u0216\b,\n,\f,\u0219\t,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0222\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u0231\b.\n.\f.\u0234\t.\u0001/\u0001/\u0003/\u0238\b/\u0001/"+
		"\u0001/\u00010\u00010\u00010\u00050\u023f\b0\n0\f0\u0242\t0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u024f\b1\u00011\u0000\u0007NPRTVX\\2\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`b\u0000\u0002\u0001\u0000#$\u0002\u0000\u001f\"::\u026c"+
		"\u0000e\u0001\u0000\u0000\u0000\u0002o\u0001\u0000\u0000\u0000\u0004v"+
		"\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u009c\u0001"+
		"\u0000\u0000\u0000\n\u00b5\u0001\u0000\u0000\u0000\f\u00ce\u0001\u0000"+
		"\u0000\u0000\u000e\u00d2\u0001\u0000\u0000\u0000\u0010\u00d4\u0001\u0000"+
		"\u0000\u0000\u0012\u00df\u0001\u0000\u0000\u0000\u0014\u00eb\u0001\u0000"+
		"\u0000\u0000\u0016\u00f3\u0001\u0000\u0000\u0000\u0018\u00f8\u0001\u0000"+
		"\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000\u001c\u0109\u0001\u0000"+
		"\u0000\u0000\u001e\u0122\u0001\u0000\u0000\u0000 \u0126\u0001\u0000\u0000"+
		"\u0000\"\u0128\u0001\u0000\u0000\u0000$\u0133\u0001\u0000\u0000\u0000"+
		"&\u0137\u0001\u0000\u0000\u0000(\u013c\u0001\u0000\u0000\u0000*\u013e"+
		"\u0001\u0000\u0000\u0000,\u014c\u0001\u0000\u0000\u0000.\u0157\u0001\u0000"+
		"\u0000\u00000\u0163\u0001\u0000\u0000\u00002\u0165\u0001\u0000\u0000\u0000"+
		"4\u016a\u0001\u0000\u0000\u00006\u017b\u0001\u0000\u0000\u00008\u0181"+
		"\u0001\u0000\u0000\u0000:\u0184\u0001\u0000\u0000\u0000<\u018d\u0001\u0000"+
		"\u0000\u0000>\u0195\u0001\u0000\u0000\u0000@\u019d\u0001\u0000\u0000\u0000"+
		"B\u01a8\u0001\u0000\u0000\u0000D\u01ae\u0001\u0000\u0000\u0000F\u01b1"+
		"\u0001\u0000\u0000\u0000H\u01b5\u0001\u0000\u0000\u0000J\u01b9\u0001\u0000"+
		"\u0000\u0000L\u01c4\u0001\u0000\u0000\u0000N\u01c6\u0001\u0000\u0000\u0000"+
		"P\u01d1\u0001\u0000\u0000\u0000R\u01dc\u0001\u0000\u0000\u0000T\u01ea"+
		"\u0001\u0000\u0000\u0000V\u01fe\u0001\u0000\u0000\u0000X\u020c\u0001\u0000"+
		"\u0000\u0000Z\u0221\u0001\u0000\u0000\u0000\\\u0223\u0001\u0000\u0000"+
		"\u0000^\u0235\u0001\u0000\u0000\u0000`\u023b\u0001\u0000\u0000\u0000b"+
		"\u024e\u0001\u0000\u0000\u0000df\u0003\u0002\u0001\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0003"+
		"\u0004\u0002\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0005\u000f\u0000"+
		"\u0000lm\u0005\u0001\u0000\u0000mn\u0005\u0000\u0000\u0001n\u0001\u0001"+
		"\u0000\u0000\u0000os\u0005\f\u0000\u0000pr\u0003\u001a\r\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\u0003\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vz\u0005\r\u0000\u0000wy\u0003\u000e\u0007\u0000xw\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0081\u0005\u000e\u0000\u0000~\u0080\u00030\u0018\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0007"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0010\u0000\u0000\u0085\u0086\u0005:\u0000\u0000\u0086\u008a\u0005"+
		"\u0002\u0000\u0000\u0087\u0089\u0003\n\u0005\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003"+
		"\u0000\u0000\u008e\u008f\u0005\u0011\u0000\u0000\u008f\u009d\u0005\u0001"+
		"\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091\u0092\u0005:\u0000"+
		"\u0000\u0092\u0096\u0005\u0002\u0000\u0000\u0093\u0095\u0003\f\u0006\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005\u0011\u0000\u0000"+
		"\u009b\u009d\u0005\u0001\u0000\u0000\u009c\u0084\u0001\u0000\u0000\u0000"+
		"\u009c\u0090\u0001\u0000\u0000\u0000\u009d\t\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0012\u0000\u0000\u009f\u00a0\u0005:\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0004\u0000\u0000\u00a1\u00a3\u0003.\u0017\u0000\u00a2\u00a4\u0005"+
		"\u0001\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00b6\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0012\u0000\u0000\u00a6\u00a7\u0005:\u0000\u0000\u00a7\u00a8\u0005\u0004"+
		"\u0000\u0000\u00a8\u00aa\u0003(\u0014\u0000\u00a9\u00ab\u0005\u0001\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00b6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000"+
		"\u0000\u00ad\u00b0\u0005:\u0000\u0000\u00ae\u00af\u0005\u0004\u0000\u0000"+
		"\u00af\u00b1\u0003.\u0017\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0005\u0001\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5"+
		"\u009e\u0001\u0000\u0000\u0000\u00b5\u00a5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b6\u000b\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0012\u0000\u0000\u00b8\u00b9\u0005:\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0004\u0000\u0000\u00ba\u00bc\u0003.\u0017\u0000\u00bb\u00bd\u0005"+
		"\u0005\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00cf\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0012\u0000\u0000\u00bf\u00c0\u0005:\u0000\u0000\u00c0\u00c1\u0005\u0004"+
		"\u0000\u0000\u00c1\u00c3\u0003(\u0014\u0000\u00c2\u00c4\u0005\u0005\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00cf\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0013\u0000"+
		"\u0000\u00c6\u00c9\u0005:\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000"+
		"\u00c8\u00ca\u0003.\u0017\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cd\u0005\u0005\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ce\u00be\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cf\r\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0003\u0010\b\u0000\u00d1\u00d3\u0003\u0012\t\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u000f\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000\u00d5\u00d6\u0005"+
		":\u0000\u0000\u00d6\u00d8\u0005\u0006\u0000\u0000\u00d7\u00d9\u0003\u0014"+
		"\n\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0007\u0000"+
		"\u0000\u00db\u00dc\u0003\u0018\f\u0000\u00dc\u00dd\u0005\u0011\u0000\u0000"+
		"\u00dd\u00de\u0005\u0001\u0000\u0000\u00de\u0011\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\u0015\u0000\u0000\u00e0\u00e1\u0003.\u0017\u0000\u00e1"+
		"\u00e2\u0005:\u0000\u0000\u00e2\u00e4\u0005\u0006\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0014\n\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0007\u0000\u0000\u00e7\u00e8\u0003\u0018\f\u0000\u00e8\u00e9\u0005\u0011"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0001\u0000\u0000\u00ea\u0013\u0001\u0000"+
		"\u0000\u0000\u00eb\u00f0\u0003\u0016\u000b\u0000\u00ec\u00ed\u0005\u0005"+
		"\u0000\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0015\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0012"+
		"\u0000\u0000\u00f4\u00f5\u0005:\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000"+
		"\u0000\u00f6\u00f7\u0003.\u0017\u0000\u00f7\u0017\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fa\u0005\u0002\u0000\u0000\u00f9\u00fb\u0003\u001c\u000e\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00ff\u0001\u0000\u0000\u0000\u00fc\u00fe\u00030\u0018\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u0003\u0000\u0000\u0103\u0019\u0001\u0000\u0000\u0000\u0104"+
		"\u0108\u0003\u001e\u000f\u0000\u0105\u0108\u0003*\u0015\u0000\u0106\u0108"+
		"\u0003\b\u0004\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u001b\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u001e\u0000\u0000\u010a\u010e\u0005"+
		"\b\u0000\u0000\u010b\u010d\u0003\u001a\r\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005\t\u0000"+
		"\u0000\u0112\u001d\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0012\u0000"+
		"\u0000\u0114\u0115\u0005:\u0000\u0000\u0115\u0116\u0005\u0004\u0000\u0000"+
		"\u0116\u0118\u0003.\u0017\u0000\u0117\u0119\u0003 \u0010\u0000\u0118\u0117"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0001\u0000\u0000\u011b\u0123"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0012\u0000\u0000\u011d\u011e"+
		"\u0005:\u0000\u0000\u011e\u011f\u0005\u0004\u0000\u0000\u011f\u0120\u0003"+
		"(\u0014\u0000\u0120\u0121\u0005\u0001\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0113\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000"+
		"\u0000\u0000\u0123\u001f\u0001\u0000\u0000\u0000\u0124\u0127\u0003L&\u0000"+
		"\u0125\u0127\u0003\"\u0011\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0127!\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005\u0002\u0000\u0000\u0129\u012e\u0003$\u0012\u0000\u012a\u012b\u0005"+
		"\u0005\u0000\u0000\u012b\u012d\u0003$\u0012\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0003"+
		"\u0000\u0000\u0132#\u0001\u0000\u0000\u0000\u0133\u0134\u0005:\u0000\u0000"+
		"\u0134\u0135\u0005\u0004\u0000\u0000\u0135\u0136\u0003 \u0010\u0000\u0136"+
		"%\u0001\u0000\u0000\u0000\u0137\u0138\u0003.\u0017\u0000\u0138\u0139\u0005"+
		"\b\u0000\u0000\u0139\u013a\u0003L&\u0000\u013a\u013b\u0005\t\u0000\u0000"+
		"\u013b\'\u0001\u0000\u0000\u0000\u013c\u013d\u0007\u0000\u0000\u0000\u013d"+
		")\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0013\u0000\u0000\u013f\u0140"+
		"\u0005:\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0142\u0003"+
		"L&\u0000\u0142\u0145\u0005\t\u0000\u0000\u0143\u0144\u0005\u0004\u0000"+
		"\u0000\u0144\u0146\u0003.\u0017\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0003,\u0016\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u0001\u0000\u0000\u014b+\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\u0002\u0000\u0000\u014d\u0152\u0003L&\u0000\u014e\u014f\u0005\u0005"+
		"\u0000\u0000\u014f\u0151\u0003L&\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000"+
		"\u0156-\u0001\u0000\u0000\u0000\u0157\u0158\u0007\u0001\u0000\u0000\u0158"+
		"/\u0001\u0000\u0000\u0000\u0159\u0164\u00032\u0019\u0000\u015a\u0164\u0003"+
		"4\u001a\u0000\u015b\u0164\u0003<\u001e\u0000\u015c\u0164\u0003>\u001f"+
		"\u0000\u015d\u0164\u0003@ \u0000\u015e\u0164\u0003B!\u0000\u015f\u0164"+
		"\u0003F#\u0000\u0160\u0164\u0003D\"\u0000\u0161\u0164\u0003J%\u0000\u0162"+
		"\u0164\u0003H$\u0000\u0163\u0159\u0001\u0000\u0000\u0000\u0163\u015a\u0001"+
		"\u0000\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0163\u015c\u0001"+
		"\u0000\u0000\u0000\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u015e\u0001"+
		"\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0163\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001"+
		"\u0000\u0000\u0000\u01641\u0001\u0000\u0000\u0000\u0165\u0166\u0003\\"+
		".\u0000\u0166\u0167\u0005\n\u0000\u0000\u0167\u0168\u0003 \u0010\u0000"+
		"\u0168\u0169\u0005\u0001\u0000\u0000\u01693\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\u0016\u0000\u0000\u016b\u016c\u0005\u0006\u0000\u0000\u016c"+
		"\u016d\u0003L&\u0000\u016d\u016e\u0005\u0007\u0000\u0000\u016e\u0172\u0003"+
		":\u001d\u0000\u016f\u0171\u00036\u001b\u0000\u0170\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u00038\u001c\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0011\u0000\u0000"+
		"\u0179\u017a\u0005\u0001\u0000\u0000\u017a5\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005\u0017\u0000\u0000\u017c\u017d\u0005\u0006\u0000\u0000\u017d"+
		"\u017e\u0003L&\u0000\u017e\u017f\u0005\u0007\u0000\u0000\u017f\u0180\u0003"+
		":\u001d\u0000\u01807\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0017\u0000"+
		"\u0000\u0182\u0183\u0003:\u001d\u0000\u01839\u0001\u0000\u0000\u0000\u0184"+
		"\u0188\u0005\u0002\u0000\u0000\u0185\u0187\u00030\u0018\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\u0003\u0000\u0000\u018c;\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"\u0018\u0000\u0000\u018e\u018f\u0005\u0006\u0000\u0000\u018f\u0190\u0003"+
		"L&\u0000\u0190\u0191\u0005\u0007\u0000\u0000\u0191\u0192\u0003:\u001d"+
		"\u0000\u0192\u0193\u0005\u0011\u0000\u0000\u0193\u0194\u0005\u0001\u0000"+
		"\u0000\u0194=\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u0019\u0000\u0000"+
		"\u0196\u0197\u0003:\u001d\u0000\u0197\u0198\u0005\u0018\u0000\u0000\u0198"+
		"\u0199\u0005\u0006\u0000\u0000\u0199\u019a\u0003L&\u0000\u019a\u019b\u0005"+
		"\u0007\u0000\u0000\u019b\u019c\u0005\u0001\u0000\u0000\u019c?\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0005\u001a\u0000\u0000\u019e\u019f\u0005\u0006"+
		"\u0000\u0000\u019f\u01a0\u0003\u001e\u000f\u0000\u01a0\u01a1\u0003L&\u0000"+
		"\u01a1\u01a2\u0005\u0001\u0000\u0000\u01a2\u01a3\u0003L&\u0000\u01a3\u01a4"+
		"\u0005\u0007\u0000\u0000\u01a4\u01a5\u0003:\u001d\u0000\u01a5\u01a6\u0005"+
		"\u0011\u0000\u0000\u01a6\u01a7\u0005\u0001\u0000\u0000\u01a7A\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0005\u001b\u0000\u0000\u01a9\u01ab\u0003L&\u0000"+
		"\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u0001\u0000\u0000"+
		"\u01adC\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u001c\u0000\u0000\u01af"+
		"\u01b0\u0005\u0001\u0000\u0000\u01b0E\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005\u001d\u0000\u0000\u01b2\u01b3\u0005\u0001\u0000\u0000\u01b3G\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b6\u0003\\.\u0000\u01b5\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u00054\u0000\u0000\u01b8I\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u00055\u0000\u0000\u01ba\u01bf\u0003L&\u0000\u01bb\u01bc"+
		"\u00055\u0000\u0000\u01bc\u01be\u0003L&\u0000\u01bd\u01bb\u0001\u0000"+
		"\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0001"+
		"\u0000\u0000\u01c3K\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003N\'\u0000"+
		"\u01c5M\u0001\u0000\u0000\u0000\u01c6\u01c7\u0006\'\uffff\uffff\u0000"+
		"\u01c7\u01c8\u0003P(\u0000\u01c8\u01ce\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\n\u0002\u0000\u0000\u01ca\u01cb\u0005,\u0000\u0000\u01cb\u01cd\u0003"+
		"P(\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cfO\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0006(\uffff\uffff\u0000\u01d2\u01d3\u0003R)\u0000\u01d3"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d4\u01d5\n\u0002\u0000\u0000\u01d5\u01d6"+
		"\u0005+\u0000\u0000\u01d6\u01d8\u0003R)\u0000\u01d7\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01daQ\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0006)\uffff\uffff"+
		"\u0000\u01dd\u01de\u0003T*\u0000\u01de\u01e7\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\n\u0003\u0000\u0000\u01e0\u01e1\u0005.\u0000\u0000\u01e1\u01e6"+
		"\u0003T*\u0000\u01e2\u01e3\n\u0002\u0000\u0000\u01e3\u01e4\u0005/\u0000"+
		"\u0000\u01e4\u01e6\u0003T*\u0000\u01e5\u01df\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"S\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0006*\uffff\uffff\u0000\u01eb\u01ec\u0003V+\u0000\u01ec\u01fb\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\n\u0005\u0000\u0000\u01ee\u01ef\u00050"+
		"\u0000\u0000\u01ef\u01fa\u0003V+\u0000\u01f0\u01f1\n\u0004\u0000\u0000"+
		"\u01f1\u01f2\u00051\u0000\u0000\u01f2\u01fa\u0003V+\u0000\u01f3\u01f4"+
		"\n\u0003\u0000\u0000\u01f4\u01f5\u00052\u0000\u0000\u01f5\u01fa\u0003"+
		"V+\u0000\u01f6\u01f7\n\u0002\u0000\u0000\u01f7\u01f8\u00053\u0000\u0000"+
		"\u01f8\u01fa\u0003V+\u0000\u01f9\u01ed\u0001\u0000\u0000\u0000\u01f9\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f3\u0001\u0000\u0000\u0000\u01f9\u01f6"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcU\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0006"+
		"+\uffff\uffff\u0000\u01ff\u0200\u0003X,\u0000\u0200\u0209\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\n\u0003\u0000\u0000\u0202\u0203\u0005%\u0000"+
		"\u0000\u0203\u0208\u0003X,\u0000\u0204\u0205\n\u0002\u0000\u0000\u0205"+
		"\u0206\u0005&\u0000\u0000\u0206\u0208\u0003X,\u0000\u0207\u0201\u0001"+
		"\u0000\u0000\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0208\u020b\u0001"+
		"\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020aW\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0006,\uffff\uffff\u0000\u020d\u020e\u0003Z-"+
		"\u0000\u020e\u0217\u0001\u0000\u0000\u0000\u020f\u0210\n\u0003\u0000\u0000"+
		"\u0210\u0211\u0005\'\u0000\u0000\u0211\u0216\u0003Z-\u0000\u0212\u0213"+
		"\n\u0002\u0000\u0000\u0213\u0214\u0005(\u0000\u0000\u0214\u0216\u0003"+
		"Z-\u0000\u0215\u020f\u0001\u0000\u0000\u0000\u0215\u0212\u0001\u0000\u0000"+
		"\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218Y\u0001\u0000\u0000\u0000"+
		"\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0005-\u0000\u0000\u021b"+
		"\u0222\u0003Z-\u0000\u021c\u021d\u0005)\u0000\u0000\u021d\u0222\u0003"+
		"Z-\u0000\u021e\u021f\u0005*\u0000\u0000\u021f\u0222\u0003Z-\u0000\u0220"+
		"\u0222\u0003\\.\u0000\u0221\u021a\u0001\u0000\u0000\u0000\u0221\u021c"+
		"\u0001\u0000\u0000\u0000\u0221\u021e\u0001\u0000\u0000\u0000\u0221\u0220"+
		"\u0001\u0000\u0000\u0000\u0222[\u0001\u0000\u0000\u0000\u0223\u0224\u0006"+
		".\uffff\uffff\u0000\u0224\u0225\u0003b1\u0000\u0225\u0232\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\n\u0004\u0000\u0000\u0227\u0228\u0005\b\u0000"+
		"\u0000\u0228\u0229\u0003L&\u0000\u0229\u022a\u0005\t\u0000\u0000\u022a"+
		"\u0231\u0001\u0000\u0000\u0000\u022b\u022c\n\u0003\u0000\u0000\u022c\u022d"+
		"\u0005\u000b\u0000\u0000\u022d\u0231\u0005:\u0000\u0000\u022e\u022f\n"+
		"\u0002\u0000\u0000\u022f\u0231\u0003^/\u0000\u0230\u0226\u0001\u0000\u0000"+
		"\u0000\u0230\u022b\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233]\u0001\u0000\u0000\u0000"+
		"\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0237\u0005\u0006\u0000\u0000"+
		"\u0236\u0238\u0003`0\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0005\u0007\u0000\u0000\u023a_\u0001\u0000\u0000\u0000\u023b\u0240\u0003"+
		"L&\u0000\u023c\u023d\u0005\u0005\u0000\u0000\u023d\u023f\u0003L&\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241a\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243"+
		"\u024f\u00056\u0000\u0000\u0244\u024f\u00057\u0000\u0000\u0245\u024f\u0005"+
		"8\u0000\u0000\u0246\u024f\u00059\u0000\u0000\u0247\u024f\u0005#\u0000"+
		"\u0000\u0248\u024f\u0005$\u0000\u0000\u0249\u024f\u0005:\u0000\u0000\u024a"+
		"\u024b\u0005\u0006\u0000\u0000\u024b\u024c\u0003L&\u0000\u024c\u024d\u0005"+
		"\u0007\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0243\u0001"+
		"\u0000\u0000\u0000\u024e\u0244\u0001\u0000\u0000\u0000\u024e\u0245\u0001"+
		"\u0000\u0000\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024e\u0247\u0001"+
		"\u0000\u0000\u0000\u024e\u0248\u0001\u0000\u0000\u0000\u024e\u0249\u0001"+
		"\u0000\u0000\u0000\u024e\u024a\u0001\u0000\u0000\u0000\u024fc\u0001\u0000"+
		"\u0000\u00008ehsz\u0081\u008a\u0096\u009c\u00a3\u00aa\u00b0\u00b3\u00b5"+
		"\u00bc\u00c3\u00c9\u00cc\u00ce\u00d2\u00d8\u00e4\u00f0\u00fa\u00ff\u0107"+
		"\u010e\u0118\u0122\u0126\u012e\u0145\u0148\u0152\u0163\u0172\u0176\u0188"+
		"\u01aa\u01b5\u01bf\u01ce\u01d9\u01e5\u01e7\u01f9\u01fb\u0207\u0209\u0215"+
		"\u0217\u0221\u0230\u0232\u0237\u0240\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}