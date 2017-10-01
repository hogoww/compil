grammar bf;

//entry rule
prog: program;

funcDef: id '(' (id ':' type)* ')' (':' type) declarVar? instruct;

program: declarVar? funcDef* instruct;

declarVar: 'var' ( id ':' type)+;
        
type returns [Type t] :'integer' {$t=new TypeInt();}
    | 'boolean' {$t=new TypeBool();}
    | 'array of' tempt = type {$t=new TypeArray($tempt.t);};

const returns [Cte $value]: n = NUMBER {$value = new CteInt(Integer.parseInt($n.text));}
    | c = 'true' {$value = new CteBool(Boolean.parseBool($c.text));}
    | c = 'false' {$value = new CteBool(Boolean.parseBool($c.text));} ;

funcName returns [FuncName name]:
        'read' {$name=new FuncName(new ID("read"));}
    |'write' {$name=new FuncName(new ID("write"));}
    | n = id {$name=new FuncName($n.name);};


id returns [ID i]: ide = IDENTIFICATEUR {$i=new ID($ide.text);};

expr returns [Expression e]: c = const {$e = $c;}
    | i = id {$e = $i;}
    | ela = exprLA {$e = $ela;} 
    | f = func {$e = $f;}
    | tab = accesTab {$e = $tab;}
    | 'new array of' t = type '[' exp = expr ']' {$e=new NewArrayOf($t,$exp);} ;

instruct:   (id | accesTab) ':=' expr (';' instruct)?
    | 'if' expr 'then' instruct (';' instruct)? 'else' instruct (';' instruct)?//ça ne dois pas etre des expressions ici.
    | 'while' expr 'do' instruct (';' instruct)?
    | 'skip' (';' instruct)?
    | func (';' instruct)?;

accesTab returns [AccesTab at]: (
            i = id {$at=new AccesTabID($i);}
        | f = func {$at=new AccesTabID($f);}
        ) '[' e = expr {$at.addExpr($e);} ']';

func returns [Func f]:
        n = funcName {$f=new Func($n);}
 '(' (expr {$f.AddArg(expr);})* ')';

exprLA  returns [ExprLA value] :
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
        e = const {$value=$e.value;}
    | i = id {$value = $i;}
    | f = func {$value = $f;}
    | a = accesTab {$value = $a;}
    | '(' e1 = or  ')' {$value = $e1.value;}
    | 'not' e2 = atomExpr {$value = new Inv($e2.value);}
    | '-' e2 = atomExpr {$value = new Inv($e2.value);} ;


IDENTIFICATEUR : (('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*) ;

NUMBER: ('0'..'9')+;


WS : [ \t\r\n]+ -> skip ;
