// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class placeholderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Say=1, Loop=2, Init=3, WORD=4, NUMBER=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "D", "E", "F", "G", "H", "I", "L", "N", "O", "P", "R", "S", "T", 
			"U", "W", "Y", "Say", "Loop", "Init", "WORD", "NUMBER", "WS"
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
			null, "Say", "Loop", "Init", "WORD", "NUMBER", "WS"
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
		"\u0004\u0000\u0006p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0004\u0014a\b\u0014\u000b\u0014\f\u0014b\u0001\u0015\u0004"+
		"\u0015f\b\u0015\u000b\u0015\f\u0015g\u0001\u0016\u0004\u0016k\b\u0016"+
		"\u000b\u0016\f\u0016l\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001"+
		"\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000"+
		"\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000"+
		"\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u0001%\u0002\'\u0003)\u0004"+
		"+\u0005-\u0006\u0001\u0000\u0014\u0002\u0000AAaa\u0002\u0000DDdd\u0002"+
		"\u0000EEee\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000HHhh\u0002\u0000"+
		"IIii\u0002\u0000LLll\u0002\u0000NNnn\u0002\u0000OOoo\u0002\u0000PPpp\u0002"+
		"\u0000RRrr\u0002\u0000SSss\u0002\u0000TTtt\u0002\u0000UUuu\u0002\u0000"+
		"WWww\u0002\u0000YYyy\u0003\u0000AZaz||\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  a\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000"+
		"\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007"+
		"5\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000"+
		"\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015C"+
		"\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019G\u0001\u0000"+
		"\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dK\u0001\u0000\u0000\u0000"+
		"\u001fM\u0001\u0000\u0000\u0000!O\u0001\u0000\u0000\u0000#Q\u0001\u0000"+
		"\u0000\u0000%U\u0001\u0000\u0000\u0000\'Z\u0001\u0000\u0000\u0000)`\u0001"+
		"\u0000\u0000\u0000+e\u0001\u0000\u0000\u0000-j\u0001\u0000\u0000\u0000"+
		"/0\u0007\u0000\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0007\u0001"+
		"\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0007\u0002\u0000\u0000"+
		"4\u0006\u0001\u0000\u0000\u000056\u0007\u0003\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0007\u0004\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0007"+
		"\u0005\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0007\u0006\u0000\u0000"+
		"<\u000e\u0001\u0000\u0000\u0000=>\u0007\u0007\u0000\u0000>\u0010\u0001"+
		"\u0000\u0000\u0000?@\u0007\b\u0000\u0000@\u0012\u0001\u0000\u0000\u0000"+
		"AB\u0007\t\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0007\n\u0000"+
		"\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0007\u000b\u0000\u0000F\u0018"+
		"\u0001\u0000\u0000\u0000GH\u0007\f\u0000\u0000H\u001a\u0001\u0000\u0000"+
		"\u0000IJ\u0007\r\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KL\u0007\u000e"+
		"\u0000\u0000L\u001e\u0001\u0000\u0000\u0000MN\u0007\u000f\u0000\u0000"+
		"N \u0001\u0000\u0000\u0000OP\u0007\u0010\u0000\u0000P\"\u0001\u0000\u0000"+
		"\u0000QR\u0003\u0019\f\u0000RS\u0003\u0001\u0000\u0000ST\u0003!\u0010"+
		"\u0000T$\u0001\u0000\u0000\u0000UV\u0003\u000f\u0007\u0000VW\u0003\u0013"+
		"\t\u0000WX\u0003\u0013\t\u0000XY\u0003\u0015\n\u0000Y&\u0001\u0000\u0000"+
		"\u0000Z[\u0003\r\u0006\u0000[\\\u0003\u0011\b\u0000\\]\u0003\r\u0006\u0000"+
		"]^\u0003\u001b\r\u0000^(\u0001\u0000\u0000\u0000_a\u0007\u0011\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c*\u0001\u0000\u0000\u0000df\u0007\u0012"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h,\u0001\u0000\u0000\u0000"+
		"ik\u0007\u0013\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0006\u0016\u0000\u0000o.\u0001\u0000\u0000\u0000\u0004"+
		"\u0000bgl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}