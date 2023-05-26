lexer grammar LALexer;

// Fragmentos utilizados para ajudar nas regras léxicas
fragment
LETRA: ('a'..'z') | ('A'..'Z');

fragment
DIGITO: ('0'..'9');

fragment
CARACTERE_ESPECIAL: ' ' | '(' | ')';

fragment
TEXTO: (LETRA | DIGITO | CARACTERE_ESPECIAL)*;

/* Gramática usada para detectar cadeias
A lógica da expressão regular espera receber um caractere que abre uma cadeia
e esperar receber qualquer ou nenhum caractere em seguida, exceto um quebra linha ou 
um caractere que fecha uma cadeia. 
Logo em seguida, por último, deve ter um caractere para fechar a cadeia */
CADEIA: '"' ~('\n'|'"')* '"';

NOVA_LINHA: '\n' { skip(); };

ESPACO_EM_BRANCO: ' ' { skip(); };

TAB: '\t' { skip(); };

/* Gramática usada para detectar comentários
A lógica da expressão regular espera receber um caractere que abre um comentario
e esperar receber qualquer ou nenhum caractere em seguida, exceto um quebra linha ou 
um caractere que fecha o comentario (ou cadeia). 
Logo em seguida, por último, deve ter um caractere para fechar o comentário */
COMENTARIO: '{ ' ~('\n'|'}')* '}' { skip(); };

// Palavras chaves detectadas na linguagem
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

/* Gramática usada para detectar comentários e cadeias não fechada
A lógica da expressão regular espera receber um caractere que abre um comentario (ou cadeia)
e esperar receber qualquer ou nenhum caractere em seguida, exceto um quebra linha ou 
um caractere que fecha o comentario (ou cadeia). 
Logo em seguida, é esperado uma quebra de linha */

COMENTARIO_NAO_FECHADO: '{' ~('\n'|'}')* '\n';
CADEIA_NAO_FECHADA: '"' ~('\n'|'"')* '\n';

// Simbolos não reconhecidos na linguagem
ERRO: '~' | '$' | '}';
