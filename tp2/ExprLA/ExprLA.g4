grammar ExprLA;


expr  returns [ExprLA value] :
        e = or {$value = $e.value;} ;

or returns [ExprLA value]: e = and {$value = $e.value;}
        ('or' e2 = and {$value = new Or($value,$e2.value);})*;

and returns [ExprLA value]: e = ene {$value=$e.value;}
        ( 'and' e2 = ene {$value = new And($value,$e2.value);})*;

//Equal not equal
ene returns [ExprLA value]: e = ltgt {$value=$e.value;}
        (
            '=' e2 = ltgt {$value = new Equals($value,$e2.value);}
        | '!=' e2 = ltgt {$value = new NotEquals($value,$e2.value);}
        )*;

//lower than greater than
ltgt returns [ExprLA value] : e1 = additionExpr {$value=$e1.value;}
        (
            '<' e2 = additionExpr {$value = new LesserThan($value,$e2.value);}
        | '<=' e2 = additionExpr {$value = new LesserEqualThan($value,$e2.value);}
        | '>=' e2 = additionExpr {$value = new GreaterEqualThan($value,$e2.value);}
        | '>' e2 = additionExpr {$value = new GreaterThan($value,$e2.value);}
        )*;

additionExpr  returns [ExprLA value] :
        e1 = multiplyExpr {$value = $e1.value;}
        ('+' e2 = multiplyExpr
            {$value = new Add($value,$e2.value);}
        | '-' e2 = multiplyExpr
            {$value = new Sub($value,$e2.value);})* ;

multiplyExpr  returns [ExprLA value] :
        e1 = atomExpr {$value = $e1.value;}
        ('*' e2 = atomExpr {$value = new Mul($value,  $e2.value);}
        | '/' e2 = atomExpr
            {$value = new Div($value,  $e2.value);})* ;

atomExpr  returns [ExprLA value] :
        c = Number {$value = new Cte(Integer.parseInt($c.text));}
    | '(' e1 = or  ')' {$value = $e1.value;}
    | 'not' e2 = atomExpr {$value = new Inv($e2.value);}
    | '-' e3 = atomExpr {$value = new Inv($e3.value);} ;

Number : ('0'..'9')+ ;

WS : [ \t\r\n]+ -> skip ;

