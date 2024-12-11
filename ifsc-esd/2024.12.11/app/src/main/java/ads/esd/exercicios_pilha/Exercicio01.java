package ads.esd.exercicios_pilha;

import ads.esd.estruturas.Pilha;

public class Exercicio01 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        System.out.println("Valor do topo: " + pilha.desempilha());
        System.out.println("Valor atual do novo topo: " + pilha.topo());
    }
}
