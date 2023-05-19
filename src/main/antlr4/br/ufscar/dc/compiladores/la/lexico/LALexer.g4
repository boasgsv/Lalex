lexer grammar LALexer;

fragment
LETRA: ('a'..'z');

fragment
DIGITO: ('0'..'9');

fragment
CARACTERE_ESPECIAL: ' ' | '(' | ')';

fragment
TEXTO: (LETRA | DIGITO | CARACTERE_ESPECIAL)*;


COMENTARIO: '{ ' .*? ' }' { skip(); };

PALAVRAS_CHAVES: 'algoritmo' | 'fim_algoritmo' | 'declare' | 'literal' | 'leia' | 'escreva' | 'inteiro';


IDENT: LETRA+;

