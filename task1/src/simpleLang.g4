grammar simpleLang;

prog: dec+ EOF
    ;

dec: TYPE IDFR LParen vardec RParen body
    ;

vardec: (TYPE IDFR (Comma TYPE IDFR )* )?
    ;

body: LBrace (TYPE IDFR ':=' exp ';')* ene RBrace
    ;

block: LBrace ene RBrace
    ;

ene: exp (';' exp)*
    ;

exp: IDFR
    | INTLIT
    | BOOLIT
    | IDFR ':=' exp
    | LParen exp BINOP exp RParen
    | IDFR LParen args RParen
    | block
    | 'if' exp 'then' block ('else' block)?
    | 'while' exp 'do' block
    | 'repeat' block 'until' exp
    | 'print' exp
    | 'space'
    | 'newline'
    | 'skip'
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

BINOP: '==' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' | '/' | '&&' | '||' | '^';
TYPE: 'int' | 'bool' | 'unit' ;
IDFR: [_a-zA-Z][_a-zA-Z]*;
INTLIT: '0' | [1-9][0-9]*;
BOOLIT: 'TRUE' | 'FALSE';
WS : [ \n\r\t]+ -> skip ;