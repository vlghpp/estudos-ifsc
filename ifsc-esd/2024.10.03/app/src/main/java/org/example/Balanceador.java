
package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Balanceador {
    public static void main(String[] args) {
        Pilha tokens = le("arquivo.txt");

        for (int i = 0; i < tokens.comprimento(); i++) {
            String caracter =(String) tokens.desempilha();
            switch (caracter){
                case "{" -> tokens.empilha("{");
                case "}" -> tokens.empilha("}");
                case "[" -> tokens.empilha("[");
                case "]" -> tokens.empilha("]");
                case "(" -> tokens.empilha("(");
                case ")" -> tokens.empilha(")");
            }
            tokens.empilha(caracter);
        }
    }

    public static Pilha le(String pathname) {
        Pilha tokens = new Pilha();
        int c = 0;
        try {
            File entrada = new File(pathname);
            Scanner linha = new Scanner(entrada);

            while (linha.hasNext()) {
                String[] registro = linha.nextLine().split("");
                switch (registro[c]){
                    case "{" -> tokens.empilha("{");
                    case "}" -> tokens.empilha("}");
                    case "[" -> tokens.empilha("[");
                    case "]" -> tokens.empilha("]");
                    case "(" -> tokens.empilha("(");
                    case ")" -> tokens.empilha(")");
                }

            }

            linha.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return tokens;
    }
}
