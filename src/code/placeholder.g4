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
    | say SEMICOLON
    | assignstmt SEMICOLON
    | loop
    | proc_def
    | proc_invoke SEMICOLON
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

COMPOP: EQUAL
      | NOTEQUAL
      | LESSTHAN
      | GREATERTHAN
      | LESSTHANEQ
      | GREATERTHANEQ
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
say: 'say' STRING ;

expression: expression op=EXPONENT expression      # Exponent
          | expression op=(MULT|DIV) expression    # MultDiv
          | expression op=(PLUS|MINUS) expression  # PlusMinus
          | op=MINUS expression                    # Minus
          | op=NOT expression                      # Not
          | expression op=AND expression           # And
          | expression op=OR expression            # Or
          | term                                   # Terms
          | '(' expression ')'                     # parens
          | expression op=COMPOP expression        # CompOp
          ;

list: '[' term (',' term)* ']'
      | '[' ']'
      ;

term: ID     # id
    | NUMBER # number
    | STRING # string
    | BOOL   # bool
    | list   # array
    | 'None' # none
    ;

ifstmt: 
      IF expression 
      LCURL 
      stm* 
      RCURL 
      (ELSE IF expression LCURL stm* RCURL)* 
      (ELSE LCURL stm* RCURL)?
      ;

assignstmt: (DATATYPE)? ID ASSIGN expression ;

loop: 'loop' (ID | NUMBER) 'times'
      LCURL
      stm*
      RCURL
      ;

//procedure definitions
proc_def : 'on' ID '(' arg (',' arg)* ')' LCURL stm* RCURL;
proc_invoke: ID '(' term (',' term)* ')' ;

arg: DATATYPE ID;

ID: [a-z|A-Z]+;
WS: [ \t\r\n]+ -> skip;
//NL:     ';';
