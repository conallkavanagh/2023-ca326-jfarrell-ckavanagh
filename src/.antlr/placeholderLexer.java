// Generated from \\wsl.localhost\Ubuntu\home\farrej82\documents\typ\2023-ca326-jfarrell-ckavanagh\src\placeholder.g4 by ANTLR 4.9.2
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
		NUMBER=1, WS=2, Say=3, Loop=4, Init=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "D", "E", "F", "G", "H", "I", "L", "N", "O", "P", "R", "S", "T", 
			"U", "W", "Y", "NUMBER", "WS", "Say", "Loop", "Init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "WS", "Say", "Loop", "Init"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23S"+
		"\n\23\r\23\16\23T\3\24\6\24X\n\24\r\24\16\24Y\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\2\30\3\2\5\2"+
		"\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%"+
		"\3\'\4)\5+\6-\7\3\2\25\4\2CCcc\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJj"+
		"j\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2YYyy\4\2[[{{\3\2\62;\5\2\13\f\17\17\"\"\2[\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2"+
		"\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23"+
		"?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35I\3\2\2\2"+
		"\37K\3\2\2\2!M\3\2\2\2#O\3\2\2\2%R\3\2\2\2\'W\3\2\2\2)]\3\2\2\2+a\3\2"+
		"\2\2-f\3\2\2\2/\60\t\2\2\2\60\4\3\2\2\2\61\62\t\3\2\2\62\6\3\2\2\2\63"+
		"\64\t\4\2\2\64\b\3\2\2\2\65\66\t\5\2\2\66\n\3\2\2\2\678\t\6\2\28\f\3\2"+
		"\2\29:\t\7\2\2:\16\3\2\2\2;<\t\b\2\2<\20\3\2\2\2=>\t\t\2\2>\22\3\2\2\2"+
		"?@\t\n\2\2@\24\3\2\2\2AB\t\13\2\2B\26\3\2\2\2CD\t\f\2\2D\30\3\2\2\2EF"+
		"\t\r\2\2F\32\3\2\2\2GH\t\16\2\2H\34\3\2\2\2IJ\t\17\2\2J\36\3\2\2\2KL\t"+
		"\20\2\2L \3\2\2\2MN\t\21\2\2N\"\3\2\2\2OP\t\22\2\2P$\3\2\2\2QS\t\23\2"+
		"\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U&\3\2\2\2VX\t\24\2\2WV\3\2"+
		"\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\24\2\2\\(\3\2\2\2]^"+
		"\5\33\16\2^_\5\3\2\2_`\5#\22\2`*\3\2\2\2ab\5\21\t\2bc\5\25\13\2cd\5\25"+
		"\13\2de\5\27\f\2e,\3\2\2\2fg\5\17\b\2gh\5\23\n\2hi\5\17\b\2ij\5\35\17"+
		"\2j.\3\2\2\2\5\2TY\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}