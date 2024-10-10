package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//TODO NÃO COMPLETO, PRECISA TERMINAR

public class ContadorPalavrasRepetidas {
    public static ArrayList<String> le(String pathname) {
        ArrayList<String> linhas = new ArrayList();
        try {
            File entrada = new File(pathname);
            Scanner linha = new Scanner(entrada);
            int contadorPalavras = 0;
            ArrayList<String[]> palavras = new ArrayList();
            ArrayList<String> registroPalavra = new ArrayList();
            while (linha.hasNext()) {
                palavras.add(linha.nextLine().split(" "));
            }

            for (int i = 0; i < palavras.size(); i++) {

                for(String[] palavra : palavras) {
                    if (palavras.contains(palavra[i])) {
                        contadorPalavras++;
                    }
                    registroPalavra.add(palavra[i]+ " APARECEU: " + contadorPalavras);
                }

            }

            linha.close();
         return registroPalavra;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return linhas;
    }

    public static void main(String[] args) {
        ArrayList<String> linhas = le("palavras.txt");

        for(String linha : linhas) {
            System.out.println(linha);
        }

    }
}
