/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoverValoresRepetidos {

    public static void main(String[] args) throws Exception {
        FileInputStream arq = new FileInputStream(args[0]);
        Scanner leitor = new Scanner(arq);
        HashMap<String, Integer> matriculas = new HashMap<>();
        int contador = 0;
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            if(!matriculas.containsKey(linha)){
                matriculas.put(linha, contador);
            }
            contador++;
        }

        //forma de ordenar

        ArrayList<String> matriculasSo = new ArrayList<>();
        matriculasSo.addAll(matriculas.keySet());
        matriculasSo.sort(String::compareTo);

        for(String matricula : matriculasSo){
            System.out.println("Matricula: " + matricula);
        }
    }


}