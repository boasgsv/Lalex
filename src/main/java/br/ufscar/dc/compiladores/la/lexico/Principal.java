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

            String filename = args[1];
            FileWriter writer = new FileWriter(filename);
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String displayName = LALexer.VOCABULARY.getDisplayName(t.getType());
                if (displayName.equals("ERRO")){
                    writer.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado\n");
                    break;
                }
                else if (displayName.equals("COMENTARIO_NAO_FECHADO")){
                    writer.write("Linha " + t.getLine() + ": comentario nao fechado\n");
                    break;
                }
                else if (displayName.equals("CADEIA_NAO_FECHADA")){
                    writer.write("Linha " + t.getLine() + ": cadeia literal nao fechada\n");
                    break;
                }
                else if (displayName != "PALAVRAS_CHAVES")
                    writer.write("<'" + t.getText() + "'," + displayName + ">\n");
                else
                    writer.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
            }
            writer.close();
        } catch (IOException ex) {
        }
    }
}
