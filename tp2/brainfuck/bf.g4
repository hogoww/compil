grammar bf;

//entry rule
prog: program;

funcDef: id '(' (id ':' type)* ')' (':' type) declarVar? instruct;

program: declarVar? funcDef* instruct;

declarVar: 'var' ( id ':' type)+;
        
type returns [Type e] :'integer' {$e=new TypeInt();}
    | 'boolean' {$e=new TypeBool();}
    | 'array of' tempt = type {$e=new TypeArray($type);};

constante returns [Cte value]: n = NUMBER {$value=new CteInt(Integer.parseInt($n.text));}
    | c = 'true' {$value=new CteBool(Boolean.parseBoolean($c.line);}
    | c = 'false' {$value=new CteBool(Boolean.parseBoolean($c.text));} ;

funcName returns [FuncName name]:
        'read' {$name=new FuncName(new ID("read"));}
    |'write' {$name=new FuncName(new ID("write"));}
    | i = id {$name=new FuncName($i.text);};


id returns [ID i]: ide = IDENTIFICATEUR {$i=new ID($ide.text);};

expre returns [Expression e]: c = constante {$e = $c.text;}
    | i = id {$e = $i.text;}
    | ela = exprLA {$e = $ela.text;} 
    | f = func {$e = $f.text;}
    | tab = accesTab {$e = $tab.text;}
    | 'new array of' t = type '[' exp = expre ']' {$e=new NewArrayOf($t.text,$exp.text);} ;

instruct:   (id | accesTab) ':=' expre (';' instruct)?
    | 'if' expre 'then' instruct (';' instruct)? 'else' instruct (';' instruct)?//ça ne dois pas etre des expressions ici.
    | 'while' expre 'do' instruct (';' instruct)?
    | 'skip' (';' instruct)?
    | func (';' instruct)?;

accesTab returns [AccesTab at]: (
            i = id {$at=new AccesTabID($i.text);}
        | f = func {$at=new AccesTabID($f.text);}
        ) '[' e = expre {$at.addExpr($e.text);} ']';

func returns [Func f]:
        n = funcName {$f=new Func($n.text);}
 '(' (expre {$f.AddArg(expre);})* ')';

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
