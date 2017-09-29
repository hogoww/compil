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
		T__31=32, T__32=33, T__33=34, T__34=35, K=36, N=37, ID=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_d = 1, RULE_p = 2, RULE_t = 3, RULE_f = 4, RULE_e = 5, 
		RULE_i = 6, RULE_exprLA = 7, RULE_or = 8, RULE_and = 9, RULE_ene = 10, 
		RULE_ltgt = 11, RULE_additionExpr = 12, RULE_multiplyExpr = 13, RULE_func = 14, 
		RULE_atomExpr = 15, RULE_accesTab = 16;
	public static final String[] ruleNames = {
		"prog", "d", "p", "t", "f", "e", "i", "exprLA", "or", "and", "ene", "ltgt", 
		"additionExpr", "multiplyExpr", "func", "atomExpr", "accesTab"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "':'", "')'", "'\n'", "'var'", "' '", "'integer'", "'boolean'", 
		"'array of'", "'read'", "'write'", "'new array of'", "'['", "']'", "':='", 
		"';'", "'if '", "' then '", "' else '", "'while '", "' do'", "'skip'", 
		"' or '", "' and '", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'not '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"K", "N", "ID", "WS"
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
		public PContext p() {
			return getRuleContext(PContext.class,0);
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
			p();
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

	public static class DContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(bfParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bfParser.ID, i);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			f();
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
				t();
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
			t();
			}
			setState(50);
			match(T__3);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(51);
				match(T__4);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					match(T__5);
					setState(53);
					match(ID);
					setState(54);
					match(T__1);
					setState(55);
					t();
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(60);
				match(T__3);
				}
			}

			setState(64);
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

	public static class PContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(bfParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bfParser.ID, i);
		}
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(66);
				match(T__4);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(T__5);
					setState(68);
					match(ID);
					setState(69);
					match(T__1);
					setState(70);
					t();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(75);
				match(T__3);
				}
			}

			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					d();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(85);
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
		enterRule(_localctx, 6, RULE_t);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__8);
				setState(90);
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
		enterRule(_localctx, 8, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode K() { return getToken(bfParser.K, 0); }
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
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
		enterRule(_localctx, 10, RULE_e);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(K);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				exprLA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				accesTab();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__11);
				setState(101);
				t();
				setState(102);
				match(T__12);
				setState(103);
				e();
				setState(104);
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

	public static class IContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode ID() { return getToken(bfParser.ID, 0); }
		public AccesTabContext accesTab() {
			return getRuleContext(AccesTabContext.class,0);
		}
		public List<IContext> i() {
			return getRuleContexts(IContext.class);
		}
		public IContext i(int i) {
			return getRuleContext(IContext.class,i);
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
		enterRule(_localctx, 12, RULE_i);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(108);
					match(ID);
					}
					break;
				case 2:
					{
					setState(109);
					accesTab();
					}
					break;
				}
				setState(112);
				match(T__14);
				setState(113);
				e();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(114);
					match(T__15);
					setState(115);
					i();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__16);
				setState(119);
				e();
				setState(120);
				match(T__17);
				setState(121);
				i();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(122);
					match(T__15);
					setState(123);
					i();
					}
				}

				setState(126);
				match(T__18);
				setState(127);
				i();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(128);
					match(T__15);
					setState(129);
					i();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__19);
				setState(133);
				e();
				setState(134);
				match(T__20);
				setState(135);
				i();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(136);
					match(T__15);
					setState(137);
					i();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__21);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(141);
					match(T__15);
					setState(142);
					i();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				f();
				setState(146);
				match(T__0);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << K) | (1L << ID))) != 0)) {
					{
					{
					setState(147);
					e();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__2);
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(154);
					match(T__15);
					setState(155);
					i();
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
			setState(160);
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
			setState(162);
			and();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(163);
				match(T__22);
				setState(164);
				and();
				}
				}
				setState(169);
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
			setState(170);
			ene();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(171);
				match(T__23);
				setState(172);
				ene();
				}
				}
				setState(177);
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
			setState(178);
			ltgt();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(179);
					match(T__24);
					setState(180);
					ltgt();
					}
					break;
				case T__25:
					{
					setState(181);
					match(T__25);
					setState(182);
					ltgt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
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
			setState(188);
			additionExpr();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(189);
					match(T__26);
					setState(190);
					additionExpr();
					}
					break;
				case T__27:
					{
					setState(191);
					match(T__27);
					setState(192);
					additionExpr();
					}
					break;
				case T__28:
					{
					setState(193);
					match(T__28);
					setState(194);
					additionExpr();
					}
					break;
				case T__29:
					{
					setState(195);
					match(T__29);
					setState(196);
					additionExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
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
			setState(202);
			multiplyExpr();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__30:
						{
						setState(203);
						match(T__30);
						setState(204);
						multiplyExpr();
						}
						break;
					case T__31:
						{
						setState(205);
						match(T__31);
						setState(206);
						multiplyExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(211);
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
			setState(212);
			atomExpr();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
					{
					setState(213);
					match(T__32);
					setState(214);
					atomExpr();
					}
					break;
				case T__33:
					{
					setState(215);
					match(T__33);
					setState(216);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(221);
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
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
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
			setState(222);
			f();
			setState(223);
			match(T__0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << K) | (1L << ID))) != 0)) {
				{
				{
				setState(224);
				e();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
		public TerminalNode K() { return getToken(bfParser.K, 0); }
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(K);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				accesTab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__0);
				setState(237);
				or();
				setState(238);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(T__31);
				setState(241);
				atomExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(T__34);
				setState(243);
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
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ID);
				}
				break;
			case 2:
				{
				setState(247);
				func();
				}
				break;
			}
			setState(250);
			match(T__12);
			setState(251);
			e();
			setState(252);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\5\3A\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\6\4J\n\4\r\4\16\4K\3\4\3\4\5\4P\n\4\3\4\7\4S\n\4\f\4"+
		"\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\5\bq\n\b\3\b\3\b\3\b\3\b\5"+
		"\bw\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\5\b\u0092\n\b\3"+
		"\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b\3\b\5\b\u009f\n\b"+
		"\5\b\u00a1\n\b\3\t\3\t\3\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3"+
		"\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00d2"+
		"\n\16\f\16\16\16\u00d5\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u00dc\n\17"+
		"\f\17\16\17\u00df\13\17\3\20\3\20\3\20\7\20\u00e4\n\20\f\20\16\20\u00e7"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00f7\n\21\3\22\3\22\5\22\u00fb\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\f\r((\2\u011c"+
		"\2$\3\2\2\2\4&\3\2\2\2\6O\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fl\3\2\2\2\16"+
		"\u00a0\3\2\2\2\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00ac\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\u00be\3\2\2\2\32\u00cc\3\2\2\2\34\u00d6\3\2\2\2\36\u00e0\3"+
		"\2\2\2 \u00f6\3\2\2\2\"\u00fa\3\2\2\2$%\5\6\4\2%\3\3\2\2\2&\'\5\n\6\2"+
		"\'-\7\3\2\2()\7(\2\2)*\7\4\2\2*,\5\b\5\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\5\2\2\61\62\7\4\2\2\62\63\5\b"+
		"\5\2\63\64\3\2\2\2\64@\7\6\2\2\65:\7\7\2\2\66\67\7\b\2\2\678\7(\2\289"+
		"\7\4\2\29;\5\b\5\2:\66\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2"+
		">?\7\6\2\2?A\3\2\2\2@\65\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\16\b\2C\5\3\2"+
		"\2\2DI\7\7\2\2EF\7\b\2\2FG\7(\2\2GH\7\4\2\2HJ\5\b\5\2IE\3\2\2\2JK\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\6\2\2NP\3\2\2\2OD\3\2\2\2OP\3\2"+
		"\2\2PT\3\2\2\2QS\5\4\3\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\5\16\b\2X\7\3\2\2\2Y^\7\t\2\2Z^\7\n\2\2[\\\7\13\2\2\\"+
		"^\5\b\5\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2^\t\3\2\2\2_`\t\2\2\2`\13\3\2\2"+
		"\2am\7&\2\2bm\7(\2\2cm\5\20\t\2dm\5\36\20\2em\5\"\22\2fg\7\16\2\2gh\5"+
		"\b\5\2hi\7\17\2\2ij\5\f\7\2jk\7\20\2\2km\3\2\2\2la\3\2\2\2lb\3\2\2\2l"+
		"c\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2m\r\3\2\2\2nq\7(\2\2oq\5\"\22\2"+
		"pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rs\7\21\2\2sv\5\f\7\2tu\7\22\2\2uw\5\16"+
		"\b\2vt\3\2\2\2vw\3\2\2\2w\u00a1\3\2\2\2xy\7\23\2\2yz\5\f\7\2z{\7\24\2"+
		"\2{~\5\16\b\2|}\7\22\2\2}\177\5\16\b\2~|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0084\5\16\b\2\u0082\u0083\7\22\2"+
		"\2\u0083\u0085\5\16\b\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u00a1\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0088\5\f\7\2\u0088\u0089\7"+
		"\27\2\2\u0089\u008c\5\16\b\2\u008a\u008b\7\22\2\2\u008b\u008d\5\16\b\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00a1\3\2\2\2\u008e\u0091"+
		"\7\30\2\2\u008f\u0090\7\22\2\2\u0090\u0092\5\16\b\2\u0091\u008f\3\2\2"+
		"\2\u0091\u0092\3\2\2\2\u0092\u00a1\3\2\2\2\u0093\u0094\5\n\6\2\u0094\u0098"+
		"\7\3\2\2\u0095\u0097\5\f\7\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009e\7\5\2\2\u009c\u009d\7\22\2\2\u009d\u009f\5\16\b\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0p\3\2\2\2"+
		"\u00a0x\3\2\2\2\u00a0\u0086\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0093\3"+
		"\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\5\22\n\2\u00a3\21\3\2\2\2\u00a4\u00a9"+
		"\5\24\13\2\u00a5\u00a6\7\31\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\23\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\5\26\f\2\u00ad\u00ae\7\32"+
		"\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00bb\5\30\r\2\u00b5\u00b6\7\33\2\2\u00b6\u00ba\5\30\r\2\u00b7"+
		"\u00b8\7\34\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\27\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c9\5\32\16\2\u00bf\u00c0\7\35"+
		"\2\2\u00c0\u00c8\5\32\16\2\u00c1\u00c2\7\36\2\2\u00c2\u00c8\5\32\16\2"+
		"\u00c3\u00c4\7\37\2\2\u00c4\u00c8\5\32\16\2\u00c5\u00c6\7 \2\2\u00c6\u00c8"+
		"\5\32\16\2\u00c7\u00bf\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c3\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d3\5\34\17\2\u00cd"+
		"\u00ce\7!\2\2\u00ce\u00d2\5\34\17\2\u00cf\u00d0\7\"\2\2\u00d0\u00d2\5"+
		"\34\17\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00dd\5 \21\2\u00d7\u00d8\7#\2\2\u00d8\u00dc\5 \21\2\u00d9\u00da"+
		"\7$\2\2\u00da\u00dc\5 \21\2\u00db\u00d7\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\n\6\2\u00e1\u00e5\7\3\2\2\u00e2\u00e4"+
		"\5\f\7\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\5"+
		"\2\2\u00e9\37\3\2\2\2\u00ea\u00f7\7&\2\2\u00eb\u00f7\7(\2\2\u00ec\u00f7"+
		"\5\36\20\2\u00ed\u00f7\5\"\22\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\5\22\n"+
		"\2\u00f0\u00f1\7\5\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f7"+
		"\5 \21\2\u00f4\u00f5\7%\2\2\u00f5\u00f7\5 \21\2\u00f6\u00ea\3\2\2\2\u00f6"+
		"\u00eb\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2"+
		"\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7!\3\2\2\2\u00f8\u00fb"+
		"\7(\2\2\u00f9\u00fb\5\36\20\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\5\f\7\2\u00fe\u00ff"+
		"\7\20\2\2\u00ff#\3\2\2\2 -<@KOT]lpv~\u0084\u008c\u0091\u0098\u009e\u00a0"+
		"\u00a9\u00b1\u00b9\u00bb\u00c7\u00c9\u00d1\u00d3\u00db\u00dd\u00e5\u00f6"+
		"\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}