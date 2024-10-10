package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalavrasRepetidas {
    public static ArrayList<String> le(String pathname) {
        ArrayList<String> linhas = new ArrayList();
        try {
            File entrada = new File(pathname);
            Scanner linha = new Scanner(entrada);
            while (linha.hasNext()) {
                String[] registros = linha.nextLine().split(" ");
                for(String registro : registros) {
                    if(!linhas.contains(registro)) {
                        linhas.add(registro);
                    }
                }
            }

            linha.close();
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
