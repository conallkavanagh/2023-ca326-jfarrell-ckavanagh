# Generated from placeholder.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .placeholderParser import placeholderParser
else:
    from placeholderParser import placeholderParser

# This class defines a complete listener for a parse tree produced by placeholderParser.
class placeholderListener(ParseTreeListener):

    # Enter a parse tree produced by placeholderParser#prog.
    def enterProg(self, ctx:placeholderParser.ProgContext):
        pass

    # Exit a parse tree produced by placeholderParser#prog.
    def exitProg(self, ctx:placeholderParser.ProgContext):
        pass


    # Enter a parse tree produced by placeholderParser#init.
    def enterInit(self, ctx:placeholderParser.InitContext):
        pass

    # Exit a parse tree produced by placeholderParser#init.
    def exitInit(self, ctx:placeholderParser.InitContext):
        pass


    # Enter a parse tree produced by placeholderParser#print.
    def enterPrint(self, ctx:placeholderParser.PrintContext):
        pass

    # Exit a parse tree produced by placeholderParser#print.
    def exitPrint(self, ctx:placeholderParser.PrintContext):
        pass


    # Enter a parse tree produced by placeholderParser#loop.
    def enterLoop(self, ctx:placeholderParser.LoopContext):
        pass

    # Exit a parse tree produced by placeholderParser#loop.
    def exitLoop(self, ctx:placeholderParser.LoopContext):
        pass



del placeholderParser