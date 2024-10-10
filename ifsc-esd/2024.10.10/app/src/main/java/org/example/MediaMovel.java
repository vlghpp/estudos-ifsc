package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MediaMovel {

    public static ArrayList<ArrayList<String>> le(String pathname) {
        ArrayList<ArrayList<String>> linhas = new ArrayList<ArrayList<String>>(0);
        try {
            File entrada = new File(pathname);
            Scanner linha = new Scanner(entrada);

            while (linha.hasNext()) {
                String[] registro = linha.nextLine().split(",");

                ArrayList<String> list = new ArrayList<>(Arrays.asList(registro));
                linhas.add(list);
            }

            linha.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return linhas;
    }
    public static void main(String[] args) {
        Deque deque = new Deque();

    }
}
