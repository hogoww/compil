grammar  ExprArith;

expr : additionExpr ;

or : and ('or' and)*;

and: ene ( 'and' ene)*;

ene : ltgt ('=' ltgt | '!=' ltgt)*;

ltgt : additionExpr ('<' additionExpr | '<=' additionExpr | '>=' additionExpr | '>' additionExpr)*;

additionExpr : multiplyExpr
        ('+' multiplyExpr | '-' multiplyExpr)* ;

multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

atomExpr : Number | '(' additionExpr  ')' | '-' atomExpr | 'not ' atomExpr;

Number : ('0'..'9')+ ;

WS : [ \t\r\n]+ -> skip ;
