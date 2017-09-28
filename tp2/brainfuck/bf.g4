grammar bf;





//entry rule
prog: i;





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
    | f '(' e* ')'
    //| e '[' e ']'
    | 'skip' //On a passé le skip dans les expressions, sinon ceci n'est pas possible dans les pending else. à voir..
        //Une expression peut renvoyer un résultat, pas obligatoire -> void
    | 'new array of' t '[' e ']';

i:   ID ':=' e
    | e '[' e ']:=' e
    | 'if ' e ' then ' e ' else ' e
    | 'while ' e ' do'
    | f '(' e* ')';
//| i ';' i ;

exprLA : or;

or : and (' or ' and)*;

and: ene ( ' and ' ene)*;

ene : ltgt ('=' ltgt | '!=' ltgt)*;

ltgt : additionExpr ('<' additionExpr | '<=' additionExpr | '>=' additionExpr | '>' additionExpr)*;

additionExpr : multiplyExpr
        ('+' multiplyExpr | '-' multiplyExpr)* ;

multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

atomExpr : e '(' e ')' | '-' atomExpr | 'not ' atomExpr;
//e est passé forcé entre parenthese, obligé pour que ça marche


WS : [ \t\r\n]+ -> skip;

