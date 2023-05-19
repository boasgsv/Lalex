lexer grammar LALexer;

fragment
LETRA: ('a'..'z') | ('A'..'Z');

fragment
DIGITO: ('0'..'9');

fragment
CARACTERE_ESPECIAL: ' ' | '(' | ')';

fragment
TEXTO: (LETRA | DIGITO | CARACTERE_ESPECIAL)*;

CADEIA: '"' .*? '"';

COMENTARIO: '{ ' .*? '}' { skip(); };

PALAVRAS_CHAVES: 'algoritmo' | 'fim_algoritmo' | 'declare' | 'tipo' 
                    | 'leia' | 'escreva' 
                    |'inteiro' | 'real' | 'logico' | 'literal' | 'var' | 'constante'
                    | 'e' | 'ou' | 'nao' 
                    | 'se' | 'entao' | 'senao' | 'fim_se' 
                    | 'caso' | 'fim_caso' | 'seja'
                    | 'para' | 'ate' | 'faca' | 'fim_para'
                    | 'enquanto' | 'fim_enquanto'
                    | 'registro' | 'fim_registro'
                    | 'procedimento' | 'fim_procedimento'
                    | '..'
                    | ':' | '(' | ')' | ',' | '/' 
                    | '+' | '-' | '*' | '%'
                    | '<=' | '>=' | '=' | '<' | '<>' | '>' | '^' | '&'
                    | '<-' 
                    | 'funcao' | 'retorne' | 'fim_funcao' 
                    | '[' | ']'
                    | 'falso' | 'verdadeiro'
                    | '.';

IDENT: LETRA (LETRA | DIGITO | '_')*;
NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;