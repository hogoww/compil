grammar bf;

//entry rule
prog: I;

K: N
    | 'true' 
    | 'false';

N: ('0'..'9')+;
        
T:'integer'
    | 'boolean'
    | 'array of' T;


F:'read'
    |'write'
    | ID;

ID: ('a'..'z'|'A'..'Z'|'_')+ ;

UOP: '-'
    | 'not ';

BOP: '+' | '-' | '*' | '/'
    | ' and ' | ' or '
    | '<' | '<=' | '=' | '!=' | '>=' | '>';

E: K 
    | '(' E ')'
    | ID
    | UOP E
    //| E BOP E
    | F '(' E* ')'
    //| E '[' E ']'
    | 'new array of' T '[' E ']';

I: 'var ' ID ' : ' T 
    | ID ':=' E
    | E '[' E ']:=' E
    | 'if ' E ' then ' E ' else ' E
    | 'while ' E ' do'
    | F '(' E* ')'
    | 'skip';
    //| I ';' I ;

WS : [ \t\r\n]+ -> skip;

