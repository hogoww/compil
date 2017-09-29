grammar bf;





//entry rule
prog: p;

d: f '(' (ID ':' t)* ')' (':' t) '\n' ('var'(' ' ID ':' t)+ '\n')? i;

p: ('var' (' ' ID ':' t)+ '\n')? d* i;

K: N
    | 'true' 
    | 'false';

N: ('0'..'9')+;
        
t:'integer'
    | 'boolean'
    | 'array of' t;


f:'read'
    |'write'
    | ID;

ID: ('a'..'z'|'A'..'Z'|'_')+ ;

e: K
    | ID
    | exprLA 
    | func
    | accesTab
    | 'new array of' t '[' e ']';

i:   (ID | accesTab) ':=' e (';' i)?
    | 'if ' e ' then ' i (';' i)? ' else ' i (';' i)?//ça ne dois pas etre des expressions ici.
    | 'while ' e ' do' i (';' i)?
    | 'skip' (';' i)?
    | f '(' e* ')' (';' i)?;

exprLA : or;

or : and (' or ' and)*;

and: ene ( ' and ' ene)*;

ene : ltgt ('=' ltgt | '!=' ltgt)*;

ltgt : additionExpr ('<' additionExpr | '<=' additionExpr | '>=' additionExpr | '>' additionExpr)*;

additionExpr : multiplyExpr
        ('+' multiplyExpr | '-' multiplyExpr)* ;

multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

func: f '(' e* ')';

atomExpr : K | ID | func | accesTab | '(' or')' | '-' atomExpr | 'not ' atomExpr;

accesTab: (ID | func) '[' e ']';

WS : [ \t\r\n]+ -> skip;

