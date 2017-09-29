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
		T__31=32, T__32=33, T__33=34, T__34=35, CONST=36, NUMBER=37, ID=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_funcDef = 1, RULE_program = 2, RULE_type = 3, RULE_funcName = 4, 
		RULE_expr = 5, RULE_instruct = 6, RULE_exprLA = 7, RULE_or = 8, RULE_and = 9, 
		RULE_ene = 10, RULE_ltgt = 11, RULE_additionExpr = 12, RULE_multiplyExpr = 13, 
		RULE_func = 14, RULE_atomExpr = 15, RULE_accesTab = 16, RULE_other = 17;
	public static final String[] ruleNames = {
		"prog", "funcDef", "program", "type", "funcName", "expr", "instruct", 
		"exprLA", "or", "and", "ene", "ltgt", "additionExpr", "multiplyExpr", 
		"func", "atomExpr", "accesTab", "other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "':'", "')'", "'\n'", "'var'", "' '", "'integer'", "'boolean'", 
		"'array of'", "'read'", "'write'", "'new array of'", "'['", "']'", "':='", 
		"';'", "'if'", "'then'", "'else'", "'while '", "' do'", "'skip'", "' or '", 
		"' and '", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", 
		"'*'", "'/'", "'not '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"CONST", "NUMBER", "ID", "WS"
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
			setState(36);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			funcName();
			setState(39);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40);
				match(ID);
				setState(41);
				match(T__1);
				setState(42);
				type();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__2);
			{
			setState(49);
			match(T__1);
			setState(50);
			type();
			}
			setState(52);
			match(T__3);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(53);
				match(T__4);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					match(T__5);
					setState(55);
					match(ID);
					setState(56);
					match(T__1);
					setState(57);
					type();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(62);
				match(T__3);
				}
			}

			setState(66);
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(68);
				match(T__4);
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(T__5);
					setState(70);
					match(ID);
					setState(71);
					match(T__1);
					setState(72);
					type();
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(77);
				match(T__3);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					funcDef();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(87);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__8);
				setState(92);
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
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) ) {
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				exprLA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				accesTab();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(T__11);
				setState(103);
				type();
				setState(104);
				match(T__12);
				setState(105);
				expr();
				setState(106);
				match(T__13);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(110);
					match(ID);
					}
					break;
				case 2:
					{
					setState(111);
					accesTab();
					}
					break;
				}
				setState(114);
				match(T__14);
				setState(115);
				expr();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(116);
					match(T__15);
					setState(117);
					instruct();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__16);
				setState(121);
				expr();
				setState(122);
				match(T__17);
				setState(123);
				instruct();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(124);
					match(T__15);
					setState(125);
					instruct();
					}
				}

				setState(128);
				match(T__18);
				setState(129);
				instruct();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(130);
					match(T__15);
					setState(131);
					instruct();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__19);
				setState(135);
				expr();
				setState(136);
				match(T__20);
				setState(137);
				instruct();
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(138);
					match(T__15);
					setState(139);
					instruct();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__21);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(143);
					match(T__15);
					setState(144);
					instruct();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				funcName();
				setState(148);
				match(T__0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					{
					setState(149);
					expr();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__2);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(156);
					match(T__15);
					setState(157);
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
			setState(162);
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
			setState(164);
			and();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(165);
				match(T__22);
				setState(166);
				and();
				}
				}
				setState(171);
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
			setState(172);
			ene();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(173);
				match(T__23);
				setState(174);
				ene();
				}
				}
				setState(179);
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
			setState(180);
			ltgt();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(181);
					match(T__24);
					setState(182);
					ltgt();
					}
					break;
				case T__25:
					{
					setState(183);
					match(T__25);
					setState(184);
					ltgt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
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
			setState(190);
			additionExpr();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(191);
					match(T__26);
					setState(192);
					additionExpr();
					}
					break;
				case T__27:
					{
					setState(193);
					match(T__27);
					setState(194);
					additionExpr();
					}
					break;
				case T__28:
					{
					setState(195);
					match(T__28);
					setState(196);
					additionExpr();
					}
					break;
				case T__29:
					{
					setState(197);
					match(T__29);
					setState(198);
					additionExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
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
			setState(204);
			multiplyExpr();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(209);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__30:
						{
						setState(205);
						match(T__30);
						setState(206);
						multiplyExpr();
						}
						break;
					case T__31:
						{
						setState(207);
						match(T__31);
						setState(208);
						multiplyExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(213);
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
			setState(214);
			atomExpr();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
					{
					setState(215);
					match(T__32);
					setState(216);
					atomExpr();
					}
					break;
				case T__33:
					{
					setState(217);
					match(T__33);
					setState(218);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223);
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
			setState(224);
			funcName();
			setState(225);
			match(T__0);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(226);
				expr();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				accesTab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(T__0);
				setState(239);
				or();
				setState(240);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__31);
				setState(243);
				atomExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(T__34);
				setState(245);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(248);
				match(ID);
				}
				break;
			case 2:
				{
				setState(249);
				func();
				}
				break;
			}
			setState(252);
			match(T__12);
			setState(253);
			expr();
			setState(254);
			match(T__13);
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

	public static class OtherContext extends ParserRuleContext {
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			matchWildcard();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3\5\3C\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\3\4\5\4R\n\4\3\4\7"+
		"\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\5\bs\n\b\3\b\3"+
		"\b\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0087\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\b\3\b\3\b\5"+
		"\b\u0094\n\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\3\b\3\b"+
		"\5\b\u00a1\n\b\5\b\u00a3\n\b\3\t\3\t\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16"+
		"\n\u00ad\13\n\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00d4\n\16\f\16\16\16\u00d7\13\16\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00de\n\17\f\17\16\17\u00e1\13\17\3\20\3\20\3\20\7\20\u00e6\n"+
		"\20\f\20\16\20\u00e9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\22\3\22\5\22\u00fd\n\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\3\4\2\f\r((\2\u011f\2&\3\2\2\2\4(\3\2\2\2\6Q\3\2\2\2\b"+
		"_\3\2\2\2\na\3\2\2\2\fn\3\2\2\2\16\u00a2\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6"+
		"\3\2\2\2\24\u00ae\3\2\2\2\26\u00b6\3\2\2\2\30\u00c0\3\2\2\2\32\u00ce\3"+
		"\2\2\2\34\u00d8\3\2\2\2\36\u00e2\3\2\2\2 \u00f8\3\2\2\2\"\u00fc\3\2\2"+
		"\2$\u0102\3\2\2\2&\'\5\6\4\2\'\3\3\2\2\2()\5\n\6\2)/\7\3\2\2*+\7(\2\2"+
		"+,\7\4\2\2,.\5\b\5\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62"+
		"\3\2\2\2\61/\3\2\2\2\62\63\7\5\2\2\63\64\7\4\2\2\64\65\5\b\5\2\65\66\3"+
		"\2\2\2\66B\7\6\2\2\67<\7\7\2\289\7\b\2\29:\7(\2\2:;\7\4\2\2;=\5\b\5\2"+
		"<8\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\6\2\2AC\3\2\2\2"+
		"B\67\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\16\b\2E\5\3\2\2\2FK\7\7\2\2GH\7\b"+
		"\2\2HI\7(\2\2IJ\7\4\2\2JL\5\b\5\2KG\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\6\2\2PR\3\2\2\2QF\3\2\2\2QR\3\2\2\2RV\3\2\2\2SU\5\4"+
		"\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\16"+
		"\b\2Z\7\3\2\2\2[`\7\t\2\2\\`\7\n\2\2]^\7\13\2\2^`\5\b\5\2_[\3\2\2\2_\\"+
		"\3\2\2\2_]\3\2\2\2`\t\3\2\2\2ab\t\2\2\2b\13\3\2\2\2co\7&\2\2do\7(\2\2"+
		"eo\5\20\t\2fo\5\36\20\2go\5\"\22\2hi\7\16\2\2ij\5\b\5\2jk\7\17\2\2kl\5"+
		"\f\7\2lm\7\20\2\2mo\3\2\2\2nc\3\2\2\2nd\3\2\2\2ne\3\2\2\2nf\3\2\2\2ng"+
		"\3\2\2\2nh\3\2\2\2o\r\3\2\2\2ps\7(\2\2qs\5\"\22\2rp\3\2\2\2rq\3\2\2\2"+
		"st\3\2\2\2tu\7\21\2\2ux\5\f\7\2vw\7\22\2\2wy\5\16\b\2xv\3\2\2\2xy\3\2"+
		"\2\2y\u00a3\3\2\2\2z{\7\23\2\2{|\5\f\7\2|}\7\24\2\2}\u0080\5\16\b\2~\177"+
		"\7\22\2\2\177\u0081\5\16\b\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0086\5\16\b\2\u0084\u0085\7"+
		"\22\2\2\u0085\u0087\5\16\b\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u00a3\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7"+
		"\27\2\2\u008b\u008e\5\16\b\2\u008c\u008d\7\22\2\2\u008d\u008f\5\16\b\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00a3\3\2\2\2\u0090\u0093"+
		"\7\30\2\2\u0091\u0092\7\22\2\2\u0092\u0094\5\16\b\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u00a3\3\2\2\2\u0095\u0096\5\n\6\2\u0096\u009a"+
		"\7\3\2\2\u0097\u0099\5\f\7\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u00a0\7\5\2\2\u009e\u009f\7\22\2\2\u009f\u00a1\5\16\b\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2r\3\2\2\2"+
		"\u00a2z\3\2\2\2\u00a2\u0088\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0095\3"+
		"\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\21\3\2\2\2\u00a6\u00ab"+
		"\5\24\13\2\u00a7\u00a8\7\31\2\2\u00a8\u00aa\5\24\13\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\23\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\5\26\f\2\u00af\u00b0\7\32"+
		"\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00bd\5\30\r\2\u00b7\u00b8\7\33\2\2\u00b8\u00bc\5\30\r\2\u00b9"+
		"\u00ba\7\34\2\2\u00ba\u00bc\5\30\r\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00cb\5\32\16\2\u00c1\u00c2\7\35"+
		"\2\2\u00c2\u00ca\5\32\16\2\u00c3\u00c4\7\36\2\2\u00c4\u00ca\5\32\16\2"+
		"\u00c5\u00c6\7\37\2\2\u00c6\u00ca\5\32\16\2\u00c7\u00c8\7 \2\2\u00c8\u00ca"+
		"\5\32\16\2\u00c9\u00c1\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d5\5\34\17\2\u00cf"+
		"\u00d0\7!\2\2\u00d0\u00d4\5\34\17\2\u00d1\u00d2\7\"\2\2\u00d2\u00d4\5"+
		"\34\17\2\u00d3\u00cf\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00df\5 \21\2\u00d9\u00da\7#\2\2\u00da\u00de\5 \21\2\u00db\u00dc"+
		"\7$\2\2\u00dc\u00de\5 \21\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\35\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e7\7\3\2\2\u00e4\u00e6"+
		"\5\f\7\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\5"+
		"\2\2\u00eb\37\3\2\2\2\u00ec\u00f9\7&\2\2\u00ed\u00f9\7(\2\2\u00ee\u00f9"+
		"\5\36\20\2\u00ef\u00f9\5\"\22\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\5\22\n"+
		"\2\u00f2\u00f3\7\5\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f9"+
		"\5 \21\2\u00f6\u00f7\7%\2\2\u00f7\u00f9\5 \21\2\u00f8\u00ec\3\2\2\2\u00f8"+
		"\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2"+
		"\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00fd"+
		"\7(\2\2\u00fb\u00fd\5\36\20\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5\f\7\2\u0100\u0101"+
		"\7\20\2\2\u0101#\3\2\2\2\u0102\u0103\13\2\2\2\u0103%\3\2\2\2 />BMQV_n"+
		"rx\u0080\u0086\u008e\u0093\u009a\u00a0\u00a2\u00ab\u00b3\u00bb\u00bd\u00c9"+
		"\u00cb\u00d3\u00d5\u00dd\u00df\u00e7\u00f8\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}