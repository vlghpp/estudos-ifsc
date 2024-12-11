package ads.esd.exercicios_listasequencial;

import ads.esd.estruturas.ListaSequencial;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            lista.adiciona(numero);
        }

        for (int i = lista.comprimento()-1; i >= 0; i-- ){
            System.out.println(lista.obtem(i));
        }
    }
}
