grammar bf;


//entry rule
prog: program;

funcDef: funcName '(' (ID ':' type)* ')' (':' type) ('var'( ID ':' type)+ )? instruct;

program: ('var' ( ID ':' type)+)? funcDef* instruct;

CONST: NUMBER
    | 'true' 
    | 'false';

NUMBER: ('0'..'9')+;
        
type:'integer'
    | 'boolean'
    | 'array of' type;


funcName:'read'
    |'write'
    | ID;

ID: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;

expr: CONST
    | ID
    | exprLA 
    | func
    | accesTab
    | 'new array of' type '[' expr ']';

instruct:   (ID | accesTab) ':=' expr (';' instruct)?
    | 'if' expr 'then' instruct (';' instruct)? 'else' instruct (';' instruct)?//ça ne dois pas etre des expressions ici.
    | 'while' expr 'do' instruct (';' instruct)?
    | 'skip' (';' instruct)?
    | funcName '(' expr* ')' (';' instruct)?;

exprLA : or ;

or : and ('or' and)*;

and: ene ( 'and' ene)*;

//Equal not equal
ene : ltgt ('=' ltgt | '!=' ltgt)*;

//lower than greater than
ltgt : additionExpr ('<' additionExpr | '<=' additionExpr | '>=' additionExpr | '>' additionExpr)*;

additionExpr : multiplyExpr
        ('+' multiplyExpr | '-' multiplyExpr)* ;

multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

func: funcName '(' expr* ')';

atomExpr : CONST | ID | func | accesTab | '(' or ')' | '-' atomExpr | 'not ' atomExpr;

accesTab: (ID | func) '[' expr ']';

WS : [ \t\r\n]+ -> skip;
