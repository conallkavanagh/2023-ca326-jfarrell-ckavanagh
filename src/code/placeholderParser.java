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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DATATYPE=7, NUMTYPE=8, 
		STRTYPE=9, BOOLTYPE=10, STRING=11, NUMBER=12, BOOL=13, IF=14, END=15, 
		ELSE=16, OP=17, BOOLOP=18, PLUS=19, MINUS=20, MULT=21, DIV=22, EQUAL=23, 
		ASSIGN=24, NOTEQUAL=25, LESSTHAN=26, GREATERTHAN=27, LESSTHANEQ=28, GREATERTHANEQ=29, 
		SEMICOLON=30, LCURL=31, RCURL=32, COMMENT=33, ID=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_stm = 1, RULE_say = 2, RULE_expression = 3, RULE_term = 4, 
		RULE_ifstmt = 5, RULE_assignstmt = 6, RULE_loop = 7, RULE_list = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stm", "say", "expression", "term", "ifstmt", "assignstmt", "loop", 
			"list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'say'", "'loop'", "'times'", "'['", "','", "']'", null, null, 
			null, null, null, null, null, "'if'", "'end'", "'else'", null, null, 
			"'+'", "'-'", "'*'", "'/'", "'='", "'is'", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DATATYPE", "NUMTYPE", "STRTYPE", 
			"BOOLTYPE", "STRING", "NUMBER", "BOOL", "IF", "END", "ELSE", "OP", "BOOLOP", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "ASSIGN", "NOTEQUAL", "LESSTHAN", 
			"GREATERTHAN", "LESSTHANEQ", "GREATERTHANEQ", "SEMICOLON", "LCURL", "RCURL", 
			"COMMENT", "ID", "WS"
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16518L) != 0) {
				{
				{
				setState(18);
				stm();
				}
				}
				setState(23);
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
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public SayContext say() {
			return getRuleContext(SayContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitStm(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stm);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				ifstmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				say();
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				assignstmt();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SayContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(placeholderParser.STRING, 0); }
		public SayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_say; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterSay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitSay(this);
		}
	}

	public final SayContext say() throws RecognitionException {
		SayContext _localctx = new SayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_say);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(STRING);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(placeholderParser.OP, 0); }
		public TerminalNode BOOLOP() { return getToken(placeholderParser.BOOLOP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(37);
						match(OP);
						setState(38);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(40);
						match(BOOLOP);
						setState(41);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(placeholderParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(placeholderParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(placeholderParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(placeholderParser.BOOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(BOOL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(placeholderParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(placeholderParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LCURL() { return getTokens(placeholderParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(placeholderParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(placeholderParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(placeholderParser.RCURL, i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(placeholderParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(placeholderParser.ELSE, i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IF);
			setState(55);
			expression(0);
			setState(56);
			match(LCURL);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16518L) != 0) {
				{
				{
				setState(57);
				stm();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(RCURL);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(ELSE);
					setState(65);
					match(IF);
					setState(66);
					expression(0);
					setState(67);
					match(LCURL);
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16518L) != 0) {
						{
						{
						setState(68);
						stm();
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(74);
					match(RCURL);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(81);
				match(ELSE);
				setState(82);
				match(LCURL);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16518L) != 0) {
					{
					{
					setState(83);
					stm();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(RCURL);
				}
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
	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(placeholderParser.DATATYPE, 0); }
		public TerminalNode ID() { return getToken(placeholderParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(placeholderParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(placeholderParser.SEMICOLON, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitAssignstmt(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DATATYPE);
			setState(93);
			match(ID);
			setState(94);
			match(ASSIGN);
			setState(95);
			expression(0);
			setState(96);
			match(SEMICOLON);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(placeholderParser.NUMBER, 0); }
		public TerminalNode LCURL() { return getToken(placeholderParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(placeholderParser.RCURL, 0); }
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__1);
			setState(99);
			match(NUMBER);
			setState(100);
			match(T__2);
			setState(101);
			match(LCURL);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16518L) != 0) {
				{
				{
				setState(102);
				stm();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(RCURL);
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
	public static class ListContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof placeholderListener ) ((placeholderListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__3);
				setState(111);
				term();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(112);
					match(T__4);
					setState(113);
					term();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__3);
				setState(122);
				match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005"+
		">\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005"+
		"\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007k\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bs\b\b"+
		"\n\b\f\bv\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\b\u0000"+
		"\u0001\u0006\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000\u0086"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000"+
		"\u0004\u001e\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b"+
		"4\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000"+
		"\u0000\u000eb\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u001d\u0003\n\u0005\u0000\u0019\u001d"+
		"\u0003\u0004\u0002\u0000\u001a\u001d\u0003\f\u0006\u0000\u001b\u001d\u0003"+
		"\u000e\u0007\u0000\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0001\u0000\u0000\u001f \u0005\u000b\u0000\u0000 \u0005\u0001\u0000\u0000"+
		"\u0000!\"\u0006\u0003\uffff\uffff\u0000\"#\u0003\b\u0004\u0000#,\u0001"+
		"\u0000\u0000\u0000$%\n\u0002\u0000\u0000%&\u0005\u0011\u0000\u0000&+\u0003"+
		"\u0006\u0003\u0003\'(\n\u0001\u0000\u0000()\u0005\u0012\u0000\u0000)+"+
		"\u0003\u0006\u0003\u0002*$\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-\u0007\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/5\u0005\"\u0000\u000005\u0005\f\u0000\u000015\u0005\u000b\u0000\u0000"+
		"25\u0005\r\u0000\u000035\u0003\u0010\b\u00004/\u0001\u0000\u0000\u0000"+
		"40\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\u000e"+
		"\u0000\u000078\u0003\u0006\u0003\u00008<\u0005\u001f\u0000\u00009;\u0003"+
		"\u0002\u0001\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?N\u0005 \u0000\u0000@A\u0005\u0010\u0000"+
		"\u0000AB\u0005\u000e\u0000\u0000BC\u0003\u0006\u0003\u0000CG\u0005\u001f"+
		"\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005 \u0000\u0000"+
		"KM\u0001\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OZ\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0010\u0000\u0000RV\u0005"+
		"\u001f\u0000\u0000SU\u0003\u0002\u0001\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0005 \u0000"+
		"\u0000ZQ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u000b\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u0007\u0000\u0000]^\u0005\"\u0000\u0000^_"+
		"\u0005\u0018\u0000\u0000_`\u0003\u0006\u0003\u0000`a\u0005\u001e\u0000"+
		"\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0005\f"+
		"\u0000\u0000de\u0005\u0003\u0000\u0000ei\u0005\u001f\u0000\u0000fh\u0003"+
		"\u0002\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0005 \u0000\u0000m\u000f\u0001\u0000"+
		"\u0000\u0000no\u0005\u0004\u0000\u0000ot\u0003\b\u0004\u0000pq\u0005\u0005"+
		"\u0000\u0000qs\u0003\b\u0004\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0006\u0000\u0000"+
		"x|\u0001\u0000\u0000\u0000yz\u0005\u0004\u0000\u0000z|\u0005\u0006\u0000"+
		"\u0000{n\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|\u0011\u0001"+
		"\u0000\u0000\u0000\r\u0015\u001c*,4<GNVZit{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}