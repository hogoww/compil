// Generated from bf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, CONST=34, NUMBER=35, ID=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_funcDef = 1, RULE_program = 2, RULE_type = 3, RULE_funcName = 4, 
		RULE_expr = 5, RULE_instruct = 6, RULE_exprLA = 7, RULE_or = 8, RULE_and = 9, 
		RULE_ene = 10, RULE_ltgt = 11, RULE_additionExpr = 12, RULE_multiplyExpr = 13, 
		RULE_func = 14, RULE_atomExpr = 15, RULE_accesTab = 16;
	public static final String[] ruleNames = {
		"prog", "funcDef", "program", "type", "funcName", "expr", "instruct", 
		"exprLA", "or", "and", "ene", "ltgt", "additionExpr", "multiplyExpr", 
		"func", "atomExpr", "accesTab"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "':'", "')'", "'var'", "'integer'", "'boolean'", "'array of'", 
		"'read'", "'write'", "'new array of'", "'['", "']'", "':='", "';'", "'if'", 
		"'then'", "'else'", "'while'", "'do'", "'skip'", "'or'", "'and'", "'='", 
		"'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "CONST", "NUMBER", 
		"ID", "WS"
	};
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
	public String getGrammarFileName() { return "bf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			program();
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public InstructContext instruct() {
			return getRuleContext(InstructContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(bfParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bfParser.ID, i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			funcName();
			setState(37);
			match(T__0);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(38);
				match(ID);
				setState(39);
				match(T__1);
				setState(40);
				type();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__2);
			{
			setState(47);
			match(T__1);
			setState(48);
			type();
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(50);
				match(T__3);
				setState(54); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(51);
						match(ID);
						setState(52);
						match(T__1);
						setState(53);
						type();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(56); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(60);
			instruct();
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

	public static class ProgramContext extends ParserRuleContext {
		public InstructContext instruct() {
			return getRuleContext(InstructContext.class,0);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(bfParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bfParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				match(T__3);
				setState(66); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
						match(ID);
						setState(64);
						match(T__1);
						setState(65);
						type();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					funcDef();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(78);
			instruct();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__6);
				setState(83);
				type();
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << ID))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(bfParser.CONST, 0); }
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public ExprLAContext exprLA() {
			return getRuleContext(ExprLAContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AccesTabContext accesTab() {
			return getRuleContext(AccesTabContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				exprLA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				accesTab();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(T__9);
				setState(94);
				type();
				setState(95);
				match(T__10);
				setState(96);
				expr();
				setState(97);
				match(T__11);
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

	public static class InstructContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public AccesTabContext accesTab() {
			return getRuleContext(AccesTabContext.class,0);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public InstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterInstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitInstruct(this);
		}
	}

	public final InstructContext instruct() throws RecognitionException {
		InstructContext _localctx = new InstructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruct);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(101);
					match(ID);
					}
					break;
				case 2:
					{
					setState(102);
					accesTab();
					}
					break;
				}
				setState(105);
				match(T__12);
				setState(106);
				expr();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(107);
					match(T__13);
					setState(108);
					instruct();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__14);
				setState(112);
				expr();
				setState(113);
				match(T__15);
				setState(114);
				instruct();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(115);
					match(T__13);
					setState(116);
					instruct();
					}
				}

				setState(119);
				match(T__16);
				setState(120);
				instruct();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(121);
					match(T__13);
					setState(122);
					instruct();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__17);
				setState(126);
				expr();
				setState(127);
				match(T__18);
				setState(128);
				instruct();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(129);
					match(T__13);
					setState(130);
					instruct();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(T__19);
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(134);
					match(T__13);
					setState(135);
					instruct();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				funcName();
				setState(139);
				match(T__0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__29) | (1L << T__32) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(140);
					expr();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__2);
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(147);
					match(T__13);
					setState(148);
					instruct();
					}
					break;
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

	public static class ExprLAContext extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExprLAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterExprLA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitExprLA(this);
		}
	}

	public final ExprLAContext exprLA() throws RecognitionException {
		ExprLAContext _localctx = new ExprLAContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprLA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			or();
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

	public static class OrContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			and();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(156);
				match(T__20);
				setState(157);
				and();
				}
				}
				setState(162);
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

	public static class AndContext extends ParserRuleContext {
		public List<EneContext> ene() {
			return getRuleContexts(EneContext.class);
		}
		public EneContext ene(int i) {
			return getRuleContext(EneContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			ene();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(164);
				match(T__21);
				setState(165);
				ene();
				}
				}
				setState(170);
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

	public static class EneContext extends ParserRuleContext {
		public List<LtgtContext> ltgt() {
			return getRuleContexts(LtgtContext.class);
		}
		public LtgtContext ltgt(int i) {
			return getRuleContext(LtgtContext.class,i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitEne(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			ltgt();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(172);
					match(T__22);
					setState(173);
					ltgt();
					}
					break;
				case T__23:
					{
					setState(174);
					match(T__23);
					setState(175);
					ltgt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
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

	public static class LtgtContext extends ParserRuleContext {
		public List<AdditionExprContext> additionExpr() {
			return getRuleContexts(AdditionExprContext.class);
		}
		public AdditionExprContext additionExpr(int i) {
			return getRuleContext(AdditionExprContext.class,i);
		}
		public LtgtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltgt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterLtgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitLtgt(this);
		}
	}

	public final LtgtContext ltgt() throws RecognitionException {
		LtgtContext _localctx = new LtgtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ltgt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			additionExpr();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(182);
					match(T__24);
					setState(183);
					additionExpr();
					}
					break;
				case T__25:
					{
					setState(184);
					match(T__25);
					setState(185);
					additionExpr();
					}
					break;
				case T__26:
					{
					setState(186);
					match(T__26);
					setState(187);
					additionExpr();
					}
					break;
				case T__27:
					{
					setState(188);
					match(T__27);
					setState(189);
					additionExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
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

	public static class AdditionExprContext extends ParserRuleContext {
		public List<MultiplyExprContext> multiplyExpr() {
			return getRuleContexts(MultiplyExprContext.class);
		}
		public MultiplyExprContext multiplyExpr(int i) {
			return getRuleContext(MultiplyExprContext.class,i);
		}
		public AdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			multiplyExpr();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(200);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
						{
						setState(196);
						match(T__28);
						setState(197);
						multiplyExpr();
						}
						break;
					case T__29:
						{
						setState(198);
						match(T__29);
						setState(199);
						multiplyExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			atomExpr();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || _la==T__31) {
				{
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
					{
					setState(206);
					match(T__30);
					setState(207);
					atomExpr();
					}
					break;
				case T__31:
					{
					setState(208);
					match(T__31);
					setState(209);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(214);
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

	public static class FuncContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			funcName();
			setState(216);
			match(T__0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__29) | (1L << T__32) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(217);
				expr();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(bfParser.CONST, 0); }
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AccesTabContext accesTab() {
			return getRuleContext(AccesTabContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AtomExprContext atomExpr() {
			return getRuleContext(AtomExprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atomExpr);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				accesTab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(T__0);
				setState(230);
				or();
				setState(231);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(T__29);
				setState(234);
				atomExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(T__32);
				setState(236);
				atomExpr();
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

	public static class AccesTabContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AccesTabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesTab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAccesTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAccesTab(this);
		}
	}

	public final AccesTabContext accesTab() throws RecognitionException {
		AccesTabContext _localctx = new AccesTabContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accesTab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(239);
				match(ID);
				}
				break;
			case 2:
				{
				setState(240);
				func();
				}
				break;
			}
			setState(243);
			match(T__10);
			setState(244);
			expr();
			setState(245);
			match(T__11);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\5\3=\n\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4"+
		"E\n\4\r\4\16\4F\5\4I\n\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\5\5W\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7f\n\7\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bx\n\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093"+
		"\13\b\3\b\3\b\3\b\5\b\u0098\n\b\5\b\u009a\n\b\3\t\3\t\3\n\3\n\3\n\7\n"+
		"\u00a1\n\n\f\n\16\n\u00a4\13\n\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16"+
		"\13\u00ac\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00d5\n\17\f\17\16\17\u00d8\13\17\3\20\3\20"+
		"\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\22\3\22"+
		"\5\22\u00f4\n\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\3\4\2\n\13&&\2\u0115\2$\3\2\2\2\4&\3\2\2\2\6H"+
		"\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fe\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3"+
		"\2\2\2\22\u009d\3\2\2\2\24\u00a5\3\2\2\2\26\u00ad\3\2\2\2\30\u00b7\3\2"+
		"\2\2\32\u00c5\3\2\2\2\34\u00cf\3\2\2\2\36\u00d9\3\2\2\2 \u00ef\3\2\2\2"+
		"\"\u00f3\3\2\2\2$%\5\6\4\2%\3\3\2\2\2&\'\5\n\6\2\'-\7\3\2\2()\7&\2\2)"+
		"*\7\4\2\2*,\5\b\5\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2"+
		"\2/-\3\2\2\2\60\61\7\5\2\2\61\62\7\4\2\2\62\63\5\b\5\2\63<\3\2\2\2\64"+
		"8\7\6\2\2\65\66\7&\2\2\66\67\7\4\2\2\679\5\b\5\28\65\3\2\2\29:\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\64\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\16"+
		"\b\2?\5\3\2\2\2@D\7\6\2\2AB\7&\2\2BC\7\4\2\2CE\5\b\5\2DA\3\2\2\2EF\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2H@\3\2\2\2HI\3\2\2\2IM\3\2\2\2JL\5\4"+
		"\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\5\16"+
		"\b\2Q\7\3\2\2\2RW\7\7\2\2SW\7\b\2\2TU\7\t\2\2UW\5\b\5\2VR\3\2\2\2VS\3"+
		"\2\2\2VT\3\2\2\2W\t\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Zf\7$\2\2[f\7&\2\2\\"+
		"f\5\20\t\2]f\5\36\20\2^f\5\"\22\2_`\7\f\2\2`a\5\b\5\2ab\7\r\2\2bc\5\f"+
		"\7\2cd\7\16\2\2df\3\2\2\2eZ\3\2\2\2e[\3\2\2\2e\\\3\2\2\2e]\3\2\2\2e^\3"+
		"\2\2\2e_\3\2\2\2f\r\3\2\2\2gj\7&\2\2hj\5\"\22\2ig\3\2\2\2ih\3\2\2\2jk"+
		"\3\2\2\2kl\7\17\2\2lo\5\f\7\2mn\7\20\2\2np\5\16\b\2om\3\2\2\2op\3\2\2"+
		"\2p\u009a\3\2\2\2qr\7\21\2\2rs\5\f\7\2st\7\22\2\2tw\5\16\b\2uv\7\20\2"+
		"\2vx\5\16\b\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\23\2\2z}\5\16\b\2{|\7"+
		"\20\2\2|~\5\16\b\2}{\3\2\2\2}~\3\2\2\2~\u009a\3\2\2\2\177\u0080\7\24\2"+
		"\2\u0080\u0081\5\f\7\2\u0081\u0082\7\25\2\2\u0082\u0085\5\16\b\2\u0083"+
		"\u0084\7\20\2\2\u0084\u0086\5\16\b\2\u0085\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u009a\3\2\2\2\u0087\u008a\7\26\2\2\u0088\u0089\7\20\2\2\u0089"+
		"\u008b\5\16\b\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009a\3"+
		"\2\2\2\u008c\u008d\5\n\6\2\u008d\u0091\7\3\2\2\u008e\u0090\5\f\7\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0097\7\5\2\2\u0095"+
		"\u0096\7\20\2\2\u0096\u0098\5\16\b\2\u0097\u0095\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u009a\3\2\2\2\u0099i\3\2\2\2\u0099q\3\2\2\2\u0099\177\3\2"+
		"\2\2\u0099\u0087\3\2\2\2\u0099\u008c\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c"+
		"\5\22\n\2\u009c\21\3\2\2\2\u009d\u00a2\5\24\13\2\u009e\u009f\7\27\2\2"+
		"\u009f\u00a1\5\24\13\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00aa\5\26\f\2\u00a6\u00a7\7\30\2\2\u00a7\u00a9\5\26\f\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\25\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b4\5\30\r\2\u00ae\u00af\7\31"+
		"\2\2\u00af\u00b3\5\30\r\2\u00b0\u00b1\7\32\2\2\u00b1\u00b3\5\30\r\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00c2"+
		"\5\32\16\2\u00b8\u00b9\7\33\2\2\u00b9\u00c1\5\32\16\2\u00ba\u00bb\7\34"+
		"\2\2\u00bb\u00c1\5\32\16\2\u00bc\u00bd\7\35\2\2\u00bd\u00c1\5\32\16\2"+
		"\u00be\u00bf\7\36\2\2\u00bf\u00c1\5\32\16\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00ba\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00cc\5\34\17\2\u00c6\u00c7\7\37\2\2\u00c7\u00cb\5\34\17"+
		"\2\u00c8\u00c9\7 \2\2\u00c9\u00cb\5\34\17\2\u00ca\u00c6\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\33\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d6\5 \21\2\u00d0\u00d1"+
		"\7!\2\2\u00d1\u00d5\5 \21\2\u00d2\u00d3\7\"\2\2\u00d3\u00d5\5 \21\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\5\n\6\2\u00da\u00de\7\3\2\2\u00db\u00dd\5\f\7\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\37\3\2\2\2\u00e3\u00f0"+
		"\7$\2\2\u00e4\u00f0\7&\2\2\u00e5\u00f0\5\36\20\2\u00e6\u00f0\5\"\22\2"+
		"\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7\5\2\2\u00ea\u00f0"+
		"\3\2\2\2\u00eb\u00ec\7 \2\2\u00ec\u00f0\5 \21\2\u00ed\u00ee\7#\2\2\u00ee"+
		"\u00f0\5 \21\2\u00ef\u00e3\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2"+
		"\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0!\3\2\2\2\u00f1\u00f4\7&\2\2\u00f2\u00f4\5\36\20\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\7\r\2\2\u00f6\u00f7\5\f\7\2\u00f7\u00f8\7\16\2\2\u00f8#\3\2\2\2 -:<F"+
		"HMVeiow}\u0085\u008a\u0091\u0097\u0099\u00a2\u00aa\u00b2\u00b4\u00c0\u00c2"+
		"\u00ca\u00cc\u00d4\u00d6\u00de\u00ef\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}