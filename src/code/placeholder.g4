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

LITERAL: NUMBER
       | STRING
       | BOOL
       //| list
       | 'None'
       ;

NUMBER: [0-9]+'.'?[0-9]*;

fragment ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\ from antlr4 book


BOOL: 'True'|'False';

IF: 'if';
END: 'end';
ELSE : 'else';

BINOP: PLUS
     | MINUS
     | MULT
     | DIV
     | EQUAL
     | NOTEQUAL
     | LESSTHAN
     | GREATERTHAN
     | LESSTHANEQ
     | GREATERTHANEQ
     | AND
     | OR
     ;

UNIOPS: NOT
      | MINUS
      ;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQUAL: '=';
ASSIGN: 'is';
NOTEQUAL: '!=';
AND: A N D;
OR: O R;
NOT: N O T;


LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANEQ: '<=';
GREATERTHANEQ: '>=';

SEMICOLON: ';';
LCURL:  '{';
RCURL:  '}';


COMMENT: '#' ~[\r\n]* -> skip;

expression: term 
          | expression BINOP expression
          | UNIOPS expression
          ;

// boolexpression: term
//               | expression BOOLOP expression
//               ;

term: ID
    | LITERAL
    ;

ifstmt: 
      IF expression 
      LCURL 
      stm* 
      RCURL 
      (ELSE IF expression LCURL stm* RCURL)* 
      (ELSE LCURL stm* RCURL)?
      ;

assignstmt: (DATATYPE)? ID ASSIGN expression SEMICOLON;

loop: 'loop' term 'times'
      LCURL
      stm*
      RCURL
    ;

list: '[' term (',' term)* ']'
      | '[' ']'
      ;

ID: [a-z|A-Z]+;
WS: [ \t\r\n]+ -> skip;
//NL:     ';';
