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
		RULE_mainSection = 3, RULE_declarationSection = 4, RULE_declaration = 5, 
		RULE_structDeclaration = 6, RULE_structField = 7, RULE_functionDeclaration = 8, 
		RULE_procedureDeclaration = 9, RULE_functionWithReturn = 10, RULE_parameterList = 11, 
		RULE_parameter = 12, RULE_functionBody = 13, RULE_localVariableSection = 14, 
		RULE_statement = 15, RULE_ifStatement = 16, RULE_elseIfStatement = 17, 
		RULE_elseStatement = 18, RULE_block = 19, RULE_whileStatement = 20, RULE_doWhileStatement = 21, 
		RULE_forStatement = 22, RULE_returnStatement = 23, RULE_continueStatement = 24, 
		RULE_breakStatement = 25, RULE_argumentList = 26, RULE_readStatement = 27, 
		RULE_printStatement = 28, RULE_variableDeclaration = 29, RULE_type = 30, 
		RULE_arrayDeclaration = 31, RULE_arrayInitializer = 32, RULE_assignment = 33, 
		RULE_location = 34, RULE_expression = 35, RULE_logicalOrExpression = 36, 
		RULE_logicalAndExpression = 37, RULE_equalityExpression = 38, RULE_comparisonExpression = 39, 
		RULE_additiveExpression = 40, RULE_multiplicativeExpression = 41, RULE_unaryExpression = 42, 
		RULE_postfixExpression = 43, RULE_functionArguments = 44, RULE_primaryExpression = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalVariablesSection", "functionSection", "mainSection", 
			"declarationSection", "declaration", "structDeclaration", "structField", 
			"functionDeclaration", "procedureDeclaration", "functionWithReturn", 
			"parameterList", "parameter", "functionBody", "localVariableSection", 
			"statement", "ifStatement", "elseIfStatement", "elseStatement", "block", 
			"whileStatement", "doWhileStatement", "forStatement", "returnStatement", 
			"continueStatement", "breakStatement", "argumentList", "readStatement", 
			"printStatement", "variableDeclaration", "type", "arrayDeclaration", 
			"arrayInitializer", "assignment", "location", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"postfixExpression", "functionArguments", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "','", "':'", "'['", "']'", 
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
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCTURA) {
				{
				{
				setState(92);
				structDeclaration();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLES_SECTION) {
				{
				setState(98);
				globalVariablesSection();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS_SECTION) {
				{
				setState(101);
				functionSection();
				}
			}

			setState(104);
			mainSection();
			setState(105);
			match(FINIS_PROGRAM);
			setState(106);
			match(T__0);
			setState(107);
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
			setState(109);
			match(VARIABLES_SECTION);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(110);
				declaration();
				}
				}
				setState(115);
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
			setState(116);
			match(FUNCTIONS_SECTION);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTIO || _la==RATIO) {
				{
				{
				setState(117);
				functionDeclaration();
				}
				}
				setState(122);
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
			setState(123);
			match(MAIN_SECTION);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 301741176094982144L) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
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
	public static class DeclarationSectionContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterDeclarationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitDeclarationSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitDeclarationSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSectionContext declarationSection() throws RecognitionException {
		DeclarationSectionContext _localctx = new DeclarationSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(130);
				declaration();
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
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				variableDeclaration();
				}
				break;
			case SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				arrayDeclaration();
				}
				break;
			case STRUCTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCTURA() { return getToken(LatinParser.STRUCTURA, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TerminalNode FINIS() { return getToken(LatinParser.FINIS, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
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
		enterRule(_localctx, 12, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(STRUCTURA);
			setState(142);
			match(ID);
			setState(143);
			match(T__1);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTO || _la==SERIES) {
				{
				{
				setState(144);
				structField();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__2);
			setState(151);
			match(FINIS);
			setState(152);
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
	public static class StructFieldContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structField);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				variableDeclaration();
				}
				break;
			case SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				arrayDeclaration();
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
		enterRule(_localctx, 16, RULE_functionDeclaration);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				procedureDeclaration();
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
		enterRule(_localctx, 18, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ACTIO);
			setState(163);
			match(ID);
			setState(164);
			match(T__3);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(165);
				parameterList();
				}
			}

			setState(168);
			match(T__4);
			setState(169);
			functionBody();
			setState(170);
			match(FINIS);
			setState(171);
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
		enterRule(_localctx, 20, RULE_functionWithReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(RATIO);
			setState(174);
			type();
			setState(175);
			match(ID);
			setState(176);
			match(T__3);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO) {
				{
				setState(177);
				parameterList();
				}
			}

			setState(180);
			match(T__4);
			setState(181);
			functionBody();
			setState(182);
			match(FINIS);
			setState(183);
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
		enterRule(_localctx, 22, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			parameter();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(186);
				match(T__5);
				setState(187);
				parameter();
				}
				}
				setState(192);
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
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ESTO);
			setState(194);
			match(ID);
			setState(195);
			match(T__6);
			setState(196);
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
		enterRule(_localctx, 26, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__1);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(199);
				localVariableSection();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 301741176094982144L) != 0)) {
				{
				{
				setState(202);
				statement();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			setState(210);
			match(VARIABILES);
			setState(211);
			match(T__7);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 851968L) != 0)) {
				{
				{
				setState(212);
				declaration();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				printStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(229);
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
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SI);
			setState(233);
			match(T__3);
			setState(234);
			expression();
			setState(235);
			match(T__4);
			setState(236);
			block();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					elseIfStatement();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(243);
				elseStatement();
				}
			}

			setState(246);
			match(FINIS);
			setState(247);
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
		enterRule(_localctx, 34, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ALITER);
			setState(250);
			match(T__3);
			setState(251);
			expression();
			setState(252);
			match(T__4);
			setState(253);
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
		enterRule(_localctx, 36, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ALITER);
			setState(256);
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__1);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 301741176094982144L) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
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
		enterRule(_localctx, 40, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DUM);
			setState(268);
			match(T__3);
			setState(269);
			expression();
			setState(270);
			match(T__4);
			setState(271);
			block();
			setState(272);
			match(FINIS);
			setState(273);
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
		enterRule(_localctx, 42, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FACERE);
			setState(276);
			block();
			setState(277);
			match(DUM);
			setState(278);
			match(T__3);
			setState(279);
			expression();
			setState(280);
			match(T__4);
			setState(281);
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
		enterRule(_localctx, 44, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PER);
			setState(284);
			match(T__3);
			setState(285);
			variableDeclaration();
			setState(286);
			expression();
			setState(287);
			match(T__0);
			setState(288);
			expression();
			setState(289);
			match(T__4);
			setState(290);
			block();
			setState(291);
			match(FINIS);
			setState(292);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(REDDERE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012112L) != 0)) {
				{
				setState(295);
				expression();
				}
			}

			setState(298);
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
		enterRule(_localctx, 48, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(PERGE);
			setState(301);
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
		enterRule(_localctx, 50, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(INTERRUMPE);
			setState(304);
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
	public static class ArgumentListContext extends ParserRuleContext {
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
		enterRule(_localctx, 52, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			expression();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(307);
				match(T__5);
				setState(308);
				expression();
				}
				}
				setState(313);
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
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LatinParser.READ, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
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
		enterRule(_localctx, 54, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(314);
				location();
				}
			}

			setState(317);
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
		enterRule(_localctx, 56, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(PRINT);
			setState(320);
			expression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(321);
				match(PRINT);
				setState(322);
				expression();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(LatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(LatinParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ESTO);
			setState(331);
			match(ID);
			setState(332);
			match(T__6);
			setState(333);
			type();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012112L) != 0)) {
				{
				setState(334);
				expression();
				}
			}

			setState(337);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(LatinParser.NUMERUS, 0); }
		public TerminalNode DECIMALIS() { return getToken(LatinParser.DECIMALIS, 0); }
		public TerminalNode TEXTUM() { return getToken(LatinParser.TEXTUM, 0); }
		public TerminalNode LITTERA() { return getToken(LatinParser.LITTERA, 0); }
		public TerminalNode VERUM() { return getToken(LatinParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(LatinParser.FALSUS, 0); }
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
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230511443181568L) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(SERIES);
			setState(342);
			match(ID);
			setState(343);
			match(T__7);
			setState(344);
			expression();
			setState(345);
			match(T__8);
			setState(346);
			match(T__6);
			setState(347);
			type();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(348);
				arrayInitializer();
				}
			}

			setState(351);
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
		enterRule(_localctx, 64, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__1);
			setState(354);
			expression();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(355);
				match(T__5);
				setState(356);
				expression();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
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
	public static class AssignmentContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 66, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			location();
			setState(365);
			match(T__9);
			setState(366);
			expression();
			setState(367);
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
	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LatinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LatinParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatinListener ) ((LatinListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatinVisitor) return ((LatinVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ID);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__10) {
				{
				setState(376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(370);
					match(T__7);
					setState(371);
					expression();
					setState(372);
					match(T__8);
					}
					break;
				case T__10:
					{
					setState(374);
					match(T__10);
					setState(375);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(380);
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
		enterRule(_localctx, 70, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToLogicalAndExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(384);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(386);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(387);
					match(OR);
					setState(388);
					logicalAndExpression(0);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToEqualityExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(395);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(397);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(398);
					match(AND);
					setState(399);
					equalityExpression(0);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToComparisonExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(406);
			comparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						match(EQUAL);
						setState(410);
						comparisonExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(411);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(412);
						match(NOT_EQUAL);
						setState(413);
						comparisonExpression(0);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAdditiveExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(420);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new LessExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(422);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(423);
						match(LESS);
						setState(424);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GreaterExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(425);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(426);
						match(GREATER);
						setState(427);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new LessEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(428);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(429);
						match(LESS_EQUAL);
						setState(430);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualExprContext(new ComparisonExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(431);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(432);
						match(GREATER_EQUAL);
						setState(433);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultiplicativeExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(440);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(442);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(443);
						match(PLUS);
						setState(444);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(445);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(446);
						match(MINUS);
						setState(447);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToUnaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(454);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(456);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(457);
						match(MULT);
						setState(458);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(460);
						match(DIV);
						setState(461);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 84, RULE_unaryExpression);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(NON);
				setState(468);
				unaryExpression();
				}
				break;
			case PLUSPLUS:
				_localctx = new PreIncrementExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(PLUSPLUS);
				setState(470);
				unaryExpression();
				}
				break;
			case MINUSMINUS:
				_localctx = new PreDecrementExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(MINUSMINUS);
				setState(472);
				unaryExpression();
				}
				break;
			case T__3:
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
				setState(473);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(477);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(479);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(480);
						match(T__7);
						setState(481);
						expression();
						setState(482);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new MemberAccessExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(484);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(485);
						match(T__10);
						setState(486);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(487);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(488);
						functionArguments();
						}
						break;
					}
					} 
				}
				setState(493);
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
		enterRule(_localctx, 88, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__3);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558488238315012112L) != 0)) {
				{
				setState(495);
				argumentList();
				}
			}

			setState(498);
			match(T__4);
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
		enterRule(_localctx, 90, RULE_primaryExpression);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(NUMBER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(DECIMAL);
				}
				break;
			case STRING:
				_localctx = new StringLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				match(CHAR);
				}
				break;
			case VERUM:
				_localctx = new TrueLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new FalseLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				match(FALSUS);
				}
				break;
			case ID:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(506);
				match(ID);
				}
				break;
			case T__3:
				_localctx = new ParenthesizedExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(507);
				match(T__3);
				setState(508);
				expression();
				setState(509);
				match(T__4);
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
		case 36:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 37:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 38:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 39:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 40:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 41:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 43:
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
		"\u0004\u0001=\u0202\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0003\u0000d\b\u0000\u0001\u0000\u0003\u0000g\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001p\b\u0001\n\u0001\f\u0001s\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002w\b\u0002\n\u0002\f\u0002z\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003\u0001\u0004\u0005"+
		"\u0004\u0084\b\u0004\n\u0004\f\u0004\u0087\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u008c\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0092\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u009d\b\u0007\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00a7\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b3\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00bd\b\u000b\n\u000b\f\u000b\u00c0\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u00c9\b\r\u0001\r\u0005\r\u00cc\b\r"+
		"\n\r\f\r\u00cf\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00d6\b\u000e\n\u000e\f\u000e\u00d9\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e7"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00ef\b\u0010\n\u0010\f\u0010\u00f2\t\u0010\u0001\u0010"+
		"\u0003\u0010\u00f5\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0105\b\u0013"+
		"\n\u0013\f\u0013\u0108\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0136"+
		"\b\u001a\n\u001a\f\u001a\u0139\t\u001a\u0001\u001b\u0003\u001b\u013c\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0144\b\u001c\n\u001c\f\u001c\u0147\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0150\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u015e\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u0166\b \n \f \u0169\t \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0179\b\"\n\"\f\"\u017c\t\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0186\b$\n$\f$\u0189\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0191\b%\n%\f%\u0194\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u019f"+
		"\b&\n&\f&\u01a2\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u01b3\b\'\n\'\f\'\u01b6\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u01c1\b(\n(\f(\u01c4\t(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01cf\b)\n)\f)\u01d2"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01db\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u01ea\b+\n+\f+\u01ed\t+\u0001,\u0001,\u0003,\u01f1"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u0200\b-\u0001-\u0000\u0007HJLNPRV.\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0001\u0002\u0000\u001f$:"+
		":\u0214\u0000_\u0001\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000"+
		"\u0004t\u0001\u0000\u0000\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0085"+
		"\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u008d\u0001"+
		"\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a0\u0001"+
		"\u0000\u0000\u0000\u0012\u00a2\u0001\u0000\u0000\u0000\u0014\u00ad\u0001"+
		"\u0000\u0000\u0000\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00c1\u0001"+
		"\u0000\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000\u001c\u00d2\u0001"+
		"\u0000\u0000\u0000\u001e\u00e6\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000"+
		"\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000"+
		"\u0000&\u0102\u0001\u0000\u0000\u0000(\u010b\u0001\u0000\u0000\u0000*"+
		"\u0113\u0001\u0000\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u0126\u0001"+
		"\u0000\u0000\u00000\u012c\u0001\u0000\u0000\u00002\u012f\u0001\u0000\u0000"+
		"\u00004\u0132\u0001\u0000\u0000\u00006\u013b\u0001\u0000\u0000\u00008"+
		"\u013f\u0001\u0000\u0000\u0000:\u014a\u0001\u0000\u0000\u0000<\u0153\u0001"+
		"\u0000\u0000\u0000>\u0155\u0001\u0000\u0000\u0000@\u0161\u0001\u0000\u0000"+
		"\u0000B\u016c\u0001\u0000\u0000\u0000D\u0171\u0001\u0000\u0000\u0000F"+
		"\u017d\u0001\u0000\u0000\u0000H\u017f\u0001\u0000\u0000\u0000J\u018a\u0001"+
		"\u0000\u0000\u0000L\u0195\u0001\u0000\u0000\u0000N\u01a3\u0001\u0000\u0000"+
		"\u0000P\u01b7\u0001\u0000\u0000\u0000R\u01c5\u0001\u0000\u0000\u0000T"+
		"\u01da\u0001\u0000\u0000\u0000V\u01dc\u0001\u0000\u0000\u0000X\u01ee\u0001"+
		"\u0000\u0000\u0000Z\u01ff\u0001\u0000\u0000\u0000\\^\u0003\f\u0006\u0000"+
		"]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0003\u0004\u0002\u0000"+
		"fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000ij\u0005\u000f\u0000\u0000jk\u0005\u0001"+
		"\u0000\u0000kl\u0005\u0000\u0000\u0001l\u0001\u0001\u0000\u0000\u0000"+
		"mq\u0005\f\u0000\u0000np\u0003\n\u0005\u0000on\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u0003\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tx\u0005"+
		"\r\u0000\u0000uw\u0003\u0010\b\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u0005\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{\u007f\u0005"+
		"\u000e\u0000\u0000|~\u0003\u001e\u000f\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0007\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\n\u0005\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\t\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0003:\u001d"+
		"\u0000\u0089\u008c\u0003>\u001f\u0000\u008a\u008c\u0003\f\u0006\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u008f\u0005:\u0000\u0000\u008f"+
		"\u0093\u0005\u0002\u0000\u0000\u0090\u0092\u0003\u000e\u0007\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0005\u0011\u0000\u0000\u0098"+
		"\u0099\u0005\u0001\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0003:\u001d\u0000\u009b\u009d\u0003>\u001f\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0003\u0012\t\u0000\u009f\u00a1\u0003\u0014\n"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0014\u0000"+
		"\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u00a6\u0005\u0004\u0000\u0000"+
		"\u00a5\u00a7\u0003\u0016\u000b\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u00aa\u0003\u001a\r\u0000\u00aa"+
		"\u00ab\u0005\u0011\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000\u00ac"+
		"\u0013\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0015\u0000\u0000\u00ae"+
		"\u00af\u0003<\u001e\u0000\u00af\u00b0\u0005:\u0000\u0000\u00b0\u00b2\u0005"+
		"\u0004\u0000\u0000\u00b1\u00b3\u0003\u0016\u000b\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6\u0003"+
		"\u001a\r\u0000\u00b6\u00b7\u0005\u0011\u0000\u0000\u00b7\u00b8\u0005\u0001"+
		"\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00be\u0003\u0018"+
		"\f\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bd\u0003\u0018\f"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0012\u0000\u0000\u00c2\u00c3\u0005:\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0007\u0000\u0000\u00c4\u00c5\u0003<\u001e\u0000\u00c5"+
		"\u0019\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\u0002\u0000\u0000\u00c7"+
		"\u00c9\u0003\u001c\u000e\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0003\u001e\u000f\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1"+
		"\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3"+
		"\u00d7\u0005\b\u0000\u0000\u00d4\u00d6\u0003\n\u0005\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\t\u0000\u0000\u00db\u001d\u0001\u0000\u0000\u0000\u00dc\u00e7\u0003"+
		"B!\u0000\u00dd\u00e7\u0003 \u0010\u0000\u00de\u00e7\u0003(\u0014\u0000"+
		"\u00df\u00e7\u0003*\u0015\u0000\u00e0\u00e7\u0003,\u0016\u0000\u00e1\u00e7"+
		"\u0003.\u0017\u0000\u00e2\u00e7\u00032\u0019\u0000\u00e3\u00e7\u00030"+
		"\u0018\u0000\u00e4\u00e7\u00038\u001c\u0000\u00e5\u00e7\u00036\u001b\u0000"+
		"\u00e6\u00dc\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u001f\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0004\u0000\u0000\u00ea\u00eb\u0003F#\u0000\u00eb\u00ec"+
		"\u0005\u0005\u0000\u0000\u00ec\u00f0\u0003&\u0013\u0000\u00ed\u00ef\u0003"+
		"\"\u0011\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003$\u0012\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u0011\u0000\u0000\u00f7\u00f8\u0005\u0001\u0000"+
		"\u0000\u00f8!\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0017\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0004\u0000\u0000\u00fb\u00fc\u0003F#\u0000\u00fc\u00fd"+
		"\u0005\u0005\u0000\u0000\u00fd\u00fe\u0003&\u0013\u0000\u00fe#\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100\u0101\u0003&\u0013"+
		"\u0000\u0101%\u0001\u0000\u0000\u0000\u0102\u0106\u0005\u0002\u0000\u0000"+
		"\u0103\u0105\u0003\u001e\u000f\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0003\u0000\u0000"+
		"\u010a\'\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0018\u0000\u0000\u010c"+
		"\u010d\u0005\u0004\u0000\u0000\u010d\u010e\u0003F#\u0000\u010e\u010f\u0005"+
		"\u0005\u0000\u0000\u010f\u0110\u0003&\u0013\u0000\u0110\u0111\u0005\u0011"+
		"\u0000\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112)\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\u0019\u0000\u0000\u0114\u0115\u0003&\u0013\u0000"+
		"\u0115\u0116\u0005\u0018\u0000\u0000\u0116\u0117\u0005\u0004\u0000\u0000"+
		"\u0117\u0118\u0003F#\u0000\u0118\u0119\u0005\u0005\u0000\u0000\u0119\u011a"+
		"\u0005\u0001\u0000\u0000\u011a+\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u001a\u0000\u0000\u011c\u011d\u0005\u0004\u0000\u0000\u011d\u011e\u0003"+
		":\u001d\u0000\u011e\u011f\u0003F#\u0000\u011f\u0120\u0005\u0001\u0000"+
		"\u0000\u0120\u0121\u0003F#\u0000\u0121\u0122\u0005\u0005\u0000\u0000\u0122"+
		"\u0123\u0003&\u0013\u0000\u0123\u0124\u0005\u0011\u0000\u0000\u0124\u0125"+
		"\u0005\u0001\u0000\u0000\u0125-\u0001\u0000\u0000\u0000\u0126\u0128\u0005"+
		"\u001b\u0000\u0000\u0127\u0129\u0003F#\u0000\u0128\u0127\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0001\u0000\u0000\u012b/\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u001c\u0000\u0000\u012d\u012e\u0005\u0001\u0000\u0000"+
		"\u012e1\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001d\u0000\u0000\u0130"+
		"\u0131\u0005\u0001\u0000\u0000\u01313\u0001\u0000\u0000\u0000\u0132\u0137"+
		"\u0003F#\u0000\u0133\u0134\u0005\u0006\u0000\u0000\u0134\u0136\u0003F"+
		"#\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u01385\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0003D\"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u00054\u0000\u0000\u013e7\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"5\u0000\u0000\u0140\u0145\u0003F#\u0000\u0141\u0142\u00055\u0000\u0000"+
		"\u0142\u0144\u0003F#\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u0001\u0000\u0000\u01499\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0005\u0012\u0000\u0000\u014b\u014c\u0005"+
		":\u0000\u0000\u014c\u014d\u0005\u0007\u0000\u0000\u014d\u014f\u0003<\u001e"+
		"\u0000\u014e\u0150\u0003F#\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005\u0001\u0000\u0000\u0152;\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0007\u0000\u0000\u0000\u0154=\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"\u0013\u0000\u0000\u0156\u0157\u0005:\u0000\u0000\u0157\u0158\u0005\b"+
		"\u0000\u0000\u0158\u0159\u0003F#\u0000\u0159\u015a\u0005\t\u0000\u0000"+
		"\u015a\u015b\u0005\u0007\u0000\u0000\u015b\u015d\u0003<\u001e\u0000\u015c"+
		"\u015e\u0003@ \u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0001\u0000\u0000\u0160?\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0002"+
		"\u0000\u0000\u0162\u0167\u0003F#\u0000\u0163\u0164\u0005\u0006\u0000\u0000"+
		"\u0164\u0166\u0003F#\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0169"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016bA\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0003D\"\u0000\u016d\u016e\u0005\n\u0000"+
		"\u0000\u016e\u016f\u0003F#\u0000\u016f\u0170\u0005\u0001\u0000\u0000\u0170"+
		"C\u0001\u0000\u0000\u0000\u0171\u017a\u0005:\u0000\u0000\u0172\u0173\u0005"+
		"\b\u0000\u0000\u0173\u0174\u0003F#\u0000\u0174\u0175\u0005\t\u0000\u0000"+
		"\u0175\u0179\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u000b\u0000\u0000"+
		"\u0177\u0179\u0005:\u0000\u0000\u0178\u0172\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"E\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0003H$\u0000\u017eG\u0001\u0000\u0000\u0000\u017f\u0180\u0006$\uffff"+
		"\uffff\u0000\u0180\u0181\u0003J%\u0000\u0181\u0187\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\n\u0002\u0000\u0000\u0183\u0184\u0005,\u0000\u0000\u0184"+
		"\u0186\u0003J%\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u0189\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188I\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0006%\uffff\uffff\u0000\u018b\u018c\u0003L&"+
		"\u0000\u018c\u0192\u0001\u0000\u0000\u0000\u018d\u018e\n\u0002\u0000\u0000"+
		"\u018e\u018f\u0005+\u0000\u0000\u018f\u0191\u0003L&\u0000\u0190\u018d"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193K\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0006"+
		"&\uffff\uffff\u0000\u0196\u0197\u0003N\'\u0000\u0197\u01a0\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\n\u0003\u0000\u0000\u0199\u019a\u0005.\u0000"+
		"\u0000\u019a\u019f\u0003N\'\u0000\u019b\u019c\n\u0002\u0000\u0000\u019c"+
		"\u019d\u0005/\u0000\u0000\u019d\u019f\u0003N\'\u0000\u019e\u0198\u0001"+
		"\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1M\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0006\'\uffff\uffff\u0000\u01a4\u01a5\u0003P"+
		"(\u0000\u01a5\u01b4\u0001\u0000\u0000\u0000\u01a6\u01a7\n\u0005\u0000"+
		"\u0000\u01a7\u01a8\u00050\u0000\u0000\u01a8\u01b3\u0003P(\u0000\u01a9"+
		"\u01aa\n\u0004\u0000\u0000\u01aa\u01ab\u00051\u0000\u0000\u01ab\u01b3"+
		"\u0003P(\u0000\u01ac\u01ad\n\u0003\u0000\u0000\u01ad\u01ae\u00052\u0000"+
		"\u0000\u01ae\u01b3\u0003P(\u0000\u01af\u01b0\n\u0002\u0000\u0000\u01b0"+
		"\u01b1\u00053\u0000\u0000\u01b1\u01b3\u0003P(\u0000\u01b2\u01a6\u0001"+
		"\u0000\u0000\u0000\u01b2\u01a9\u0001\u0000\u0000\u0000\u01b2\u01ac\u0001"+
		"\u0000\u0000\u0000\u01b2\u01af\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b5O\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0006(\uffff\uffff\u0000\u01b8\u01b9\u0003R)"+
		"\u0000\u01b9\u01c2\u0001\u0000\u0000\u0000\u01ba\u01bb\n\u0003\u0000\u0000"+
		"\u01bb\u01bc\u0005%\u0000\u0000\u01bc\u01c1\u0003R)\u0000\u01bd\u01be"+
		"\n\u0002\u0000\u0000\u01be\u01bf\u0005&\u0000\u0000\u01bf\u01c1\u0003"+
		"R)\u0000\u01c0\u01ba\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3Q\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0006)\uffff\uffff\u0000"+
		"\u01c6\u01c7\u0003T*\u0000\u01c7\u01d0\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\n\u0003\u0000\u0000\u01c9\u01ca\u0005\'\u0000\u0000\u01ca\u01cf\u0003"+
		"T*\u0000\u01cb\u01cc\n\u0002\u0000\u0000\u01cc\u01cd\u0005(\u0000\u0000"+
		"\u01cd\u01cf\u0003T*\u0000\u01ce\u01c8\u0001\u0000\u0000\u0000\u01ce\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1S\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005"+
		"-\u0000\u0000\u01d4\u01db\u0003T*\u0000\u01d5\u01d6\u0005)\u0000\u0000"+
		"\u01d6\u01db\u0003T*\u0000\u01d7\u01d8\u0005*\u0000\u0000\u01d8\u01db"+
		"\u0003T*\u0000\u01d9\u01db\u0003V+\u0000\u01da\u01d3\u0001\u0000\u0000"+
		"\u0000\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01dbU\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0006+\uffff\uffff\u0000\u01dd\u01de\u0003Z-\u0000\u01de"+
		"\u01eb\u0001\u0000\u0000\u0000\u01df\u01e0\n\u0004\u0000\u0000\u01e0\u01e1"+
		"\u0005\b\u0000\u0000\u01e1\u01e2\u0003F#\u0000\u01e2\u01e3\u0005\t\u0000"+
		"\u0000\u01e3\u01ea\u0001\u0000\u0000\u0000\u01e4\u01e5\n\u0003\u0000\u0000"+
		"\u01e5\u01e6\u0005\u000b\u0000\u0000\u01e6\u01ea\u0005:\u0000\u0000\u01e7"+
		"\u01e8\n\u0002\u0000\u0000\u01e8\u01ea\u0003X,\u0000\u01e9\u01df\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e4\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ecW\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005\u0004"+
		"\u0000\u0000\u01ef\u01f1\u00034\u001a\u0000\u01f0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005\u0005\u0000\u0000\u01f3Y\u0001\u0000\u0000\u0000"+
		"\u01f4\u0200\u00056\u0000\u0000\u01f5\u0200\u00057\u0000\u0000\u01f6\u0200"+
		"\u00058\u0000\u0000\u01f7\u0200\u00059\u0000\u0000\u01f8\u0200\u0005#"+
		"\u0000\u0000\u01f9\u0200\u0005$\u0000\u0000\u01fa\u0200\u0005:\u0000\u0000"+
		"\u01fb\u01fc\u0005\u0004\u0000\u0000\u01fc\u01fd\u0003F#\u0000\u01fd\u01fe"+
		"\u0005\u0005\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01f4"+
		"\u0001\u0000\u0000\u0000\u01ff\u01f5\u0001\u0000\u0000\u0000\u01ff\u01f6"+
		"\u0001\u0000\u0000\u0000\u01ff\u01f7\u0001\u0000\u0000\u0000\u01ff\u01f8"+
		"\u0001\u0000\u0000\u0000\u01ff\u01f9\u0001\u0000\u0000\u0000\u01ff\u01fa"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200[\u0001"+
		"\u0000\u0000\u0000-_cfqx\u007f\u0085\u008b\u0093\u009c\u00a0\u00a6\u00b2"+
		"\u00be\u00c8\u00cd\u00d7\u00e6\u00f0\u00f4\u0106\u0128\u0137\u013b\u0145"+
		"\u014f\u015d\u0167\u0178\u017a\u0187\u0192\u019e\u01a0\u01b2\u01b4\u01c0"+
		"\u01c2\u01ce\u01d0\u01da\u01e9\u01eb\u01f0\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}