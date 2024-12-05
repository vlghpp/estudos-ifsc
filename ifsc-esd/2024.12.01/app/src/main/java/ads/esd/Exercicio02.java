package ads.esd;

import ads.esd.estruturas.ListaSequencial;

public class Exercicio02 {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println("Lista original:");
        for (int i = 0; i < lista.comprimento(); i++) {
            System.out.print(lista.obtem(i));
        }
        System.out.println();

        lista.embaralha();

        System.out.println("Lista embaralhada:");
        for (int i = 0; i < lista.comprimento(); i++) {
            System.out.print(lista.obtem(i));
        }
        System.out.println();

    }
}
