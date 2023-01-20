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

stm:  ifstmt
    | say 
    | assignstmt
    | loop
    ;

    //     stm:    Say WORD                    # print
    //     | Loop NUMBER               # loop
    //     | NUMBER                    # number
    //     | ID                        # id
    //     | 
		// ;

say: 'say' STRING;

DATATYPE: NUMTYPE
        | STRTYPE
        | BOOLTYPE
        ;

NUMTYPE:    N U M B E R;
STRTYPE:    S T R I N G;
BOOLTYPE:   B O O L;

STRING: '"' (ESC|.)*? '"' ;

fragment ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\ from antlr4 book

NUMBER: [0-9]+'.'?[0-9]*;

BOOL: 'True'|'False';

IF: 'if';
END: 'end';

OP: PLUS
  | MINUS
  | MULT
  | DIV
  ;

BOOLOP: EQUAL
      | NOTEQUAL
      | LESSTHAN
      | GREATERTHAN
      | LESSTHANEQ
      | GREATERTHANEQ
      ;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQUAL: '=';
ASSIGN: 'is';
NOTEQUAL: '!=';


LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANEQ: '<=';
GREATERTHANEQ: '>=';

SEMICOLON: ';';
LCURL:  '{';
RCURL:  '}';

expression: term 
        | expression OP expression
        ;

boolexpression: term
              | expression BOOLOP expression
              ;

term: ID
    | NUMBER
    | STRING
    | BOOL
    ;

ifstmt: 
      IF boolexpression
      LCURL
      stm*
      RCURL
      ;

assignstmt: 
            DATATYPE ID ASSIGN expression SEMICOLON
            ;

loop: 'loop' NUMBER 'times'
      LCURL
      stm*
      RCURL
    ;

ID:   [a-z|A-Z]+;
WS:		[ \t\r\n]+ -> skip;
//NL:     ';';
