grammar placeholder;

prog:	stm*;
stm:	Init  NUMBER NUMBER				# init
        | Say                        # print
        | Loop NUMBER                     # loop
		;

fragment A:	'a'|'A';
fragment D:	'd'|'D';
fragment E:	'e'|'E';
fragment F:	'f'|'F';
fragment G:	'g'|'G';
fragment H:	'h'|'H';
fragment I:	'i'|'I';
fragment L:	'l'|'L';
fragment N:	'n'|'N';
fragment O:	'o'|'O';
fragment P:	'p'|'P';
fragment R:	'r'|'R';
fragment S:	's'|'S';
fragment T:	't'|'T';
fragment U:	'u'|'U';
fragment W:	'w'|'W';
fragment Y:	'y'|'Y';

Say:    S A Y;
Loop:   L O O P;
Init:   I N I T;

WORD:   [a-z|A-Z]+;
NUMBER: [0-9]+;

WS:		[ \t\r\n]+ -> skip;