lexer grammar Lex;

// Parser Rules

// Lexer Rules

KEYWORD : ('PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'READ'|'WRITE'|
'IF'|'ELSE'|'ENDIF'|'WHILE'|'ENDWHILE'|'CONTINUE'|'BREAK'|
'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT');

IDENTIFIER : ('_'|WORDS)('_'|WORDS|DIGITS)* ;

OPERATOR : ('=' | '+' |'-' | '*' | '/' | '=='| '!=' | '<' | '>' | '(' |')'| '<=' | '>='| ':=' | ';' | ',');

INTLITERAL : '-'?[0-9]+ ;

FLOATLITERAL :('-'?(DIGITS)*'.'DIGITS+)|('-'?(DIGITS)+'.'); 

STRINGLITERAL : '"' .*? '"' ;

DIGITS : [0-9] ;

WORDS : [a-zA-Z]+ ;

COMMENT : '--'~('\n')*'\n';

//OPERATOR : ('=' | '+' |'-' | '*' | '/' | '=='| '!=' | '<' | '>' | '(' |')'| '<=' | '>='| ':=' | ';' | ',');

WS: (' ' | '\t' | '\r'| '\n');

