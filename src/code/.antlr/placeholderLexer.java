// Generated from \\wsl.localhost\Ubuntu\home\farrej82\documents\typ\2023-ca326-jfarrell-ckavanagh\src\code\placeholder.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class placeholderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Say=1, Loop=2, DATATYPE=3, NUMTYPE=4, STRTYPE=5, ID=6, NUMBER=7, IF=8, 
		ENDIF=9, PLUS=10, EQUAL=11, ASSIGN=12, NOTEQUAL=13, SEMICOLON=14, WORD=15, 
		WS=16, NL=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Say", "Loop", 
			"DATATYPE", "NUMTYPE", "STRTYPE", "ID", "NUMBER", "IF", "ENDIF", "PLUS", 
			"EQUAL", "ASSIGN", "NOTEQUAL", "SEMICOLON", "WORD", "WS", "NL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'if'", "'endif'", "'+'", 
			"'=='", "'is'", "'!='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Say", "Loop", "DATATYPE", "NUMTYPE", "STRTYPE", "ID", "NUMBER", 
			"IF", "ENDIF", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", "SEMICOLON", "WORD", 
			"WS", "NL"
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


	public placeholderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "placeholder.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00dd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\5\36\u0099\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\6\"\u00ad\n\"\r\"\16\"\u00ae\3\"\5"+
		"\"\u00b2\n\"\3\"\7\"\u00b5\n\"\f\"\16\"\u00b8\13\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\6*\u00d1\n*\r*\16"+
		"*\u00d2\3+\6+\u00d6\n+\r+\16+\u00d7\3+\3+\3,\3,\2\2-\3\2\5\2\7\2\t\2\13"+
		"\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20"+
		"S\21U\22W\23\3\2 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2"+
		"IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\3\2\62;\5\2C\\c|~~\5\2\13\13\17\17\"\"\3\2\f\f\2\u00c8"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2"+
		"\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2"+
		"\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2"+
		"\2\2\37u\3\2\2\2!w\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2"+
		"+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\u0089"+
		"\3\2\2\2\65\u008b\3\2\2\2\67\u008d\3\2\2\29\u0091\3\2\2\2;\u0098\3\2\2"+
		"\2=\u009a\3\2\2\2?\u00a1\3\2\2\2A\u00a8\3\2\2\2C\u00ac\3\2\2\2E\u00b9"+
		"\3\2\2\2G\u00bc\3\2\2\2I\u00c2\3\2\2\2K\u00c4\3\2\2\2M\u00c7\3\2\2\2O"+
		"\u00ca\3\2\2\2Q\u00cd\3\2\2\2S\u00d0\3\2\2\2U\u00d5\3\2\2\2W\u00db\3\2"+
		"\2\2YZ\t\2\2\2Z\4\3\2\2\2[\\\t\3\2\2\\\6\3\2\2\2]^\t\4\2\2^\b\3\2\2\2"+
		"_`\t\5\2\2`\n\3\2\2\2ab\t\6\2\2b\f\3\2\2\2cd\t\7\2\2d\16\3\2\2\2ef\t\b"+
		"\2\2f\20\3\2\2\2gh\t\t\2\2h\22\3\2\2\2ij\t\n\2\2j\24\3\2\2\2kl\t\13\2"+
		"\2l\26\3\2\2\2mn\t\f\2\2n\30\3\2\2\2op\t\r\2\2p\32\3\2\2\2qr\t\16\2\2"+
		"r\34\3\2\2\2st\t\17\2\2t\36\3\2\2\2uv\t\20\2\2v \3\2\2\2wx\t\21\2\2x\""+
		"\3\2\2\2yz\t\22\2\2z$\3\2\2\2{|\t\23\2\2|&\3\2\2\2}~\t\24\2\2~(\3\2\2"+
		"\2\177\u0080\t\25\2\2\u0080*\3\2\2\2\u0081\u0082\t\26\2\2\u0082,\3\2\2"+
		"\2\u0083\u0084\t\27\2\2\u0084.\3\2\2\2\u0085\u0086\t\30\2\2\u0086\60\3"+
		"\2\2\2\u0087\u0088\t\31\2\2\u0088\62\3\2\2\2\u0089\u008a\t\32\2\2\u008a"+
		"\64\3\2\2\2\u008b\u008c\t\33\2\2\u008c\66\3\2\2\2\u008d\u008e\5\'\24\2"+
		"\u008e\u008f\5\3\2\2\u008f\u0090\5\63\32\2\u00908\3\2\2\2\u0091\u0092"+
		"\5\31\r\2\u0092\u0093\5\37\20\2\u0093\u0094\5\37\20\2\u0094\u0095\5!\21"+
		"\2\u0095:\3\2\2\2\u0096\u0099\5=\37\2\u0097\u0099\5? \2\u0098\u0096\3"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099<\3\2\2\2\u009a\u009b\5\35\17\2\u009b"+
		"\u009c\5+\26\2\u009c\u009d\5\33\16\2\u009d\u009e\5\5\3\2\u009e\u009f\5"+
		"\13\6\2\u009f\u00a0\5%\23\2\u00a0>\3\2\2\2\u00a1\u00a2\5\'\24\2\u00a2"+
		"\u00a3\5)\25\2\u00a3\u00a4\5%\23\2\u00a4\u00a5\5\23\n\2\u00a5\u00a6\5"+
		"\35\17\2\u00a6\u00a7\5\17\b\2\u00a7@\3\2\2\2\u00a8\u00a9\5\23\n\2\u00a9"+
		"\u00aa\5\t\5\2\u00aaB\3\2\2\2\u00ab\u00ad\t\34\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b6\3\2\2\2\u00b3\u00b5\t\34\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7D\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bbF\3\2\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7h\2\2\u00c1H\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3J\3\2\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5\u00c6\7?\2\2\u00c6L\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9N\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00cc"+
		"P\3\2\2\2\u00cd\u00ce\7=\2\2\u00ceR\3\2\2\2\u00cf\u00d1\t\35\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3T\3\2\2\2\u00d4\u00d6\t\36\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b+\2\2\u00daV\3\2\2\2\u00db\u00dc\t\37\2\2\u00dcX\3\2\2\2\t\2\u0098"+
		"\u00ae\u00b1\u00b6\u00d2\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}