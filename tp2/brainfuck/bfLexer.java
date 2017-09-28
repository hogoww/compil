// Generated from bf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K=1, N=2, T=3, F=4, ID=5, UOP=6, BOP=7, E=8, I=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"K", "N", "T", "F", "ID", "UOP", "BOP", "E", "I", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K", "N", "T", "F", "ID", "UOP", "BOP", "E", "I", "WS"
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


	public bfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\3\6\3%\n\3\r"+
		"\3\16\3&\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5M\n\5\3\6\6\6P\n\6\r\6\16\6Q\3\7\3\7\3\7\3\7\3\7\5\7"+
		"Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t|\n\t\f\t\16\t\177\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d7\n\n\f\n\16\n\u00da\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\13\6\13\u00e5\n\13\r\13\16\13\u00e6\3"+
		"\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\5\2"+
		"C\\aac|\5\2,-//\61\61\5\2\13\f\17\17\"\"\2\u0108\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7@\3\2\2\2\t"+
		"L\3\2\2\2\13O\3\2\2\2\rX\3\2\2\2\17m\3\2\2\2\21\u0094\3\2\2\2\23\u00e1"+
		"\3\2\2\2\25\u00e4\3\2\2\2\27\"\5\5\3\2\30\31\7v\2\2\31\32\7t\2\2\32\33"+
		"\7w\2\2\33\"\7g\2\2\34\35\7h\2\2\35\36\7c\2\2\36\37\7n\2\2\37 \7u\2\2"+
		" \"\7g\2\2!\27\3\2\2\2!\30\3\2\2\2!\34\3\2\2\2\"\4\3\2\2\2#%\4\62;\2$"+
		"#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\6\3\2\2\2()\7k\2\2)*\7p\2\2"+
		"*+\7v\2\2+,\7g\2\2,-\7i\2\2-.\7g\2\2.A\7t\2\2/\60\7d\2\2\60\61\7q\2\2"+
		"\61\62\7q\2\2\62\63\7n\2\2\63\64\7g\2\2\64\65\7c\2\2\65A\7p\2\2\66\67"+
		"\7c\2\2\678\7t\2\289\7t\2\29:\7c\2\2:;\7{\2\2;<\7\"\2\2<=\7q\2\2=>\7h"+
		"\2\2>?\3\2\2\2?A\5\7\4\2@(\3\2\2\2@/\3\2\2\2@\66\3\2\2\2A\b\3\2\2\2BC"+
		"\7t\2\2CD\7g\2\2DE\7c\2\2EM\7f\2\2FG\7y\2\2GH\7t\2\2HI\7k\2\2IJ\7v\2\2"+
		"JM\7g\2\2KM\5\13\6\2LB\3\2\2\2LF\3\2\2\2LK\3\2\2\2M\n\3\2\2\2NP\t\2\2"+
		"\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\f\3\2\2\2SY\7/\2\2TU\7p\2"+
		"\2UV\7q\2\2VW\7v\2\2WY\7\"\2\2XS\3\2\2\2XT\3\2\2\2Y\16\3\2\2\2Zn\t\3\2"+
		"\2[\\\7\"\2\2\\]\7c\2\2]^\7p\2\2^_\7f\2\2_n\7\"\2\2`a\7\"\2\2ab\7q\2\2"+
		"bc\7t\2\2cn\7\"\2\2dn\7>\2\2ef\7>\2\2fn\7?\2\2gn\7?\2\2hi\7#\2\2in\7?"+
		"\2\2jk\7@\2\2kn\7?\2\2ln\7@\2\2mZ\3\2\2\2m[\3\2\2\2m`\3\2\2\2md\3\2\2"+
		"\2me\3\2\2\2mg\3\2\2\2mh\3\2\2\2mj\3\2\2\2ml\3\2\2\2n\20\3\2\2\2o\u0095"+
		"\5\3\2\2pq\7*\2\2qr\5\21\t\2rs\7+\2\2s\u0095\3\2\2\2t\u0095\5\13\6\2u"+
		"v\5\r\7\2vw\5\21\t\2w\u0095\3\2\2\2xy\5\t\5\2y}\7*\2\2z|\5\21\t\2{z\3"+
		"\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7+\2\2\u0081\u0095\3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084\7g\2"+
		"\2\u0084\u0085\7y\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a\u008b\7{\2\2\u008b"+
		"\u008c\7\"\2\2\u008c\u008d\7q\2\2\u008d\u008e\7h\2\2\u008e\u008f\3\2\2"+
		"\2\u008f\u0090\5\7\4\2\u0090\u0091\7]\2\2\u0091\u0092\5\21\t\2\u0092\u0093"+
		"\7_\2\2\u0093\u0095\3\2\2\2\u0094o\3\2\2\2\u0094p\3\2\2\2\u0094t\3\2\2"+
		"\2\u0094u\3\2\2\2\u0094x\3\2\2\2\u0094\u0082\3\2\2\2\u0095\22\3\2\2\2"+
		"\u0096\u0097\7x\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7\"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5\13\6\2\u009c\u009d\7\"\2\2"+
		"\u009d\u009e\7<\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\5\7\4\2\u00a1\u00e2\3\2\2\2\u00a2\u00a3\5\13\6\2\u00a3\u00a4\7<\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\21\t\2\u00a7\u00e2\3\2"+
		"\2\2\u00a8\u00a9\5\21\t\2\u00a9\u00aa\7]\2\2\u00aa\u00ab\5\21\t\2\u00ab"+
		"\u00ac\7_\2\2\u00ac\u00ad\7<\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b0\5\21\t\2\u00b0\u00e2\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7h\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\21\t\2\u00b6"+
		"\u00b7\7\"\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2"+
		"\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\5\21\t\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\3\2\2"+
		"\2\u00c5\u00c6\5\21\t\2\u00c6\u00e2\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9"+
		"\7j\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7\"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5\21\t\2\u00cf\u00d0\7"+
		"\"\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7q\2\2\u00d2\u00e2\3\2\2\2\u00d3"+
		"\u00d4\5\t\5\2\u00d4\u00d8\7*\2\2\u00d5\u00d7\5\21\t\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7+\2\2\u00dc\u00e2\3\2"+
		"\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7m\2\2\u00df\u00e0\7k\2\2\u00e0\u00e2"+
		"\7r\2\2\u00e1\u0096\3\2\2\2\u00e1\u00a2\3\2\2\2\u00e1\u00a8\3\2\2\2\u00e1"+
		"\u00b1\3\2\2\2\u00e1\u00c7\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00dd\3\2"+
		"\2\2\u00e2\24\3\2\2\2\u00e3\u00e5\t\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\b\13\2\2\u00e9\26\3\2\2\2\17\2!&@LQXm}\u0094\u00d8\u00e1\u00e6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}