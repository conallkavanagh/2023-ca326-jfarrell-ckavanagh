grammar placeholder;

fragment A:	'a'|'A';
fragment B:	'b'|'B';
fragment C:	'c'|'C';
fragment D:	'd'|'D';
fragment E:	'e'|'E';
fragment F:	'f'|'F';
fragment G:	'g'|'G';
fragment H:	'h'|'H';
fragment I:	'i'|'I';
fragment J:	'j'|'J';
fragment K:	'k'|'K';
fragment L:	'l'|'L';
fragment M:	'm'|'M';
fragment N:	'n'|'N';
fragment O:	'o'|'O';
fragment P:	'p'|'P';
fragment Q:	'q'|'Q';
fragment R:	'r'|'R';
fragment S:	's'|'S';
fragment T:	't'|'T';
fragment U:	'u'|'U';
fragment V:	'v'|'V';
fragment W:	'w'|'W';
fragment X:	'x'|'X';
fragment Y:	'y'|'Y';
fragment Z:	'z'|'Z';

prog:	stm*;

stm:    ifstmt
      | Say 
      | assignstmt
        ;

    //     stm:    Say WORD                    # print
    //     | Loop NUMBER               # loop
    //     | NUMBER                    # number
    //     | ID                        # id
    //     | 
		// ;

Say:    S A Y;
Loop:   L O O P;

DATATYPE: NUMTYPE
        | STRTYPE
        ;
NUMTYPE:    N U M B E R;
STRTYPE:    S T R I N G;
ID:     I D;

NUMBER: [0-9]+'.'?[0-9]*;

IF: 'if';
ENDIF: 'endif';

PLUS: '+';
EQUAL: '==';
ASSIGN: 'is';
NOTEQUAL: '!=';

SEMICOLON: ';';

expression      : 
                term
              | term PLUS term 
                ;

term          : 
            identifier
            | NUMBER
              ;

identifier   : WORD  ;


ifstmt      : 
            IF WORD EQUAL NUMBER
            stm*
            ENDIF
            ;

assignstmt      : 
                DATATYPE WORD ASSIGN expression NL
                ;

WORD:   [a-z|A-Z]+;
WS:		[ \t\r]+ -> skip;

NL:     [\n];