grammar bf;

//entry rule
prog: program;

funcDef: id '(' declarationVar* ')' (':' type) declarVar? instruct;

program: declarVar? funcDef* instruct;

declarVar: 'var' declarationVar +;

declarationVar: id ':' type;
        
type returns [Type value] :'integer' {$value=new TypeInt();}
    | 'boolean' {$value=new TypeBool();}
    | 'array of' tempt = type {$value=new TypeArray($tempt);};

constante returns [Cte value]: n = NUMBER {$value=new CteInt(Integer.parseInt($n.text));}
    | c = 'true' {$value=new CteBool(Boolean.parseBoolean($c.text);}
    | c = 'false' {$value=new CteBool(Boolean.parseBoolean($c.text));} ;

funcName returns [FuncName value]:
        'read' {$value=new FuncName(new ID("read"));}
    |'write' {$value=new FuncName(new ID("write"));}
    | i = id {$value=new FuncName($i.value);};


id returns [ID value]: ide = IDENTIFICATEUR {$value=new ID($ide.text);};

expre returns [Expression e]: c = constante {$e = $c.value;}
    | i = id {$e = $i;}
    | ela = exprLA {$e = $ela.text;} 
    | f = func {$e = $f.text;}
    | tab = accesTab {$e = $tab.text;}
    | 'new array of' t = type '[' exp = expre ']' {$e=new NewArrayOf($t.text,$exp.text);} ;

instruct  returns [Instruction value]:   (id | accesTab) ':=' expre (';' instruct)?
    | 'if' expre 'then' instruct (';' instruct)? 'else' instruct (';' instruct)?//ça ne dois pas etre des expressions ici.
    | 'while' expre 'do' instruct (';' instruct)?
    | 'skip' (';' instruct)?
    | func (';' instruct)?;

accesTab returns [AccesTab value]: (//A refaire.
            i = id {$value=new AccesTabID($i.text);}
        | f = func {$value=new AccesTabID($f.text);}
        ) '[' e = expre {$at.addExpr($e.text);} ']';

func returns [Func value]://A refaire
        n = funcName {$value=new Func($n);}
 '(' (expre {})* ')';

exprLA  returns [ExprLA value] :
        e = or {$value = $e.value;} ;

or returns [ExprLA value]: e = and {$value=$e.value;}
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
        e = constante {$value=$e.value;}
    | i = id {$value = $i.text;}
    | f = func {$value = $f.text;}
    | a = accesTab {$value = $a.text;}
    | '(' e1 = or  ')' {$value = $e1.value;}
    | 'not' e2 = atomExpr {$value = new Inv($e2.value);}
    | '-' e2 = atomExpr {$value = new Inv($e2.value);} ;


IDENTIFICATEUR : (('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*) ;

NUMBER: ('0'..'9')+;


WS : [ \t\r\n]+ -> skip ;
