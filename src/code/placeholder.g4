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
    | proc_def
    ;

//datatypes

DATATYPE: NUMTYPE
        | STRTYPE
        | BOOLTYPE
        | LISTTYPE
        ;

NUMTYPE:    N U M B E R;
STRTYPE:    S T R I N G;
BOOLTYPE:   B O O L;
LISTTYPE:   L I S T;

STRING: '"' (ESC|.)*? '"' ;

NUMBER: [0-9]+'.'?[0-9]*;

fragment ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\ from antlr4 book


BOOL: 'True'|'False';

// conditionals
IF: 'if';
END: 'end';
ELSE : 'else';

// binary operators - 2 arguments
// BINOP: EXPONENT
//      | MULT
//      | DIV
//      | PLUS
//      | MINUS
//      | AND
//      | OR
//      | EQUAL
//      | NOTEQUAL
//      | LESSTHAN
//      | GREATERTHAN
//      | LESSTHANEQ
//      | GREATERTHANEQ
//      ;

COMPOP: EQUAL
      | NOTEQUAL
      | LESSTHAN
      | GREATERTHAN
      | LESSTHANEQ
      | GREATERTHANEQ
      ;

//unary operators - 1 argument
UNIOPS: NOT
      | MINUS
      ;

// operator definitions
EXPONENT: '^';
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
LBRAC:  '(';
RBRAC:  ')';


COMMENT: '#' ~[\r\n]* -> skip;


//commands
say: 'say' STRING SEMICOLON;

expression: expression binop=EXPONENT expression   
          | expression binop=(MULT|DIV) expression   
          | expression binop=(PLUS|MINUS) expression 
          | uniop=MINUS expression                 
          | uniop=NOT expression                   
          | expression binop=AND expression        
          | expression binop=OR expression         
          | term                                   
          | '(' expression ')'                     
          | expression binop=COMPOP expression     
          ;

list: '[' term (',' term)* ']'
      | '[' ']'
      ;

term: ID
    | NUMBER
    | STRING
    | BOOL
    | list
    | 'None'
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

loop: 'loop' (ID | NUMBER) 'times'
      LCURL
      stm*
      RCURL
      ;

//procedure definitions
proc_def : 'on' ID '(' arg (',' arg)* ')' LCURL stm* RCURL;

arg: DATATYPE ID;

ID: [a-z|A-Z]+;
WS: [ \t\r\n]+ -> skip;
//NL:     ';';
