grammar Cmm;

program:
       ;

ONE_LINE_COMMENT : '//' ~('\n')* -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

CHAR_CONSTANT
    : '\'' ( ESCAPE_SEQUENCE | ~('\'' | '\\') ) '\''
    ;
fragment ESCAPE_SEQUENCE
    : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\')
    | '\\' [0-7] [0-7]? [0-7]?
    ;

REAL_CONSTANT
    : [0-9]+ '.' [0-9]* EXPONENT?
    | '.' [0-9]+ EXPONENT?
    | [0-9]+ EXPONENT
    ;
fragment EXPONENT
    : [eE] [+-]? [0-9]+
    ;

INT_CONSTANT: [1-9] [0-9]+
            | '0'
            ;
