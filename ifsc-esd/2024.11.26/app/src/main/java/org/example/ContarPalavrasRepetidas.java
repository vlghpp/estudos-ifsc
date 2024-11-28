package org.example;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarPalavrasRepetidas {
    public static void main(String[] args) throws Exception {
        FileInputStream arq = new FileInputStream(args[0]);
        Scanner leitor = new Scanner(arq);
        HashMap<String, Integer> palavras = new HashMap<>();
        while (leitor.hasNextLine()) {
            String palavra = leitor.next();

            //Obtém o contador atual dessa palavra, ou 0 (zero) se for a primeira
            // vez em que ela aparece
            Integer contador = palavras.getOrDefault(palavra, 0);
            palavras.put(palavra, contador+1);
        }

        for(Map.Entry<String, Integer> matricula : palavras.entrySet()){
            System.out.println(matricula.getValue() + " " + matricula.getKey());
        }
    }

}
