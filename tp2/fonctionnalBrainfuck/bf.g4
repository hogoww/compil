grammar bf;
//Théo Rogliano
//Pierre Misse Chanabier
//Olivier Montes

//entry rule
program returns [Program value] @init{ $value=new Program();} :
        ('var' (dv = declarationVar {$value.addVar($dv.value);})+)?
        (f = funcDef {$value.addFunc($f.value);})* 
        i = instruct {$value.addInstruct($i.value);};

funcDef returns [FuncDef value]: 
        i = id {$value=new FuncDef($i.value);}
        '(' (d = declarationVar {$value.addArg($d.value);} )* ')' 
        (':' t = type {$value.addType($t.value);}) 
        ('var' (dv = declarationVar {$value.addVar($dv.value);})+)?
        in = instruct {$value.addInstruct($in.value);};

declarationVar returns [DeclarationVar value]: i = id ':' t = type {$value = new DeclarationVar($i.value,$t.value);};

type returns [Type value] :'integer' {$value=new TypeInt();}
    | 'boolean' {$value=new TypeBool();}
    | 'array of' tempt = type {$value=new TypeArray($tempt.value);};

constante returns [Cte value]: n = NUMBER {$value=new CteInt(Integer.parseInt($n.text));}
    | c = 'true' {$value=new CteBool(Boolean.parseBoolean($c.text));}
    | c = 'false' {$value=new CteBool(Boolean.parseBoolean($c.text));};

funcName returns [FuncName value]:
        'read' {$value=new FuncName(new ID("read"));}
    |'write' {$value=new FuncName(new ID("write"));}
    | i = id {$value=new FuncName($i.value);};


id returns [ID value]: ide = IDENTIFICATEUR {$value=new ID($ide.text);};

expre returns [Expression value]: c = constante {$value = $c.value;}
    | i = id {$value = $i.value;}
    | ela = exprLA {$value = $ela.value;} 
    | f = func {$value = $f.value;}
    | tab = accesTab {$value = $tab.value;}
    | 'new array of' t = type '[' exp = expre ']' {$value=new NewArrayOf($t.value,$exp.value);} ;

instruct returns [Instruction value]:
        (
            i = id ':=' e1 = expre {$value=new AffectationVar($i.value,$e1.value);}
            | at = accesTab ':=' e1 = expre {$value=new AffectationTab($at.value,$e1.value);}
        | 'if' ex = expre 
            'then' i1 = instruct 
            'else' i2 = instruct  {$value=new If($ex.value,$i1.value,$i2.value);}
        | 'while' ex = expre 'do' in = instruct {$value=new While($ex.value,$in.value);}
        |'skip' {$value=new Skip();}
        | p = procedure {$value=$p.value;} 
        )(';' in = instruct {$value.addInstruction($in.value);})? ;

accesTab returns [AccesTab value]:
        ( i = id {$value=new AccesTabID($i.value);}
        | f= func {$value=new AccesTabFunc($f.value);}
        ) '[' e2 = expre {$value.addExpression($e2.value);} ']';

func returns [Func value]:
        n = funcName {$value=new Func($n.value);}
        '(' (e = expre {$value.addArg($e.value);})* ')';

procedure returns [Procedure value]:
        n = funcName {$value=new Procedure($n.value);}
        '(' (e = expre {$value.addArg($e.value);})* ')';


exprLA returns [Expression value] :
        e = or {$value = $e.value;} ;

or returns [Expression value]: e = and {$value=$e.value;}
        ('or' e2 = and {$value = new Or($value,$e2.value);})*;

and returns [Expression value]: e = ene {$value=$e.value;}
        ( 'and' e2 = ene {$value = new And($value,$e2.value);})*;

//Equal not equal
ene returns [Expression value]: e = ltgt {$value=$e.value;}
        (
            '=' e2 = ltgt {$value = new Equals($value,$e2.value);}
        | '!=' e2 = ltgt {$value = new NotEquals($value,$e2.value);}
        )*;

//lower than greater than
ltgt returns [Expression value] : e1 = additionExpr {$value=$e1.value;}
        (
            '<' e2 = additionExpr {$value = new LesserThan($value,$e2.value);}
        | '<=' e2 = additionExpr {$value = new LesserEqualThan($value,$e2.value);}
        | '>=' e2 = additionExpr {$value = new GreaterEqualThan($value,$e2.value);}
        | '>' e2 = additionExpr {$value = new GreaterThan($value,$e2.value);}
        )*;

additionExpr  returns [Expression value]:
        e1 = multiplyExpr {$value = $e1.value;}
        ('+' e2 = multiplyExpr
            {$value = new Add($value,$e2.value);}
        | '-' e2 = multiplyExpr
            {$value = new Sub($value,$e2.value);})* ;

multiplyExpr  returns [Expression value]:
        e1 = atomExpr {$value = $e1.value;}
        ('*' e2 = atomExpr {$value = new Mul($value,  $e2.value);}
        | '/' e2 = atomExpr
            {$value = new Div($value,  $e2.value);})* ;

atomExpr  returns [Expression value]:
        e = constante {$value=$e.value;}
    | i = id {$value = $i.value;}
    | f = func {$value = $f.value;}
    | a = accesTab {$value = $a.value;}
    | '(' e1 = or  ')' {$value = $e1.value;}
    | 'not' e2 = atomExpr {$value = new Not($e2.value);}
    | '-' e2 = atomExpr {$value = new Inv($e2.value);} ;


IDENTIFICATEUR : (('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*) ;

NUMBER: ('0'..'9')+;


WS : [ \t\r\n]+ -> skip ;
