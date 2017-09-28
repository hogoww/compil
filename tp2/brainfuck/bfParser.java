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
		K=32, N=33, ID=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_t = 1, RULE_f = 2, RULE_e = 3, RULE_i = 4, RULE_exprLA = 5, 
		RULE_or = 6, RULE_and = 7, RULE_ene = 8, RULE_ltgt = 9, RULE_additionExpr = 10, 
		RULE_multiplyExpr = 11, RULE_atomExpr = 12;
	public static final String[] ruleNames = {
		"prog", "t", "f", "e", "i", "exprLA", "or", "and", "ene", "ltgt", "additionExpr", 
		"multiplyExpr", "atomExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'integer'", "'boolean'", "'array of'", "'read'", "'write'", "'('", 
		"')'", "'skip'", "'new array of'", "'['", "']'", "':='", "']:='", "'if '", 
		"' then '", "' else '", "'while '", "' do'", "' or '", "' and '", "'='", 
		"'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "K", "N", "ID", "WS"
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
		public IContext i() {
			return getRuleContext(IContext.class,0);
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
			setState(26);
			i();
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

	public static class TContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_t);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(T__2);
				setState(31);
				t();
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << ID))) != 0)) ) {
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode K() { return getToken(bfParser.K, 0); }
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public ExprLAContext exprLA() {
			return getRuleContext(ExprLAContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_e);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(K);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				exprLA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				f();
				setState(40);
				match(T__5);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__27) | (1L << T__30) | (1L << K) | (1L << ID))) != 0)) {
					{
					{
					setState(41);
					e();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(T__8);
				setState(51);
				t();
				setState(52);
				match(T__9);
				setState(53);
				e();
				setState(54);
				match(T__10);
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

	public static class IContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_i);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				setState(59);
				match(T__11);
				setState(60);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				e();
				setState(62);
				match(T__9);
				setState(63);
				e();
				setState(64);
				match(T__12);
				setState(65);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__13);
				setState(68);
				e();
				setState(69);
				match(T__14);
				setState(70);
				e();
				setState(71);
				match(T__15);
				setState(72);
				e();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__16);
				setState(75);
				e();
				setState(76);
				match(T__17);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				f();
				setState(79);
				match(T__5);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__27) | (1L << T__30) | (1L << K) | (1L << ID))) != 0)) {
					{
					{
					setState(80);
					e();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__6);
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
		enterRule(_localctx, 10, RULE_exprLA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 12, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			and();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(93);
				match(T__18);
				setState(94);
				and();
				}
				}
				setState(99);
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
		enterRule(_localctx, 14, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			ene();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(101);
				match(T__19);
				setState(102);
				ene();
				}
				}
				setState(107);
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
		enterRule(_localctx, 16, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			ltgt();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(109);
					match(T__20);
					setState(110);
					ltgt();
					}
					break;
				case T__21:
					{
					setState(111);
					match(T__21);
					setState(112);
					ltgt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 18, RULE_ltgt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			additionExpr();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(119);
					match(T__22);
					setState(120);
					additionExpr();
					}
					break;
				case T__23:
					{
					setState(121);
					match(T__23);
					setState(122);
					additionExpr();
					}
					break;
				case T__24:
					{
					setState(123);
					match(T__24);
					setState(124);
					additionExpr();
					}
					break;
				case T__25:
					{
					setState(125);
					match(T__25);
					setState(126);
					additionExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 20, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			multiplyExpr();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(137);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__26:
						{
						setState(133);
						match(T__26);
						setState(134);
						multiplyExpr();
						}
						break;
					case T__27:
						{
						setState(135);
						match(T__27);
						setState(136);
						multiplyExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 22, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			atomExpr();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(143);
					match(T__28);
					setState(144);
					atomExpr();
					}
					break;
				case T__29:
					{
					setState(145);
					match(T__29);
					setState(146);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(151);
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

	public static class AtomExprContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
		enterRule(_localctx, 24, RULE_atomExpr);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__5);
				setState(153);
				e();
				setState(154);
				match(T__6);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__27);
				setState(157);
				atomExpr();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__30);
				setState(159);
				atomExpr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6T\n\6\f\6\16\6W\13"+
		"\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\b\7\bb\n\b\f\b\16\be\13\b\3\t\3"+
		"\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16\nw"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0082\n\13\f\13"+
		"\16\13\u0085\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\3\4\2\6\7$$\2\u00b2\2\34\3\2\2\2\4\"\3\2\2\2\6$\3\2"+
		"\2\2\b:\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20f\3\2\2\2\22n\3\2"+
		"\2\2\24x\3\2\2\2\26\u0086\3\2\2\2\30\u0090\3\2\2\2\32\u00a2\3\2\2\2\34"+
		"\35\5\n\6\2\35\3\3\2\2\2\36#\7\3\2\2\37#\7\4\2\2 !\7\5\2\2!#\5\4\3\2\""+
		"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2#\5\3\2\2\2$%\t\2\2\2%\7\3\2\2\2&;"+
		"\7\"\2\2\';\7$\2\2(;\5\f\7\2)*\5\6\4\2*.\7\b\2\2+-\5\b\5\2,+\3\2\2\2-"+
		"\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\t\2\2"+
		"\62;\3\2\2\2\63;\7\n\2\2\64\65\7\13\2\2\65\66\5\4\3\2\66\67\7\f\2\2\67"+
		"8\5\b\5\289\7\r\2\29;\3\2\2\2:&\3\2\2\2:\'\3\2\2\2:(\3\2\2\2:)\3\2\2\2"+
		":\63\3\2\2\2:\64\3\2\2\2;\t\3\2\2\2<=\7$\2\2=>\7\16\2\2>[\5\b\5\2?@\5"+
		"\b\5\2@A\7\f\2\2AB\5\b\5\2BC\7\17\2\2CD\5\b\5\2D[\3\2\2\2EF\7\20\2\2F"+
		"G\5\b\5\2GH\7\21\2\2HI\5\b\5\2IJ\7\22\2\2JK\5\b\5\2K[\3\2\2\2LM\7\23\2"+
		"\2MN\5\b\5\2NO\7\24\2\2O[\3\2\2\2PQ\5\6\4\2QU\7\b\2\2RT\5\b\5\2SR\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\t\2\2Y[\3\2"+
		"\2\2Z<\3\2\2\2Z?\3\2\2\2ZE\3\2\2\2ZL\3\2\2\2ZP\3\2\2\2[\13\3\2\2\2\\]"+
		"\5\16\b\2]\r\3\2\2\2^c\5\20\t\2_`\7\25\2\2`b\5\20\t\2a_\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2fk\5\22\n\2gh\7\26\2\2h"+
		"j\5\22\n\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mk\3\2\2"+
		"\2nu\5\24\13\2op\7\27\2\2pt\5\24\13\2qr\7\30\2\2rt\5\24\13\2so\3\2\2\2"+
		"sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2\2x\u0083"+
		"\5\26\f\2yz\7\31\2\2z\u0082\5\26\f\2{|\7\32\2\2|\u0082\5\26\f\2}~\7\33"+
		"\2\2~\u0082\5\26\f\2\177\u0080\7\34\2\2\u0080\u0082\5\26\f\2\u0081y\3"+
		"\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u008d\5\30\r\2\u0087\u0088\7\35\2\2\u0088\u008c\5\30\r"+
		"\2\u0089\u008a\7\36\2\2\u008a\u008c\5\30\r\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0097\5\32\16\2\u0091"+
		"\u0092\7\37\2\2\u0092\u0096\5\32\16\2\u0093\u0094\7 \2\2\u0094\u0096\5"+
		"\32\16\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009b\7\b\2\2\u009b\u009c\5\b\5\2\u009c\u009d\7\t\2\2\u009d\u00a3"+
		"\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a3\5\32\16\2\u00a0\u00a1\7!\2\2"+
		"\u00a1\u00a3\5\32\16\2\u00a2\u009a\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\33\3\2\2\2\22\".:UZcksu\u0081\u0083\u008b\u008d\u0095\u0097"+
		"\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}