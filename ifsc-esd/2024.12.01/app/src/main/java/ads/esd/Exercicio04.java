package ads.esd;

import ads.esd.estruturas.ListaSequencial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try {
            FileInputStream arquivoA = new FileInputStream("exercicio04-A.txt");
            Scanner scannerA = new Scanner(arquivoA);
            FileInputStream arquivoB = new FileInputStream("exercicio04-B.txt");
            Scanner scannerB = new Scanner(arquivoB);

            ListaSequencial palavrasA = new ListaSequencial();
            ListaSequencial palavrasB = new ListaSequencial();

            while (scannerA.hasNext()) {
                String[] registroA = scannerA.nextLine().split(",");
                for (String palavra : registroA) {
                    palavrasA.adiciona(palavra.trim());
                }
            }

            while (scannerB.hasNext()) {
                String[] registroB = scannerB.nextLine().split(",");
                for (String palavra : registroB) {
                    palavrasB.adiciona(palavra.trim());
                }
            }

            boolean encontrou = false;

            for (int i = 0; i < palavrasA.comprimento(); i++) {
                String palavra = (String) palavrasA.obtem(i);
                for (int j = 0; j < palavrasB.comprimento(); j++) {
                    encontrou = true;
                }
                if(!encontrou) break;
            }

            if (encontrou) {
                System.out.println("VERDADEIRO");
            } else {
                System.out.println("FALSO");
            }

        } catch (FileNotFoundException e) {
            System.out.println("ARQUIVO INVÁLIDO");
        }
    }
}
