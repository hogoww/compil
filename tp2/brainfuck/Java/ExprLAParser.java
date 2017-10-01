// Generated from ExprLA.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Number=15, WS=16;
	public static final int
		RULE_expr = 0, RULE_or = 1, RULE_and = 2, RULE_ene = 3, RULE_ltgt = 4, 
		RULE_additionExpr = 5, RULE_multiplyExpr = 6, RULE_atomExpr = 7;
	public static final String[] ruleNames = {
		"expr", "or", "and", "ene", "ltgt", "additionExpr", "multiplyExpr", "atomExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'or'", "'and'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Number", "WS"
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
	public String getGrammarFileName() { return "ExprLA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprLAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public ExprLA value;
		public OrContext e;
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ExprContext)_localctx).e = or();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
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
		public ExprLA value;
		public AndContext e;
		public AndContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((OrContext)_localctx).e = and();
			((OrContext)_localctx).value =  ((OrContext)_localctx).e.value;
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				match(T__0);
				setState(22);
				((OrContext)_localctx).e2 = and();
				((OrContext)_localctx).value =  new Or(_localctx.value,((OrContext)_localctx).e2.value);
				}
				}
				setState(29);
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
		public ExprLA value;
		public EneContext e;
		public EneContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((AndContext)_localctx).e = ene();
			((AndContext)_localctx).value = ((AndContext)_localctx).e.value;
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				match(T__1);
				setState(33);
				((AndContext)_localctx).e2 = ene();
				((AndContext)_localctx).value =  new And(_localctx.value,((AndContext)_localctx).e2.value);
				}
				}
				setState(40);
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
		public ExprLA value;
		public LtgtContext e;
		public LtgtContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitEne(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((EneContext)_localctx).e = ltgt();
			((EneContext)_localctx).value = ((EneContext)_localctx).e.value;
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(43);
					match(T__2);
					setState(44);
					((EneContext)_localctx).e2 = ltgt();
					((EneContext)_localctx).value =  new Equals(_localctx.value,((EneContext)_localctx).e2.value);
					}
					break;
				case T__3:
					{
					setState(47);
					match(T__3);
					setState(48);
					((EneContext)_localctx).e2 = ltgt();
					((EneContext)_localctx).value =  new NotEquals(_localctx.value,((EneContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
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
		public ExprLA value;
		public AdditionExprContext e1;
		public AdditionExprContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterLtgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitLtgt(this);
		}
	}

	public final LtgtContext ltgt() throws RecognitionException {
		LtgtContext _localctx = new LtgtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ltgt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((LtgtContext)_localctx).e1 = additionExpr();
			((LtgtContext)_localctx).value = ((LtgtContext)_localctx).e1.value;
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(58);
					match(T__4);
					setState(59);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new LesserThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__5:
					{
					setState(62);
					match(T__5);
					setState(63);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new LesserEqualThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__6:
					{
					setState(66);
					match(T__6);
					setState(67);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new GreaterEqualThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__7:
					{
					setState(70);
					match(T__7);
					setState(71);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new GreaterThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
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
		public ExprLA value;
		public MultiplyExprContext e1;
		public MultiplyExprContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_additionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((AdditionExprContext)_localctx).e1 = multiplyExpr();
			((AdditionExprContext)_localctx).value =  ((AdditionExprContext)_localctx).e1.value;
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(81);
					match(T__8);
					setState(82);
					((AdditionExprContext)_localctx).e2 = multiplyExpr();
					((AdditionExprContext)_localctx).value =  new Add(_localctx.value,((AdditionExprContext)_localctx).e2.value);
					}
					break;
				case T__9:
					{
					setState(85);
					match(T__9);
					setState(86);
					((AdditionExprContext)_localctx).e2 = multiplyExpr();
					((AdditionExprContext)_localctx).value =  new Sub(_localctx.value,((AdditionExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public ExprLA value;
		public AtomExprContext e1;
		public AtomExprContext e2;
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((MultiplyExprContext)_localctx).e1 = atomExpr();
			((MultiplyExprContext)_localctx).value =  ((MultiplyExprContext)_localctx).e1.value;
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(96);
					match(T__10);
					setState(97);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Mul(_localctx.value,  ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				case T__11:
					{
					setState(100);
					match(T__11);
					setState(101);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Div(_localctx.value,  ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(108);
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
		public ExprLA value;
		public Token c;
		public OrContext e1;
		public AtomExprContext e2;
		public TerminalNode Number() { return getToken(ExprLAParser.Number, 0); }
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
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprLAListener ) ((ExprLAListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomExpr);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((AtomExprContext)_localctx).c = match(Number);
				((AtomExprContext)_localctx).value =  new Cte(Integer.parseInt((((AtomExprContext)_localctx).c!=null?((AtomExprContext)_localctx).c.getText():null)));
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__12);
				setState(112);
				((AtomExprContext)_localctx).e1 = or();
				setState(113);
				match(T__13);
				((AtomExprContext)_localctx).value =  ((AtomExprContext)_localctx).e1.value;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__9);
				setState(117);
				((AtomExprContext)_localctx).e2 = atomExpr();
				((AtomExprContext)_localctx).value =  new Inv(((AtomExprContext)_localctx).e2.value);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66"+
		"\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t{\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\u0082\2\22\3\2\2"+
		"\2\4\25\3\2\2\2\6 \3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\fQ\3\2\2\2\16`\3\2\2"+
		"\2\20z\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26\5\6\4\2"+
		"\26\35\b\3\1\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\b\3\1\2\32\34\3\2\2\2"+
		"\33\27\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2"+
		"\37\35\3\2\2\2 !\5\b\5\2!(\b\4\1\2\"#\7\4\2\2#$\5\b\5\2$%\b\4\1\2%\'\3"+
		"\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2"+
		"+,\5\n\6\2,\67\b\5\1\2-.\7\5\2\2./\5\n\6\2/\60\b\5\1\2\60\66\3\2\2\2\61"+
		"\62\7\6\2\2\62\63\5\n\6\2\63\64\b\5\1\2\64\66\3\2\2\2\65-\3\2\2\2\65\61"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2"+
		":;\5\f\7\2;N\b\6\1\2<=\7\7\2\2=>\5\f\7\2>?\b\6\1\2?M\3\2\2\2@A\7\b\2\2"+
		"AB\5\f\7\2BC\b\6\1\2CM\3\2\2\2DE\7\t\2\2EF\5\f\7\2FG\b\6\1\2GM\3\2\2\2"+
		"HI\7\n\2\2IJ\5\f\7\2JK\b\6\1\2KM\3\2\2\2L<\3\2\2\2L@\3\2\2\2LD\3\2\2\2"+
		"LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\5\16"+
		"\b\2R]\b\7\1\2ST\7\13\2\2TU\5\16\b\2UV\b\7\1\2V\\\3\2\2\2WX\7\f\2\2XY"+
		"\5\16\b\2YZ\b\7\1\2Z\\\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`a\5\20\t\2al\b\b\1\2bc\7\r\2\2cd\5\20"+
		"\t\2de\b\b\1\2ek\3\2\2\2fg\7\16\2\2gh\5\20\t\2hi\b\b\1\2ik\3\2\2\2jb\3"+
		"\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2nl\3\2\2\2o"+
		"p\7\21\2\2p{\b\t\1\2qr\7\17\2\2rs\5\4\3\2st\7\20\2\2tu\b\t\1\2u{\3\2\2"+
		"\2vw\7\f\2\2wx\5\20\t\2xy\b\t\1\2y{\3\2\2\2zo\3\2\2\2zq\3\2\2\2zv\3\2"+
		"\2\2{\21\3\2\2\2\r\35(\65\67LN[]jlz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}