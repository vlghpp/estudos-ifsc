package ads.esd.exercicios_listasequencial;

import ads.esd.estruturas.ListaSequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            lista.adiciona(numero);
        }

        System.out.print("Qual número você quer verificar? ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        if(lista.procura(numero) >=0){
            System.out.println("Pertence sim, está na posição " + lista.procura(numero));
        }else{
            System.out.println("Não pertence!");
        }
    }
}
