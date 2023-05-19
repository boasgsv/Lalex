package br.ufscar.dc.compiladores.la.lexico;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.FileWriter;

import java.io.IOException;

public class Principal {

    public static void main(String [] args){
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            LALexer lex = new LALexer(cs);
            Token t = null;


            String filename = "output.txt";
            FileWriter writer = new FileWriter(filename);
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                writer.write("<" + LALexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">\n");

            }
            writer.close();
        } catch (IOException ex) {
        }
    }
}
