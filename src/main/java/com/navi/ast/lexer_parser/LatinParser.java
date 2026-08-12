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
		RULE_statement = 24, RULE_assignment = 25, RULE_incrementStatement = 26, 
		RULE_incrementableExpression = 27, RULE_ifStatement = 28, RULE_elseIfStatement = 29, 
		RULE_elseStatement = 30, RULE_block = 31, RULE_whileStatement = 32, RULE_doWhileStatement = 33, 
		RULE_forStatement = 34, RULE_returnStatement = 35, RULE_continueStatement = 36, 
		RULE_breakStatement = 37, RULE_readStatement = 38, RULE_printStatement = 39, 
		RULE_expression = 40, RULE_logicalOrExpression = 41, RULE_logicalAndExpression = 42, 
		RULE_equalityExpression = 43, RULE_comparisonExpression = 44, RULE_additiveExpression = 45, 
		RULE_multiplicativeExpression = 46, RULE_unaryExpression = 47, RULE_postfixExpression = 48, 
		RULE_functionArguments = 49, RULE_argumentList = 50, RULE_primaryExpression = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalVariablesSection", "functionSection", "mainSection", 
			"structDeclaration", "structFieldWithSemicolon", "structFieldWithComma", 
			"functionDeclaration", "procedureDeclaration", "functionWithReturn", 
			"parameterList", "parameter", "functionBody", "declaration", "localVariableSection", 
			"variableDeclaration", "initializer", "structInitializer", "structFieldInitializer", 
			"arrayConstructor", "booleanLiteral", "arrayDeclaration", "arrayInitializer", 
			"type", "statement", "assignment", "incrementStatement", "incrementableExpression", 
			"ifStatement", "elseIfStatement", "elseStatement", "block", "whileStatement", 
			"doWhileStatement", "forStatement", "returnStatement", "continueStatement", 
			"breakStatement", "readStatement", "printStatement", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"postfixExpression", "functionArguments", "argumentList", "primaryExpression"
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLES_SECTION) {
				{
				setState(104);
				globalVariablesSection();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS_SECTION) {
				{
				setState(107);
				functionSection();
				}
			}

			setState(110);
			mainSection();
			setState(111);
			match(FINIS_PROGRAM);
			setState(112);
			match(T__0);
			setState(113);
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
			setState(115);
			match(VARIABLES_SECTION);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(116);
				declaration();
				}
				}
				setState(121);
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
			setState(122);
			match(FUNCTIONS_SECTION);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(123);
				functionDeclaration();
				}
				}
				setState(128);
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
			setState(129);
			match(MAIN_SECTION);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(STRUCTURA);
				setState(137);
				match(ID);
				setState(138);
				match(T__1);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESTO || _la==SERIES) {
					{
					{
					setState(139);
					structFieldWithSemicolon();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__2);
				setState(146);
				match(FINIS);
				setState(147);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(STRUCTURA);
				setState(149);
				match(ID);
				setState(150);
				match(T__1);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESTO || _la==SERIES) {
					{
					{
					setState(151);
					structFieldWithComma();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__2);
				setState(158);
				match(FINIS);
				setState(159);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new StructVariableFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ESTO);
				setState(163);
				match(ID);
				setState(164);
				match(T__3);
				setState(165);
				type();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(166);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				_localctx = new StructBooleanFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ESTO);
				setState(170);
				match(ID);
				setState(171);
				match(T__3);
				setState(172);
				booleanLiteral();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(173);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				_localctx = new StructArrayFieldSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(SERIES);
				setState(177);
				match(ID);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(178);
					match(T__3);
					setState(179);
					type();
					}
				}

				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(182);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new StructVariableFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ESTO);
				setState(188);
				match(ID);
				setState(189);
				match(T__3);
				setState(190);
				type();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(191);
					match(T__4);
					}
				}

				}
				break;
			case 2:
				_localctx = new StructBooleanFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ESTO);
				setState(195);
				match(ID);
				setState(196);
				match(T__3);
				setState(197);
				booleanLiteral();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(198);
					match(T__4);
					}
				}

				}
				break;
			case 3:
				_localctx = new StructArrayFieldCommaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(SERIES);
				setState(202);
				match(ID);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(203);
					match(T__3);
					setState(204);
					type();
					}
				}

				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(207);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				procedureDeclaration();
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
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
			setState(216);
			match(ACTIO);
			setState(217);
			match(ID);
			setState(218);
			match(T__5);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(219);
				parameterList();
				}
			}

			setState(222);
			match(T__6);
			setState(223);
			functionBody();
			setState(224);
			match(FINIS);
			setState(225);
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
			setState(227);
			match(RATIO);
			setState(228);
			type();
			setState(229);
			match(ID);
			setState(230);
			match(T__5);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(231);
				parameterList();
				}
			}

			setState(234);
			match(T__6);
			setState(235);
			functionBody();
			setState(236);
			match(FINIS);
			setState(237);
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
			setState(239);
			((ParameterListContext)_localctx).parameter = parameter();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameter);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(240);
				match(T__4);
				setState(241);
				((ParameterListContext)_localctx).parameter = parameter();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameter);
				}
				}
				setState(246);
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
			setState(247);
			match(ESTO);
			setState(248);
			match(ID);
			setState(249);
			match(T__3);
			setState(250);
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
			setState(252);
			match(T__1);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(253);
				localVariableSection();
				}
			}

			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(256);
				statement();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				variableDeclaration();
				}
				break;
			case SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				arrayDeclaration();
				}
				break;
			case STRUCTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
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
			setState(269);
			match(VARIABILES);
			setState(270);
			match(T__7);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(271);
				declaration();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new NormalVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ESTO);
				setState(280);
				match(ID);
				setState(281);
				match(T__3);
				setState(282);
				type();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558481916123152452L) != 0)) {
					{
					setState(283);
					initializer();
					}
				}

				setState(286);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new BooleanVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(ESTO);
				setState(289);
				match(ID);
				setState(290);
				match(T__3);
				setState(291);
				booleanLiteral();
				setState(292);
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
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case VERUM:
			case FALSUS:
			case MINUS:
			case NON:
			case NUMBER:
			case DECIMAL:
			case STRING:
			case CHAR:
			case ID:
				_localctx = new ExprInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expression();
				}
				break;
			case T__1:
				_localctx = new StructInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
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
			setState(300);
			match(T__1);
			setState(301);
			structFieldInitializer();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(302);
				match(T__4);
				setState(303);
				structFieldInitializer();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
			setState(311);
			match(ID);
			setState(312);
			match(T__3);
			setState(313);
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
			setState(315);
			type();
			setState(316);
			match(T__7);
			setState(317);
			expression();
			setState(318);
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
			setState(320);
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
			setState(322);
			match(SERIES);
			setState(323);
			match(ID);
			setState(324);
			match(T__7);
			setState(325);
			expression();
			setState(326);
			match(T__8);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(327);
				match(T__3);
				setState(328);
				type();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(331);
				arrayInitializer();
				}
			}

			setState(334);
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
			setState(336);
			match(T__1);
			setState(337);
			((ArrayInitializerContext)_localctx).expression = expression();
			((ArrayInitializerContext)_localctx).values.add(((ArrayInitializerContext)_localctx).expression);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(338);
				match(T__4);
				setState(339);
				((ArrayInitializerContext)_localctx).expression = expression();
				((ArrayInitializerContext)_localctx).values.add(((ArrayInitializerContext)_localctx).expression);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
			setState(347);
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
	public static class IncrementStmtContext extends StatementContext {
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
		}
		public IncrementStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIncrementStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIncrementStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIncrementStmt(this);
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
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				assignment();
				}
				break;
			case 2:
				_localctx = new IncrementStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				incrementStatement();
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				whileStatement();
				}
				break;
			case 5:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				doWhileStatement();
				}
				break;
			case 6:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				forStatement();
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				returnStatement();
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				breakStatement();
				}
				break;
			case 9:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(357);
				continueStatement();
				}
				break;
			case 10:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(358);
				printStatement();
				}
				break;
			case 11:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(359);
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
			setState(362);
			postfixExpression(0);
			setState(363);
			match(T__9);
			setState(364);
			initializer();
			setState(365);
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
	public static class IncrementStatementContext extends ParserRuleContext {
		public IncrementableExpressionContext incrementableExpression() {
			return getRuleContext(IncrementableExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(LatinParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(LatinParser.MINUSMINUS, 0); }
		public IncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIncrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIncrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementStatementContext incrementStatement() throws RecognitionException {
		IncrementStatementContext _localctx = new IncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_incrementStatement);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				incrementableExpression();
				setState(368);
				match(PLUSPLUS);
				setState(369);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				incrementableExpression();
				setState(372);
				match(MINUSMINUS);
				setState(373);
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
	public static class IncrementableExpressionContext extends ParserRuleContext {
		public IncrementableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementableExpression; }
	 
		public IncrementableExpressionContext() { }
		public void copyFrom(IncrementableExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementVariableContext extends IncrementableExpressionContext {
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public IncrementVariableContext(IncrementableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIncrementVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIncrementVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIncrementVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementMemberAccessContext extends IncrementableExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public IncrementMemberAccessContext(IncrementableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIncrementMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIncrementMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIncrementMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementArrayAccessContext extends IncrementableExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementArrayAccessContext(IncrementableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterIncrementArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitIncrementArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitIncrementArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementableExpressionContext incrementableExpression() throws RecognitionException {
		IncrementableExpressionContext _localctx = new IncrementableExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_incrementableExpression);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new IncrementVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IncrementArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				postfixExpression(0);
				setState(379);
				match(T__7);
				setState(380);
				expression();
				setState(381);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new IncrementMemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				postfixExpression(0);
				setState(384);
				match(T__10);
				setState(385);
				match(ID);
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
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(SI);
			setState(390);
			match(T__5);
			setState(391);
			expression();
			setState(392);
			match(T__6);
			setState(393);
			block();
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					elseIfStatement();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(400);
				elseStatement();
				}
			}

			setState(403);
			match(FINIS);
			setState(404);
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
		enterRule(_localctx, 58, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ALITER);
			setState(407);
			match(T__5);
			setState(408);
			expression();
			setState(409);
			match(T__6);
			setState(410);
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
		enterRule(_localctx, 60, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(ALITER);
			setState(413);
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
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__1);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 571957256816427072L) != 0)) {
				{
				{
				setState(416);
				statement();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
		enterRule(_localctx, 64, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(DUM);
			setState(425);
			match(T__5);
			setState(426);
			expression();
			setState(427);
			match(T__6);
			setState(428);
			block();
			setState(429);
			match(FINIS);
			setState(430);
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
		enterRule(_localctx, 66, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(FACERE);
			setState(433);
			block();
			setState(434);
			match(DUM);
			setState(435);
			match(T__5);
			setState(436);
			expression();
			setState(437);
			match(T__6);
			setState(438);
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
		enterRule(_localctx, 68, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(PER);
			setState(441);
			match(T__5);
			setState(442);
			variableDeclaration();
			setState(443);
			expression();
			setState(444);
			match(T__0);
			setState(445);
			expression();
			setState(446);
			match(T__6);
			setState(447);
			block();
			setState(448);
			match(FINIS);
			setState(449);
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
		enterRule(_localctx, 70, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(REDDERE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558481916123152448L) != 0)) {
				{
				setState(452);
				expression();
				}
			}

			setState(455);
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
		enterRule(_localctx, 72, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(PERGE);
			setState(458);
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
		enterRule(_localctx, 74, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(INTERRUMPE);
			setState(461);
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
		enterRule(_localctx, 76, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558446456873156672L) != 0)) {
				{
				setState(463);
				postfixExpression(0);
				}
			}

			setState(466);
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
		enterRule(_localctx, 78, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(PRINT);
			setState(469);
			((PrintStatementContext)_localctx).expression = expression();
			((PrintStatementContext)_localctx).expressions.add(((PrintStatementContext)_localctx).expression);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(470);
				match(PRINT);
				setState(471);
				((PrintStatementContext)_localctx).expression = expression();
				((PrintStatementContext)_localctx).expressions.add(((PrintStatementContext)_localctx).expression);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		enterRule(_localctx, 80, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToLogicalAndExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(482);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(484);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(485);
					match(OR);
					setState(486);
					logicalAndExpression(0);
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToEqualityExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(493);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(495);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(496);
					match(AND);
					setState(497);
					equalityExpression(0);
					}
					} 
				}
				setState(502);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToComparisonExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(504);
			comparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(506);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(507);
						match(EQUAL);
						setState(508);
						comparisonExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(509);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(510);
						match(NOT_EQUAL);
						setState(511);
						comparisonExpression(0);
						}
						break;
					}
					} 
				}
				setState(516);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAdditiveExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(518);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new LessExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(520);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(521);
						match(LESS);
						setState(522);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GreaterExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(523);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(524);
						match(GREATER);
						setState(525);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new LessEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(526);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(527);
						match(LESS_EQUAL);
						setState(528);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(529);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(530);
						match(GREATER_EQUAL);
						setState(531);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(536);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultiplicativeExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(538);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(540);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(541);
						match(PLUS);
						setState(542);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(543);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(544);
						match(MINUS);
						setState(545);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(550);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(552);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(560);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(554);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(555);
						match(MULT);
						setState(556);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(557);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(558);
						match(DIV);
						setState(559);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
	@SuppressWarnings("CheckReturnValue")
	public static class NegateExprContext extends UnaryExpressionContext {
		public TerminalNode MINUS() { return getToken(LatinParser.MINUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NegateExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterNegateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitNegateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryExpression);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(NON);
				setState(566);
				unaryExpression();
				}
				break;
			case MINUS:
				_localctx = new NegateExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(MINUS);
				setState(568);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
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
	public static class PostDecrementExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(LatinParser.MINUSMINUS, 0); }
		public PostDecrementExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPostDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPostDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPostDecrementExpr(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(LatinParser.PLUSPLUS, 0); }
		public PostIncrementExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterPostIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitPostIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitPostIncrementExpr(this);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(573);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(589);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(575);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(576);
						match(T__7);
						setState(577);
						expression();
						setState(578);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new MemberAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(580);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(581);
						match(T__10);
						setState(582);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(583);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(584);
						functionArguments();
						}
						break;
					case 4:
						{
						_localctx = new PostIncrementExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(585);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(586);
						match(PLUSPLUS);
						}
						break;
					case 5:
						{
						_localctx = new PostDecrementExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(587);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(588);
						match(MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 98, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__5);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558481916123152448L) != 0)) {
				{
				setState(595);
				argumentList();
				}
			}

			setState(598);
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
		enterRule(_localctx, 100, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			((ArgumentListContext)_localctx).expression = expression();
			((ArgumentListContext)_localctx).arguments.add(((ArgumentListContext)_localctx).expression);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(601);
				match(T__4);
				setState(602);
				((ArgumentListContext)_localctx).expression = expression();
				((ArgumentListContext)_localctx).arguments.add(((ArgumentListContext)_localctx).expression);
				}
				}
				setState(607);
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
		enterRule(_localctx, 102, RULE_primaryExpression);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(NUMBER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(DECIMAL);
				}
				break;
			case STRING:
				_localctx = new StringLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				match(CHAR);
				}
				break;
			case VERUM:
				_localctx = new TrueLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new FalseLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				match(FALSUS);
				}
				break;
			case ID:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new ParenthesizedExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				match(T__5);
				setState(616);
				expression();
				setState(617);
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
		case 41:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 42:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 43:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 44:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 45:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 46:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 48:
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
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u026e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0003\u0000j\b\u0000\u0001\u0000\u0003"+
		"\u0000m\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001v\b\u0001\n\u0001\f\u0001y\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002}\b\u0002\n\u0002\f\u0002\u0080"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u0084\b\u0003\n\u0003\f\u0003"+
		"\u0087\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u008d\b\u0004\n\u0004\f\u0004\u0090\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0099"+
		"\b\u0004\n\u0004\f\u0004\u009c\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00a1\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00af\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00b5\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00b8\b\u0005\u0003\u0005\u00ba\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c1\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c8\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ce\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00d1\b\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00d7\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u00dd\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e9\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00f3\b\n\n\n\f\n\u00f6\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00ff\b\f\u0001\f\u0005\f\u0102\b\f\n\f\f\f\u0105\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0111\b\u000e\n\u000e\f\u000e\u0114\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u011d\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0127\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u012b\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0131\b\u0011\n"+
		"\u0011\f\u0011\u0134\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014a"+
		"\b\u0015\u0001\u0015\u0003\u0015\u014d\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0155\b\u0016"+
		"\n\u0016\f\u0016\u0158\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0169\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0178\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0184\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u018c"+
		"\b\u001c\n\u001c\f\u001c\u018f\t\u001c\u0001\u001c\u0003\u001c\u0192\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u01a2\b\u001f\n\u001f\f\u001f"+
		"\u01a5\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u01c6\b#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0003&\u01d1\b&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01d9\b\'\n\'\f\'\u01dc"+
		"\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0005)\u01e8\b)\n)\f)\u01eb\t)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u01f3\b*\n*\f*\u01f6\t*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u0201\b+\n+\f+\u0204\t+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u0215\b,\n,\f,\u0218\t,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0223\b-\n-\f-\u0226"+
		"\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u0231\b.\n.\f.\u0234\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u023b"+
		"\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u024e\b0\n0"+
		"\f0\u0251\t0\u00011\u00011\u00031\u0255\b1\u00011\u00011\u00012\u0001"+
		"2\u00012\u00052\u025c\b2\n2\f2\u025f\t2\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u026c\b3\u00013\u0000"+
		"\u0007RTVXZ\\`4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000"+
		"\u0002\u0001\u0000#$\u0002\u0000\u001f\"::\u028c\u0000i\u0001\u0000\u0000"+
		"\u0000\u0002s\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000\u0006"+
		"\u0081\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00b9"+
		"\u0001\u0000\u0000\u0000\f\u00d2\u0001\u0000\u0000\u0000\u000e\u00d6\u0001"+
		"\u0000\u0000\u0000\u0010\u00d8\u0001\u0000\u0000\u0000\u0012\u00e3\u0001"+
		"\u0000\u0000\u0000\u0014\u00ef\u0001\u0000\u0000\u0000\u0016\u00f7\u0001"+
		"\u0000\u0000\u0000\u0018\u00fc\u0001\u0000\u0000\u0000\u001a\u010b\u0001"+
		"\u0000\u0000\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u0126\u0001"+
		"\u0000\u0000\u0000 \u012a\u0001\u0000\u0000\u0000\"\u012c\u0001\u0000"+
		"\u0000\u0000$\u0137\u0001\u0000\u0000\u0000&\u013b\u0001\u0000\u0000\u0000"+
		"(\u0140\u0001\u0000\u0000\u0000*\u0142\u0001\u0000\u0000\u0000,\u0150"+
		"\u0001\u0000\u0000\u0000.\u015b\u0001\u0000\u0000\u00000\u0168\u0001\u0000"+
		"\u0000\u00002\u016a\u0001\u0000\u0000\u00004\u0177\u0001\u0000\u0000\u0000"+
		"6\u0183\u0001\u0000\u0000\u00008\u0185\u0001\u0000\u0000\u0000:\u0196"+
		"\u0001\u0000\u0000\u0000<\u019c\u0001\u0000\u0000\u0000>\u019f\u0001\u0000"+
		"\u0000\u0000@\u01a8\u0001\u0000\u0000\u0000B\u01b0\u0001\u0000\u0000\u0000"+
		"D\u01b8\u0001\u0000\u0000\u0000F\u01c3\u0001\u0000\u0000\u0000H\u01c9"+
		"\u0001\u0000\u0000\u0000J\u01cc\u0001\u0000\u0000\u0000L\u01d0\u0001\u0000"+
		"\u0000\u0000N\u01d4\u0001\u0000\u0000\u0000P\u01df\u0001\u0000\u0000\u0000"+
		"R\u01e1\u0001\u0000\u0000\u0000T\u01ec\u0001\u0000\u0000\u0000V\u01f7"+
		"\u0001\u0000\u0000\u0000X\u0205\u0001\u0000\u0000\u0000Z\u0219\u0001\u0000"+
		"\u0000\u0000\\\u0227\u0001\u0000\u0000\u0000^\u023a\u0001\u0000\u0000"+
		"\u0000`\u023c\u0001\u0000\u0000\u0000b\u0252\u0001\u0000\u0000\u0000d"+
		"\u0258\u0001\u0000\u0000\u0000f\u026b\u0001\u0000\u0000\u0000hj\u0003"+
		"\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000km\u0003\u0004\u0002\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0003\u0006"+
		"\u0003\u0000op\u0005\u000f\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0005"+
		"\u0000\u0000\u0001r\u0001\u0001\u0000\u0000\u0000sw\u0005\f\u0000\u0000"+
		"tv\u0003\u001a\r\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0003\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z~\u0005\r\u0000\u0000{}\u0003\u000e"+
		"\u0007\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0005"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0005"+
		"\u000e\u0000\u0000\u0082\u0084\u00030\u0018\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0007\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0010"+
		"\u0000\u0000\u0089\u008a\u0005:\u0000\u0000\u008a\u008e\u0005\u0002\u0000"+
		"\u0000\u008b\u008d\u0003\n\u0005\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000"+
		"\u0092\u0093\u0005\u0011\u0000\u0000\u0093\u00a1\u0005\u0001\u0000\u0000"+
		"\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0005:\u0000\u0000\u0096"+
		"\u009a\u0005\u0002\u0000\u0000\u0097\u0099\u0003\f\u0006\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0003\u0000\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u00a1"+
		"\u0005\u0001\u0000\u0000\u00a0\u0088\u0001\u0000\u0000\u0000\u00a0\u0094"+
		"\u0001\u0000\u0000\u0000\u00a1\t\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0012\u0000\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u00a5\u0005\u0004"+
		"\u0000\u0000\u00a5\u00a7\u0003.\u0017\u0000\u00a6\u00a8\u0005\u0001\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ba\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0012\u0000"+
		"\u0000\u00aa\u00ab\u0005:\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000"+
		"\u00ac\u00ae\u0003(\u0014\u0000\u00ad\u00af\u0005\u0001\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1"+
		"\u00b4\u0005:\u0000\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u00b5"+
		"\u0003.\u0017\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005"+
		"\u0001\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00a2\u0001"+
		"\u0000\u0000\u0000\u00b9\u00a9\u0001\u0000\u0000\u0000\u00b9\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0012\u0000\u0000\u00bc\u00bd\u0005:\u0000\u0000\u00bd\u00be\u0005\u0004"+
		"\u0000\u0000\u00be\u00c0\u0003.\u0017\u0000\u00bf\u00c1\u0005\u0005\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00d3\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0012\u0000"+
		"\u0000\u00c3\u00c4\u0005:\u0000\u0000\u00c4\u00c5\u0005\u0004\u0000\u0000"+
		"\u00c5\u00c7\u0003(\u0014\u0000\u00c6\u00c8\u0005\u0005\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0013\u0000\u0000\u00ca"+
		"\u00cd\u0005:\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc\u00ce"+
		"\u0003.\u0017\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005"+
		"\u0005\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00bb\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c2\u0001\u0000\u0000\u0000\u00d2\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003\u0010"+
		"\b\u0000\u00d5\u00d7\u0003\u0012\t\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u000f\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0014\u0000\u0000\u00d9\u00da\u0005:\u0000\u0000"+
		"\u00da\u00dc\u0005\u0006\u0000\u0000\u00db\u00dd\u0003\u0014\n\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000\u00df"+
		"\u00e0\u0003\u0018\f\u0000\u00e0\u00e1\u0005\u0011\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0001\u0000\u0000\u00e2\u0011\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0015\u0000\u0000\u00e4\u00e5\u0003.\u0017\u0000\u00e5\u00e6\u0005"+
		":\u0000\u0000\u00e6\u00e8\u0005\u0006\u0000\u0000\u00e7\u00e9\u0003\u0014"+
		"\n\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0018\f\u0000\u00ec\u00ed\u0005\u0011\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0001\u0000\u0000\u00ee\u0013\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f4\u0003\u0016\u000b\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000"+
		"\u00f1\u00f3\u0003\u0016\u000b\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u0015\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0012\u0000\u0000"+
		"\u00f8\u00f9\u0005:\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa"+
		"\u00fb\u0003.\u0017\u0000\u00fb\u0017\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0005\u0002\u0000\u0000\u00fd\u00ff\u0003\u001c\u000e\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u00030\u0018\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u0003\u0000\u0000\u0107\u0019\u0001\u0000\u0000\u0000\u0108\u010c\u0003"+
		"\u001e\u000f\u0000\u0109\u010c\u0003*\u0015\u0000\u010a\u010c\u0003\b"+
		"\u0004\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u001b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u001e\u0000\u0000\u010e\u0112\u0005\b\u0000"+
		"\u0000\u010f\u0111\u0003\u001a\r\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005\t\u0000\u0000\u0116"+
		"\u001d\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0012\u0000\u0000\u0118"+
		"\u0119\u0005:\u0000\u0000\u0119\u011a\u0005\u0004\u0000\u0000\u011a\u011c"+
		"\u0003.\u0017\u0000\u011b\u011d\u0003 \u0010\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u0001\u0000\u0000\u011f\u0127\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0005\u0012\u0000\u0000\u0121\u0122\u0005:\u0000"+
		"\u0000\u0122\u0123\u0005\u0004\u0000\u0000\u0123\u0124\u0003(\u0014\u0000"+
		"\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0117\u0001\u0000\u0000\u0000\u0126\u0120\u0001\u0000\u0000\u0000"+
		"\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u012b\u0003P(\u0000\u0129\u012b"+
		"\u0003\"\u0011\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012b!\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0002"+
		"\u0000\u0000\u012d\u0132\u0003$\u0012\u0000\u012e\u012f\u0005\u0005\u0000"+
		"\u0000\u012f\u0131\u0003$\u0012\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000"+
		"\u0136#\u0001\u0000\u0000\u0000\u0137\u0138\u0005:\u0000\u0000\u0138\u0139"+
		"\u0005\u0004\u0000\u0000\u0139\u013a\u0003 \u0010\u0000\u013a%\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0003.\u0017\u0000\u013c\u013d\u0005\b\u0000"+
		"\u0000\u013d\u013e\u0003P(\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f"+
		"\'\u0001\u0000\u0000\u0000\u0140\u0141\u0007\u0000\u0000\u0000\u0141)"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0013\u0000\u0000\u0143\u0144"+
		"\u0005:\u0000\u0000\u0144\u0145\u0005\b\u0000\u0000\u0145\u0146\u0003"+
		"P(\u0000\u0146\u0149\u0005\t\u0000\u0000\u0147\u0148\u0005\u0004\u0000"+
		"\u0000\u0148\u014a\u0003.\u0017\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000"+
		"\u014b\u014d\u0003,\u0016\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\u0001\u0000\u0000\u014f+\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005\u0002\u0000\u0000\u0151\u0156\u0003P(\u0000\u0152\u0153\u0005\u0005"+
		"\u0000\u0000\u0153\u0155\u0003P(\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0003\u0000\u0000"+
		"\u015a-\u0001\u0000\u0000\u0000\u015b\u015c\u0007\u0001\u0000\u0000\u015c"+
		"/\u0001\u0000\u0000\u0000\u015d\u0169\u00032\u0019\u0000\u015e\u0169\u0003"+
		"4\u001a\u0000\u015f\u0169\u00038\u001c\u0000\u0160\u0169\u0003@ \u0000"+
		"\u0161\u0169\u0003B!\u0000\u0162\u0169\u0003D\"\u0000\u0163\u0169\u0003"+
		"F#\u0000\u0164\u0169\u0003J%\u0000\u0165\u0169\u0003H$\u0000\u0166\u0169"+
		"\u0003N\'\u0000\u0167\u0169\u0003L&\u0000\u0168\u015d\u0001\u0000\u0000"+
		"\u0000\u0168\u015e\u0001\u0000\u0000\u0000\u0168\u015f\u0001\u0000\u0000"+
		"\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000\u0000"+
		"\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000"+
		"\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000"+
		"\u0000\u01691\u0001\u0000\u0000\u0000\u016a\u016b\u0003`0\u0000\u016b"+
		"\u016c\u0005\n\u0000\u0000\u016c\u016d\u0003 \u0010\u0000\u016d\u016e"+
		"\u0005\u0001\u0000\u0000\u016e3\u0001\u0000\u0000\u0000\u016f\u0170\u0003"+
		"6\u001b\u0000\u0170\u0171\u0005)\u0000\u0000\u0171\u0172\u0005\u0001\u0000"+
		"\u0000\u0172\u0178\u0001\u0000\u0000\u0000\u0173\u0174\u00036\u001b\u0000"+
		"\u0174\u0175\u0005*\u0000\u0000\u0175\u0176\u0005\u0001\u0000\u0000\u0176"+
		"\u0178\u0001\u0000\u0000\u0000\u0177\u016f\u0001\u0000\u0000\u0000\u0177"+
		"\u0173\u0001\u0000\u0000\u0000\u01785\u0001\u0000\u0000\u0000\u0179\u0184"+
		"\u0005:\u0000\u0000\u017a\u017b\u0003`0\u0000\u017b\u017c\u0005\b\u0000"+
		"\u0000\u017c\u017d\u0003P(\u0000\u017d\u017e\u0005\t\u0000\u0000\u017e"+
		"\u0184\u0001\u0000\u0000\u0000\u017f\u0180\u0003`0\u0000\u0180\u0181\u0005"+
		"\u000b\u0000\u0000\u0181\u0182\u0005:\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u0179\u0001\u0000\u0000\u0000\u0183\u017a\u0001\u0000"+
		"\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u01847\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0005\u0016\u0000\u0000\u0186\u0187\u0005\u0006\u0000"+
		"\u0000\u0187\u0188\u0003P(\u0000\u0188\u0189\u0005\u0007\u0000\u0000\u0189"+
		"\u018d\u0003>\u001f\u0000\u018a\u018c\u0003:\u001d\u0000\u018b\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0192\u0003"+
		"<\u001e\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0011"+
		"\u0000\u0000\u0194\u0195\u0005\u0001\u0000\u0000\u01959\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005\u0017\u0000\u0000\u0197\u0198\u0005\u0006\u0000"+
		"\u0000\u0198\u0199\u0003P(\u0000\u0199\u019a\u0005\u0007\u0000\u0000\u019a"+
		"\u019b\u0003>\u001f\u0000\u019b;\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"\u0017\u0000\u0000\u019d\u019e\u0003>\u001f\u0000\u019e=\u0001\u0000\u0000"+
		"\u0000\u019f\u01a3\u0005\u0002\u0000\u0000\u01a0\u01a2\u00030\u0018\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005\u0003\u0000\u0000\u01a7?\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005\u0018\u0000\u0000\u01a9\u01aa\u0005\u0006\u0000\u0000\u01aa"+
		"\u01ab\u0003P(\u0000\u01ab\u01ac\u0005\u0007\u0000\u0000\u01ac\u01ad\u0003"+
		">\u001f\u0000\u01ad\u01ae\u0005\u0011\u0000\u0000\u01ae\u01af\u0005\u0001"+
		"\u0000\u0000\u01afA\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0019\u0000"+
		"\u0000\u01b1\u01b2\u0003>\u001f\u0000\u01b2\u01b3\u0005\u0018\u0000\u0000"+
		"\u01b3\u01b4\u0005\u0006\u0000\u0000\u01b4\u01b5\u0003P(\u0000\u01b5\u01b6"+
		"\u0005\u0007\u0000\u0000\u01b6\u01b7\u0005\u0001\u0000\u0000\u01b7C\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0005\u001a\u0000\u0000\u01b9\u01ba\u0005"+
		"\u0006\u0000\u0000\u01ba\u01bb\u0003\u001e\u000f\u0000\u01bb\u01bc\u0003"+
		"P(\u0000\u01bc\u01bd\u0005\u0001\u0000\u0000\u01bd\u01be\u0003P(\u0000"+
		"\u01be\u01bf\u0005\u0007\u0000\u0000\u01bf\u01c0\u0003>\u001f\u0000\u01c0"+
		"\u01c1\u0005\u0011\u0000\u0000\u01c1\u01c2\u0005\u0001\u0000\u0000\u01c2"+
		"E\u0001\u0000\u0000\u0000\u01c3\u01c5\u0005\u001b\u0000\u0000\u01c4\u01c6"+
		"\u0003P(\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u0001"+
		"\u0000\u0000\u01c8G\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u001c\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0001\u0000\u0000\u01cbI\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005\u001d\u0000\u0000\u01cd\u01ce\u0005\u0001\u0000\u0000"+
		"\u01ceK\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003`0\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u00054\u0000\u0000\u01d3M\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u00055\u0000\u0000\u01d5\u01da\u0003P(\u0000"+
		"\u01d6\u01d7\u00055\u0000\u0000\u01d7\u01d9\u0003P(\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0005\u0001\u0000\u0000\u01deO\u0001\u0000\u0000\u0000\u01df\u01e0\u0003"+
		"R)\u0000\u01e0Q\u0001\u0000\u0000\u0000\u01e1\u01e2\u0006)\uffff\uffff"+
		"\u0000\u01e2\u01e3\u0003T*\u0000\u01e3\u01e9\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\n\u0002\u0000\u0000\u01e5\u01e6\u0005,\u0000\u0000\u01e6\u01e8"+
		"\u0003T*\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01eaS\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0006*\uffff\uffff\u0000\u01ed\u01ee\u0003V+\u0000"+
		"\u01ee\u01f4\u0001\u0000\u0000\u0000\u01ef\u01f0\n\u0002\u0000\u0000\u01f0"+
		"\u01f1\u0005+\u0000\u0000\u01f1\u01f3\u0003V+\u0000\u01f2\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5U\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f8\u0006+\uffff"+
		"\uffff\u0000\u01f8\u01f9\u0003X,\u0000\u01f9\u0202\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\n\u0003\u0000\u0000\u01fb\u01fc\u0005.\u0000\u0000\u01fc"+
		"\u0201\u0003X,\u0000\u01fd\u01fe\n\u0002\u0000\u0000\u01fe\u01ff\u0005"+
		"/\u0000\u0000\u01ff\u0201\u0003X,\u0000\u0200\u01fa\u0001\u0000\u0000"+
		"\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000"+
		"\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000"+
		"\u0000\u0203W\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0006,\uffff\uffff\u0000\u0206\u0207\u0003Z-\u0000\u0207"+
		"\u0216\u0001\u0000\u0000\u0000\u0208\u0209\n\u0005\u0000\u0000\u0209\u020a"+
		"\u00050\u0000\u0000\u020a\u0215\u0003Z-\u0000\u020b\u020c\n\u0004\u0000"+
		"\u0000\u020c\u020d\u00051\u0000\u0000\u020d\u0215\u0003Z-\u0000\u020e"+
		"\u020f\n\u0003\u0000\u0000\u020f\u0210\u00052\u0000\u0000\u0210\u0215"+
		"\u0003Z-\u0000\u0211\u0212\n\u0002\u0000\u0000\u0212\u0213\u00053\u0000"+
		"\u0000\u0213\u0215\u0003Z-\u0000\u0214\u0208\u0001\u0000\u0000\u0000\u0214"+
		"\u020b\u0001\u0000\u0000\u0000\u0214\u020e\u0001\u0000\u0000\u0000\u0214"+
		"\u0211\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"Y\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0006-\uffff\uffff\u0000\u021a\u021b\u0003\\.\u0000\u021b\u0224\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\n\u0003\u0000\u0000\u021d\u021e\u0005%"+
		"\u0000\u0000\u021e\u0223\u0003\\.\u0000\u021f\u0220\n\u0002\u0000\u0000"+
		"\u0220\u0221\u0005&\u0000\u0000\u0221\u0223\u0003\\.\u0000\u0222\u021c"+
		"\u0001\u0000\u0000\u0000\u0222\u021f\u0001\u0000\u0000\u0000\u0223\u0226"+
		"\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0225"+
		"\u0001\u0000\u0000\u0000\u0225[\u0001\u0000\u0000\u0000\u0226\u0224\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0006.\uffff\uffff\u0000\u0228\u0229\u0003"+
		"^/\u0000\u0229\u0232\u0001\u0000\u0000\u0000\u022a\u022b\n\u0003\u0000"+
		"\u0000\u022b\u022c\u0005\'\u0000\u0000\u022c\u0231\u0003^/\u0000\u022d"+
		"\u022e\n\u0002\u0000\u0000\u022e\u022f\u0005(\u0000\u0000\u022f\u0231"+
		"\u0003^/\u0000\u0230\u022a\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000"+
		"\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233]\u0001\u0000\u0000"+
		"\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0236\u0005-\u0000\u0000"+
		"\u0236\u023b\u0003^/\u0000\u0237\u0238\u0005&\u0000\u0000\u0238\u023b"+
		"\u0003^/\u0000\u0239\u023b\u0003`0\u0000\u023a\u0235\u0001\u0000\u0000"+
		"\u0000\u023a\u0237\u0001\u0000\u0000\u0000\u023a\u0239\u0001\u0000\u0000"+
		"\u0000\u023b_\u0001\u0000\u0000\u0000\u023c\u023d\u00060\uffff\uffff\u0000"+
		"\u023d\u023e\u0003f3\u0000\u023e\u024f\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\n\u0006\u0000\u0000\u0240\u0241\u0005\b\u0000\u0000\u0241\u0242\u0003"+
		"P(\u0000\u0242\u0243\u0005\t\u0000\u0000\u0243\u024e\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\n\u0005\u0000\u0000\u0245\u0246\u0005\u000b\u0000\u0000"+
		"\u0246\u024e\u0005:\u0000\u0000\u0247\u0248\n\u0004\u0000\u0000\u0248"+
		"\u024e\u0003b1\u0000\u0249\u024a\n\u0003\u0000\u0000\u024a\u024e\u0005"+
		")\u0000\u0000\u024b\u024c\n\u0002\u0000\u0000\u024c\u024e\u0005*\u0000"+
		"\u0000\u024d\u023f\u0001\u0000\u0000\u0000\u024d\u0244\u0001\u0000\u0000"+
		"\u0000\u024d\u0247\u0001\u0000\u0000\u0000\u024d\u0249\u0001\u0000\u0000"+
		"\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250a\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0252\u0254\u0005\u0006\u0000\u0000\u0253\u0255\u0003d2\u0000\u0254\u0253"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0005\u0007\u0000\u0000\u0257c\u0001"+
		"\u0000\u0000\u0000\u0258\u025d\u0003P(\u0000\u0259\u025a\u0005\u0005\u0000"+
		"\u0000\u025a\u025c\u0003P(\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025ee\u0001\u0000\u0000\u0000\u025f\u025d"+
		"\u0001\u0000\u0000\u0000\u0260\u026c\u00056\u0000\u0000\u0261\u026c\u0005"+
		"7\u0000\u0000\u0262\u026c\u00058\u0000\u0000\u0263\u026c\u00059\u0000"+
		"\u0000\u0264\u026c\u0005#\u0000\u0000\u0265\u026c\u0005$\u0000\u0000\u0266"+
		"\u026c\u0005:\u0000\u0000\u0267\u0268\u0005\u0006\u0000\u0000\u0268\u0269"+
		"\u0003P(\u0000\u0269\u026a\u0005\u0007\u0000\u0000\u026a\u026c\u0001\u0000"+
		"\u0000\u0000\u026b\u0260\u0001\u0000\u0000\u0000\u026b\u0261\u0001\u0000"+
		"\u0000\u0000\u026b\u0262\u0001\u0000\u0000\u0000\u026b\u0263\u0001\u0000"+
		"\u0000\u0000\u026b\u0264\u0001\u0000\u0000\u0000\u026b\u0265\u0001\u0000"+
		"\u0000\u0000\u026b\u0266\u0001\u0000\u0000\u0000\u026b\u0267\u0001\u0000"+
		"\u0000\u0000\u026cg\u0001\u0000\u0000\u0000:ilw~\u0085\u008e\u009a\u00a0"+
		"\u00a7\u00ae\u00b4\u00b7\u00b9\u00c0\u00c7\u00cd\u00d0\u00d2\u00d6\u00dc"+
		"\u00e8\u00f4\u00fe\u0103\u010b\u0112\u011c\u0126\u012a\u0132\u0149\u014c"+
		"\u0156\u0168\u0177\u0183\u018d\u0191\u01a3\u01c5\u01d0\u01da\u01e9\u01f4"+
		"\u0200\u0202\u0214\u0216\u0222\u0224\u0230\u0232\u023a\u024d\u024f\u0254"+
		"\u025d\u026b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}