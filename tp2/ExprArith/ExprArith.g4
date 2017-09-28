grammar  ExprArith;

expr : additionExpr ;

additionExpr : multiplyExpr
        ('+' multiplyExpr | '-' multiplyExpr)* ;

multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

atomExpr : Number | Boolean | '(' or ')' | '-' atomExpr;

Number : ('0'..'9')+ ;

WS : [ \t\r\n]+ -> skip ;
