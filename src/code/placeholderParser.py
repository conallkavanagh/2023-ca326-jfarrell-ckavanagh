# Generated from placeholder.g4 by ANTLR 4.11.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,6,19,2,0,7,0,2,1,7,1,1,0,5,0,6,8,0,10,0,12,0,9,9,0,1,1,1,1,1,
        1,1,1,1,1,1,1,3,1,17,8,1,1,1,0,0,2,0,2,0,0,19,0,7,1,0,0,0,2,16,1,
        0,0,0,4,6,3,2,1,0,5,4,1,0,0,0,6,9,1,0,0,0,7,5,1,0,0,0,7,8,1,0,0,
        0,8,1,1,0,0,0,9,7,1,0,0,0,10,11,5,3,0,0,11,12,5,5,0,0,12,17,5,5,
        0,0,13,17,5,1,0,0,14,15,5,2,0,0,15,17,5,5,0,0,16,10,1,0,0,0,16,13,
        1,0,0,0,16,14,1,0,0,0,17,3,1,0,0,0,2,7,16
    ]

class placeholderParser ( Parser ):

    grammarFileName = "placeholder.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "Say", "Loop", "Init", "WORD", "NUMBER", 
                      "WS" ]

    RULE_prog = 0
    RULE_stm = 1

    ruleNames =  [ "prog", "stm" ]

    EOF = Token.EOF
    Say=1
    Loop=2
    Init=3
    WORD=4
    NUMBER=5
    WS=6

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stm(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(placeholderParser.StmContext)
            else:
                return self.getTypedRuleContext(placeholderParser.StmContext,i)


        def getRuleIndex(self):
            return placeholderParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = placeholderParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((_la) & ~0x3f) == 0 and ((1 << _la) & 14) != 0:
                self.state = 4
                self.stm()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return placeholderParser.RULE_stm

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class InitContext(StmContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a placeholderParser.StmContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Init(self):
            return self.getToken(placeholderParser.Init, 0)
        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(placeholderParser.NUMBER)
            else:
                return self.getToken(placeholderParser.NUMBER, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInit" ):
                listener.enterInit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInit" ):
                listener.exitInit(self)


    class PrintContext(StmContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a placeholderParser.StmContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Say(self):
            return self.getToken(placeholderParser.Say, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)


    class LoopContext(StmContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a placeholderParser.StmContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def Loop(self):
            return self.getToken(placeholderParser.Loop, 0)
        def NUMBER(self):
            return self.getToken(placeholderParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLoop" ):
                listener.enterLoop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLoop" ):
                listener.exitLoop(self)



    def stm(self):

        localctx = placeholderParser.StmContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stm)
        try:
            self.state = 16
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                localctx = placeholderParser.InitContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 10
                self.match(placeholderParser.Init)
                self.state = 11
                self.match(placeholderParser.NUMBER)
                self.state = 12
                self.match(placeholderParser.NUMBER)
                pass
            elif token in [1]:
                localctx = placeholderParser.PrintContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 13
                self.match(placeholderParser.Say)
                pass
            elif token in [2]:
                localctx = placeholderParser.LoopContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 14
                self.match(placeholderParser.Loop)
                self.state = 15
                self.match(placeholderParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





