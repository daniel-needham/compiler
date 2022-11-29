grammar simpleLang;

prog: dec+ EOF
    ;

dec: TYPE IDFR LParen vardec RParen body
    ;

vardec: (TYPE IDFR (Comma TYPE IDFR )* )?
    ;

body: LBrace (TYPE IDFR ':=' exp Semicolon)* ene RBrace
    ;

block: LBrace ene RBrace
    ;

ene: exp (Semicolon exp)*
    ;

exp: IDFR #IDFREXP
    | INTLIT #INTEXP
    | BOOLIT #BOOLEXP
    | IDFR ':=' exp #ASSIGNEXP
    | LParen exp BINOP exp RParen #BINOPEXP
    | IDFR LParen args RParen #FUNCEXP
    | block #BLOCKEXP
    | 'if' exp 'then' block ('else' block)? #IFEXP
    | 'while' exp 'do' block #WHILEEXP
    | 'repeat' block 'until' exp #REPEATEXP
    | 'print' exp #PRINTEXP
    | 'space' #SPACEEXP
    | 'newline' #NEWLINEXP
    | 'skip' #SKIPEXP
    ;

args: (exp (Comma exp)*)?
;

LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon : ';' ;
RBrace : '}' ;

/*Plus : '+';
Minis : '-';
Mult : '*';
Divide : '/' ;*/

BINOP: '=='
    | '<'
    | '>'
    | '<='
    | '>='
    | '&'
    | '|'
    | '^'
    | '+'
    | '-'
    | '*'
    | '/'
    ;

TYPE: 'int' | 'bool' | 'unit' ;
INTLIT: '0' | [1-9][0-9]*;
BOOLIT: 'TRUE' | 'FALSE';
IDFR: [_a-zA-Z][_a-zA-Z0-9]*;
WS : [ \n\r\t]+ -> skip ;