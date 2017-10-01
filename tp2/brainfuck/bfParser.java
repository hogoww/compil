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
		T__31=32, T__32=33, T__33=34, T__34=35, IDENTIFICATEUR=36, NUMBER=37, 
		WS=38;
	public static final int
		RULE_prog = 0, RULE_funcDef = 1, RULE_program = 2, RULE_declarVar = 3, 
		RULE_type = 4, RULE_constante = 5, RULE_funcName = 6, RULE_id = 7, RULE_expre = 8, 
		RULE_instruct = 9, RULE_accesTab = 10, RULE_func = 11, RULE_exprLA = 12, 
		RULE_or = 13, RULE_and = 14, RULE_ene = 15, RULE_ltgt = 16, RULE_additionExpr = 17, 
		RULE_multiplyExpr = 18, RULE_atomExpr = 19;
	public static final String[] ruleNames = {
		"prog", "funcDef", "program", "declarVar", "type", "constante", "funcName", 
		"id", "expre", "instruct", "accesTab", "func", "exprLA", "or", "and", 
		"ene", "ltgt", "additionExpr", "multiplyExpr", "atomExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "':'", "')'", "'var'", "'integer'", "'boolean'", "'array of'", 
		"'true'", "'false'", "'read'", "'write'", "'new array of'", "'['", "']'", 
		"':='", "';'", "'if'", "'then'", "'else'", "'while'", "'do'", "'skip'", 
		"'or'", "'and'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", 
		"'*'", "'/'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIFICATEUR", "NUMBER", "WS"
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
			setState(40);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		public DeclarVarContext declarVar() {
			return getRuleContext(DeclarVarContext.class,0);
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
			setState(42);
			id();
			setState(43);
			match(T__0);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATEUR) {
				{
				{
				setState(44);
				id();
				setState(45);
				match(T__1);
				setState(46);
				type();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__2);
			{
			setState(54);
			match(T__1);
			setState(55);
			type();
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(57);
				declarVar();
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
		public DeclarVarContext declarVar() {
			return getRuleContext(DeclarVarContext.class,0);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				declarVar();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					funcDef();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(71);
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

	public static class DeclarVarContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclarVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterDeclarVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitDeclarVar(this);
		}
	}

	public final DeclarVarContext declarVar() throws RecognitionException {
		DeclarVarContext _localctx = new DeclarVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarVar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					id();
					setState(75);
					match(T__1);
					setState(76);
					type();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Type t;
		public TypeContext tempt;
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
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__4);
				((TypeContext)_localctx).t = new TypeInt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__5);
				((TypeContext)_localctx).t = new TypeBool();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__6);
				setState(87);
				((TypeContext)_localctx).tempt = type();
				((TypeContext)_localctx).t = new TypeArray(((TypeContext)_localctx).tempt.t);
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

	public static class ConstanteContext extends ParserRuleContext {
		public Cte value;
		public Token n;
		public Token c;
		public TerminalNode NUMBER() { return getToken(bfParser.NUMBER, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitConstante(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constante);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((ConstanteContext)_localctx).n = match(NUMBER);
				((ConstanteContext)_localctx).value = new CteInt(Integer.parseInt((((ConstanteContext)_localctx).n!=null?((ConstanteContext)_localctx).n.getText():null)));
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((ConstanteContext)_localctx).c = match(T__7);
				((ConstanteContext)_localctx).value = new CteBool(Boolean.parseBoolean((((ConstanteContext)_localctx).c!=null?((ConstanteContext)_localctx).c.getLine():0));
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((ConstanteContext)_localctx).c = match(T__8);
				((ConstanteContext)_localctx).value = new CteBool(Boolean.parseBoolean((((ConstanteContext)_localctx).c!=null?((ConstanteContext)_localctx).c.getText():null)));
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
		public FuncName name;
		public IdContext i;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_funcName);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__9);
				((FuncNameContext)_localctx).name = new FuncName(new ID("read"));
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__10);
				((FuncNameContext)_localctx).name = new FuncName(new ID("write"));
				}
				break;
			case IDENTIFICATEUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				((FuncNameContext)_localctx).i = id();
				((FuncNameContext)_localctx).name = new FuncName((((FuncNameContext)_localctx).i!=null?_input.getText(((FuncNameContext)_localctx).i.start,((FuncNameContext)_localctx).i.stop):null));
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

	public static class IdContext extends ParserRuleContext {
		public ID i;
		public Token ide;
		public TerminalNode IDENTIFICATEUR() { return getToken(bfParser.IDENTIFICATEUR, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((IdContext)_localctx).ide = match(IDENTIFICATEUR);
			((IdContext)_localctx).i = new ID((((IdContext)_localctx).ide!=null?((IdContext)_localctx).ide.getText():null));
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

	public static class ExpreContext extends ParserRuleContext {
		public Expression e;
		public ConstanteContext c;
		public IdContext i;
		public ExprLAContext ela;
		public FuncContext f;
		public AccesTabContext tab;
		public TypeContext t;
		public ExpreContext exp;
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public ExpreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).enterExpre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitExpre(this);
		}
	}

	public final ExpreContext expre() throws RecognitionException {
		ExpreContext _localctx = new ExpreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expre);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((ExpreContext)_localctx).c = constante();
				((ExpreContext)_localctx).e =  (((ExpreContext)_localctx).c!=null?_input.getText(((ExpreContext)_localctx).c.start,((ExpreContext)_localctx).c.stop):null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((ExpreContext)_localctx).i = id();
				((ExpreContext)_localctx).e =  (((ExpreContext)_localctx).i!=null?_input.getText(((ExpreContext)_localctx).i.start,((ExpreContext)_localctx).i.stop):null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((ExpreContext)_localctx).ela = exprLA();
				((ExpreContext)_localctx).e =  (((ExpreContext)_localctx).ela!=null?_input.getText(((ExpreContext)_localctx).ela.start,((ExpreContext)_localctx).ela.stop):null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((ExpreContext)_localctx).f = func();
				((ExpreContext)_localctx).e =  (((ExpreContext)_localctx).f!=null?_input.getText(((ExpreContext)_localctx).f.start,((ExpreContext)_localctx).f.stop):null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				((ExpreContext)_localctx).tab = accesTab();
				((ExpreContext)_localctx).e =  (((ExpreContext)_localctx).tab!=null?_input.getText(((ExpreContext)_localctx).tab.start,((ExpreContext)_localctx).tab.stop):null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(T__11);
				setState(128);
				((ExpreContext)_localctx).t = type();
				setState(129);
				match(T__12);
				setState(130);
				((ExpreContext)_localctx).exp = expre();
				setState(131);
				match(T__13);
				((ExpreContext)_localctx).e = new NewArrayOf((((ExpreContext)_localctx).t!=null?_input.getText(((ExpreContext)_localctx).t.start,((ExpreContext)_localctx).t.stop):null),(((ExpreContext)_localctx).exp!=null?_input.getText(((ExpreContext)_localctx).exp.start,((ExpreContext)_localctx).exp.stop):null));
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
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AccesTabContext accesTab() {
			return getRuleContext(AccesTabContext.class,0);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
		enterRule(_localctx, 18, RULE_instruct);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(136);
					id();
					}
					break;
				case 2:
					{
					setState(137);
					accesTab();
					}
					break;
				}
				setState(140);
				match(T__14);
				setState(141);
				expre();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(142);
					match(T__15);
					setState(143);
					instruct();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__16);
				setState(147);
				expre();
				setState(148);
				match(T__17);
				setState(149);
				instruct();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(150);
					match(T__15);
					setState(151);
					instruct();
					}
				}

				setState(154);
				match(T__18);
				setState(155);
				instruct();
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__19);
				setState(161);
				expre();
				setState(162);
				match(T__20);
				setState(163);
				instruct();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(164);
					match(T__15);
					setState(165);
					instruct();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__21);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(169);
					match(T__15);
					setState(170);
					instruct();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				func();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(174);
					match(T__15);
					setState(175);
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

	public static class AccesTabContext extends ParserRuleContext {
		public AccesTab at;
		public IdContext i;
		public FuncContext f;
		public ExpreContext e;
		public ExpreContext expre() {
			return getRuleContext(ExpreContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_accesTab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(180);
				((AccesTabContext)_localctx).i = id();
				((AccesTabContext)_localctx).at = new AccesTabID((((AccesTabContext)_localctx).i!=null?_input.getText(((AccesTabContext)_localctx).i.start,((AccesTabContext)_localctx).i.stop):null));
				}
				break;
			case 2:
				{
				setState(183);
				((AccesTabContext)_localctx).f = func();
				((AccesTabContext)_localctx).at = new AccesTabID((((AccesTabContext)_localctx).f!=null?_input.getText(((AccesTabContext)_localctx).f.start,((AccesTabContext)_localctx).f.stop):null));
				}
				break;
			}
			setState(188);
			match(T__12);
			setState(189);
			((AccesTabContext)_localctx).e = expre();
			_localctx.at.addExpr((((AccesTabContext)_localctx).e!=null?_input.getText(((AccesTabContext)_localctx).e.start,((AccesTabContext)_localctx).e.stop):null));
			setState(191);
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

	public static class FuncContext extends ParserRuleContext {
		public Func f;
		public FuncNameContext n;
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<ExpreContext> expre() {
			return getRuleContexts(ExpreContext.class);
		}
		public ExpreContext expre(int i) {
			return getRuleContext(ExpreContext.class,i);
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
		enterRule(_localctx, 22, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((FuncContext)_localctx).n = funcName();
			((FuncContext)_localctx).f = new Func((((FuncContext)_localctx).n!=null?_input.getText(((FuncContext)_localctx).n.start,((FuncContext)_localctx).n.stop):null));
			setState(195);
			match(T__0);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__31) | (1L << T__34) | (1L << IDENTIFICATEUR) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(196);
				expre();
				_localctx.f.AddArg(expre);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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

	public static class ExprLAContext extends ParserRuleContext {
		public ExprLA value;
		public OrContext e;
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
		enterRule(_localctx, 24, RULE_exprLA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((ExprLAContext)_localctx).e = or();
			((ExprLAContext)_localctx).value =  ((ExprLAContext)_localctx).e.value;
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((OrContext)_localctx).e = and();
			((OrContext)_localctx).value = ((OrContext)_localctx).e.value;
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(211);
				match(T__22);
				setState(212);
				((OrContext)_localctx).e2 = and();
				((OrContext)_localctx).value =  new Or(_localctx.value,((OrContext)_localctx).e2.value);
				}
				}
				setState(219);
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((AndContext)_localctx).e = ene();
			((AndContext)_localctx).value = ((AndContext)_localctx).e.value;
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(222);
				match(T__23);
				setState(223);
				((AndContext)_localctx).e2 = ene();
				((AndContext)_localctx).value =  new And(_localctx.value,((AndContext)_localctx).e2.value);
				}
				}
				setState(230);
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitEne(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((EneContext)_localctx).e = ltgt();
			((EneContext)_localctx).value = ((EneContext)_localctx).e.value;
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(233);
					match(T__24);
					setState(234);
					((EneContext)_localctx).e2 = ltgt();
					((EneContext)_localctx).value =  new Equals(_localctx.value,((EneContext)_localctx).e2.value);
					}
					break;
				case T__25:
					{
					setState(237);
					match(T__25);
					setState(238);
					((EneContext)_localctx).e2 = ltgt();
					((EneContext)_localctx).value =  new NotEquals(_localctx.value,((EneContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(245);
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterLtgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitLtgt(this);
		}
	}

	public final LtgtContext ltgt() throws RecognitionException {
		LtgtContext _localctx = new LtgtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ltgt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((LtgtContext)_localctx).e1 = additionExpr();
			((LtgtContext)_localctx).value = ((LtgtContext)_localctx).e1.value;
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(248);
					match(T__26);
					setState(249);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new LesserThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__27:
					{
					setState(252);
					match(T__27);
					setState(253);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new LesserEqualThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__28:
					{
					setState(256);
					match(T__28);
					setState(257);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new GreaterEqualThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				case T__29:
					{
					setState(260);
					match(T__29);
					setState(261);
					((LtgtContext)_localctx).e2 = additionExpr();
					((LtgtContext)_localctx).value =  new GreaterThan(_localctx.value,((LtgtContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268);
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitAdditionExpr(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additionExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((AdditionExprContext)_localctx).e1 = multiplyExpr();
			((AdditionExprContext)_localctx).value =  ((AdditionExprContext)_localctx).e1.value;
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__30:
						{
						setState(271);
						match(T__30);
						setState(272);
						((AdditionExprContext)_localctx).e2 = multiplyExpr();
						((AdditionExprContext)_localctx).value =  new Add(_localctx.value,((AdditionExprContext)_localctx).e2.value);
						}
						break;
					case T__31:
						{
						setState(275);
						match(T__31);
						setState(276);
						((AdditionExprContext)_localctx).e2 = multiplyExpr();
						((AdditionExprContext)_localctx).value =  new Sub(_localctx.value,((AdditionExprContext)_localctx).e2.value);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			if ( listener instanceof bfListener ) ((bfListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bfListener ) ((bfListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((MultiplyExprContext)_localctx).e1 = atomExpr();
			((MultiplyExprContext)_localctx).value =  ((MultiplyExprContext)_localctx).e1.value;
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
					{
					setState(286);
					match(T__32);
					setState(287);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Mul(_localctx.value,  ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				case T__33:
					{
					setState(290);
					match(T__33);
					setState(291);
					((MultiplyExprContext)_localctx).e2 = atomExpr();
					((MultiplyExprContext)_localctx).value =  new Div(_localctx.value,  ((MultiplyExprContext)_localctx).e2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(298);
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
		public ConstanteContext e;
		public IdContext i;
		public FuncContext f;
		public AccesTabContext a;
		public OrContext e1;
		public AtomExprContext e2;
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_atomExpr);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((AtomExprContext)_localctx).e = constante();
				((AtomExprContext)_localctx).value = ((AtomExprContext)_localctx).e.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				((AtomExprContext)_localctx).i = id();
				((AtomExprContext)_localctx).value =  (((AtomExprContext)_localctx).i!=null?_input.getText(((AtomExprContext)_localctx).i.start,((AtomExprContext)_localctx).i.stop):null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				((AtomExprContext)_localctx).f = func();
				((AtomExprContext)_localctx).value =  (((AtomExprContext)_localctx).f!=null?_input.getText(((AtomExprContext)_localctx).f.start,((AtomExprContext)_localctx).f.stop):null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				((AtomExprContext)_localctx).a = accesTab();
				((AtomExprContext)_localctx).value =  (((AtomExprContext)_localctx).a!=null?_input.getText(((AtomExprContext)_localctx).a.start,((AtomExprContext)_localctx).a.stop):null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(T__0);
				setState(312);
				((AtomExprContext)_localctx).e1 = or();
				setState(313);
				match(T__2);
				((AtomExprContext)_localctx).value =  ((AtomExprContext)_localctx).e1.value;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(T__34);
				setState(317);
				((AtomExprContext)_localctx).e2 = atomExpr();
				((AtomExprContext)_localctx).value =  new Inv(((AtomExprContext)_localctx).e2.value);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				match(T__31);
				setState(321);
				((AtomExprContext)_localctx).e2 = atomExpr();
				((AtomExprContext)_localctx).value =  new Inv(((AtomExprContext)_localctx).e2.value);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\4\5\4B\n"+
		"\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5Q\n\5\r"+
		"\5\16\5R\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\5\13\u008d\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0093\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00a1\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a9"+
		"\n\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\13\3\13\3\13\5\13\u00b3\n\13\5"+
		"\13\u00b5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00da\n\17\f\17\16\17"+
		"\u00dd\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e5\n\20\f\20\16\20"+
		"\u00e8\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f4"+
		"\n\21\f\21\16\21\u00f7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010b\n\22\f\22"+
		"\16\22\u010e\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u011a\n\23\f\23\16\23\u011d\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0129\n\24\f\24\16\24\u012c\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0147\n\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0163\2*\3\2\2\2\4"+
		",\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\n\\\3\2\2\2\fd\3\2\2\2\16m\3\2\2\2\20"+
		"o\3\2\2\2\22\u0088\3\2\2\2\24\u00b4\3\2\2\2\26\u00bc\3\2\2\2\30\u00c3"+
		"\3\2\2\2\32\u00d0\3\2\2\2\34\u00d3\3\2\2\2\36\u00de\3\2\2\2 \u00e9\3\2"+
		"\2\2\"\u00f8\3\2\2\2$\u010f\3\2\2\2&\u011e\3\2\2\2(\u0146\3\2\2\2*+\5"+
		"\6\4\2+\3\3\2\2\2,-\5\20\t\2-\64\7\3\2\2./\5\20\t\2/\60\7\4\2\2\60\61"+
		"\5\n\6\2\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3"+
		"\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\5\2\289\7\4\2\29:\5\n\6\2:<\3"+
		"\2\2\2;=\5\b\5\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\24\13\2?\5\3\2\2\2"+
		"@B\5\b\5\2A@\3\2\2\2AB\3\2\2\2BF\3\2\2\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\24\13\2J\7\3\2\2\2KP\7\6"+
		"\2\2LM\5\20\t\2MN\7\4\2\2NO\5\n\6\2OQ\3\2\2\2PL\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\t\3\2\2\2TU\7\7\2\2U]\b\6\1\2VW\7\b\2\2W]\b\6\1\2XY"+
		"\7\t\2\2YZ\5\n\6\2Z[\b\6\1\2[]\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\X\3\2\2"+
		"\2]\13\3\2\2\2^_\7\'\2\2_e\b\7\1\2`a\7\n\2\2ae\b\7\1\2bc\7\13\2\2ce\b"+
		"\7\1\2d^\3\2\2\2d`\3\2\2\2db\3\2\2\2e\r\3\2\2\2fg\7\f\2\2gn\b\b\1\2hi"+
		"\7\r\2\2in\b\b\1\2jk\5\20\t\2kl\b\b\1\2ln\3\2\2\2mf\3\2\2\2mh\3\2\2\2"+
		"mj\3\2\2\2n\17\3\2\2\2op\7&\2\2pq\b\t\1\2q\21\3\2\2\2rs\5\f\7\2st\b\n"+
		"\1\2t\u0089\3\2\2\2uv\5\20\t\2vw\b\n\1\2w\u0089\3\2\2\2xy\5\32\16\2yz"+
		"\b\n\1\2z\u0089\3\2\2\2{|\5\30\r\2|}\b\n\1\2}\u0089\3\2\2\2~\177\5\26"+
		"\f\2\177\u0080\b\n\1\2\u0080\u0089\3\2\2\2\u0081\u0082\7\16\2\2\u0082"+
		"\u0083\5\n\6\2\u0083\u0084\7\17\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7"+
		"\20\2\2\u0086\u0087\b\n\1\2\u0087\u0089\3\2\2\2\u0088r\3\2\2\2\u0088u"+
		"\3\2\2\2\u0088x\3\2\2\2\u0088{\3\2\2\2\u0088~\3\2\2\2\u0088\u0081\3\2"+
		"\2\2\u0089\23\3\2\2\2\u008a\u008d\5\20\t\2\u008b\u008d\5\26\f\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\21"+
		"\2\2\u008f\u0092\5\22\n\2\u0090\u0091\7\22\2\2\u0091\u0093\5\24\13\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00b5\3\2\2\2\u0094\u0095\7\23"+
		"\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\24\2\2\u0097\u009a\5\24\13\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009b\5\24\13\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\25\2\2\u009d\u00a0\5\24\13"+
		"\2\u009e\u009f\7\22\2\2\u009f\u00a1\5\24\13\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00b5\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\5"+
		"\22\n\2\u00a4\u00a5\7\27\2\2\u00a5\u00a8\5\24\13\2\u00a6\u00a7\7\22\2"+
		"\2\u00a7\u00a9\5\24\13\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00b5\3\2\2\2\u00aa\u00ad\7\30\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ae\5"+
		"\24\13\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b5\3\2\2\2\u00af"+
		"\u00b2\5\30\r\2\u00b0\u00b1\7\22\2\2\u00b1\u00b3\5\24\13\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u008c\3\2\2\2\u00b4"+
		"\u0094\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\b\f\1\2\u00b8\u00bd"+
		"\3\2\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b\f\1\2\u00bb\u00bd\3\2\2\2"+
		"\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\7\17\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\b\f\1\2\u00c1\u00c2\7\20\2"+
		"\2\u00c2\27\3\2\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\r\1\2\u00c5\u00cb"+
		"\7\3\2\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\b\r\1\2\u00c8\u00ca\3\2\2\2"+
		"\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\5\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\b\16\1\2\u00d2\33\3\2\2"+
		"\2\u00d3\u00d4\5\36\20\2\u00d4\u00db\b\17\1\2\u00d5\u00d6\7\31\2\2\u00d6"+
		"\u00d7\5\36\20\2\u00d7\u00d8\b\17\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d5"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\35\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5 \21\2\u00df\u00e6\b\20\1"+
		"\2\u00e0\u00e1\7\32\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\b\20\1\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5\"\22\2\u00ea\u00f5\b\21\1\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5\"\22"+
		"\2\u00ed\u00ee\b\21\1\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\7\34\2\2\u00f0"+
		"\u00f1\5\"\22\2\u00f1\u00f2\b\21\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00eb\3"+
		"\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5$\23\2"+
		"\u00f9\u010c\b\22\1\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd"+
		"\b\22\1\2\u00fd\u010b\3\2\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\5$\23\2"+
		"\u0100\u0101\b\22\1\2\u0101\u010b\3\2\2\2\u0102\u0103\7\37\2\2\u0103\u0104"+
		"\5$\23\2\u0104\u0105\b\22\1\2\u0105\u010b\3\2\2\2\u0106\u0107\7 \2\2\u0107"+
		"\u0108\5$\23\2\u0108\u0109\b\22\1\2\u0109\u010b\3\2\2\2\u010a\u00fa\3"+
		"\2\2\2\u010a\u00fe\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0106\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d#\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0110\5&\24\2\u0110\u011b\b\23\1\2\u0111\u0112"+
		"\7!\2\2\u0112\u0113\5&\24\2\u0113\u0114\b\23\1\2\u0114\u011a\3\2\2\2\u0115"+
		"\u0116\7\"\2\2\u0116\u0117\5&\24\2\u0117\u0118\b\23\1\2\u0118\u011a\3"+
		"\2\2\2\u0119\u0111\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c%\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u011f\5(\25\2\u011f\u012a\b\24\1\2\u0120\u0121\7#\2\2\u0121\u0122"+
		"\5(\25\2\u0122\u0123\b\24\1\2\u0123\u0129\3\2\2\2\u0124\u0125\7$\2\2\u0125"+
		"\u0126\5(\25\2\u0126\u0127\b\24\1\2\u0127\u0129\3\2\2\2\u0128\u0120\3"+
		"\2\2\2\u0128\u0124\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\'\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5\f\7\2"+
		"\u012e\u012f\b\25\1\2\u012f\u0147\3\2\2\2\u0130\u0131\5\20\t\2\u0131\u0132"+
		"\b\25\1\2\u0132\u0147\3\2\2\2\u0133\u0134\5\30\r\2\u0134\u0135\b\25\1"+
		"\2\u0135\u0147\3\2\2\2\u0136\u0137\5\26\f\2\u0137\u0138\b\25\1\2\u0138"+
		"\u0147\3\2\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\34\17\2\u013b\u013c\7"+
		"\5\2\2\u013c\u013d\b\25\1\2\u013d\u0147\3\2\2\2\u013e\u013f\7%\2\2\u013f"+
		"\u0140\5(\25\2\u0140\u0141\b\25\1\2\u0141\u0147\3\2\2\2\u0142\u0143\7"+
		"\"\2\2\u0143\u0144\5(\25\2\u0144\u0145\b\25\1\2\u0145\u0147\3\2\2\2\u0146"+
		"\u012d\3\2\2\2\u0146\u0130\3\2\2\2\u0146\u0133\3\2\2\2\u0146\u0136\3\2"+
		"\2\2\u0146\u0139\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0142\3\2\2\2\u0147"+
		")\3\2\2\2 \64<AFR\\dm\u0088\u008c\u0092\u009a\u00a0\u00a8\u00ad\u00b2"+
		"\u00b4\u00bc\u00cb\u00db\u00e6\u00f3\u00f5\u010a\u010c\u0119\u011b\u0128"+
		"\u012a\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}