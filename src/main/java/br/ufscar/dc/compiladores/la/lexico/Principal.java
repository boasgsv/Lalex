package br.ufscar.dc.compiladores.la.lexico;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.nio.charset.StandardCharsets;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {

    public static void main(String [] args){
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0], StandardCharsets.UTF_8);
            LALexer lex = new LALexer(cs);
            Token t = null;

            // Leitura do segundo argumento para escrever em um arquivo de saída
            String filename = args[1];
            FileWriter writer = new FileWriter(filename);

            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String displayName = LALexer.VOCABULARY.getDisplayName(t.getType());

                // Condicional para exibir erros de caracteres não aceito pela linguagem
                if (displayName.equals("ERRO")){
                    writer.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                    break;
                }

                // Condicional para exibir erros de comentários não fechado na mesma linha
                else if (displayName.equals("COMENTARIO_NAO_FECHADO")){
                    writer.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                    break;
                }

                // Condicional para exibir erros de caracteres não fechado
                else if (displayName.equals("CADEIA_NAO_FECHADA")){
                    writer.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                    break;
                }
                
                else if (displayName != "PALAVRAS_CHAVES")
                    writer.write("<'" + t.getText() + "'," + displayName + ">\n");

                // Condicional para exibir tokens de palavra-chave
                else
                    writer.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
            }

            // Fechamento do arquivo de saída
            writer.close();
        } catch (IOException ex) {
        }
    }
}
