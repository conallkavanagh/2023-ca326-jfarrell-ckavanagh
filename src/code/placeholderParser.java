// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class placeholderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Say=1, Loop=2, Init=3, WORD=4, NUMBER=5, WS=6;
	public static final int
		RULE_prog = 0, RULE_stm = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stm"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public placeholderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) {
				{
				{
				setState(4);
				stm();
				}
				}
				setState(9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends StmContext {
		public TerminalNode Init() { return getToken(placeholderParser.Init, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(placeholderParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(placeholderParser.NUMBER, i);
		}
		public InitContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitInit(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StmContext {
		public TerminalNode Say() { return getToken(placeholderParser.Say, 0); }
		public PrintContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends StmContext {
		public TerminalNode Loop() { return getToken(placeholderParser.Loop, 0); }
		public TerminalNode NUMBER() { return getToken(placeholderParser.NUMBER, 0); }
		public LoopContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitLoop(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stm);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Init:
				_localctx = new InitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(Init);
				setState(11);
				match(NUMBER);
				setState(12);
				match(NUMBER);
				}
				break;
			case Say:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(Say);
				}
				break;
			case Loop:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(Loop);
				setState(15);
				match(NUMBER);
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
		"\u0004\u0001\u0006\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0011\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000"+
		"\u0013\u0000\u0007\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000"+
		"\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000"+
		"\u0000\u0006\t\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000"+
		"\u0007\b\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000\u0000\t\u0007"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0005\u0003\u0000\u0000\u000b\f\u0005"+
		"\u0005\u0000\u0000\f\u0011\u0005\u0005\u0000\u0000\r\u0011\u0005\u0001"+
		"\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0011\u0005\u0005"+
		"\u0000\u0000\u0010\n\u0001\u0000\u0000\u0000\u0010\r\u0001\u0000\u0000"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0007\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}