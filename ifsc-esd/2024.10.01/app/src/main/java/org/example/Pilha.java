package org.example;

public class Pilha{
    Object[] pilha;
    int topo = -1;
    int maximo = 10;

    public Pilha() {
        this.pilha = new Object[maximo];
    }

    public void empilha(Object elemento) {
        if(comprimento() == capacidade()) {
            maximo*=2;
            Object[] pilhaNova = new Object[maximo];
            for (int i = 0; i < pilha.length; i++) {
                pilhaNova[i] = pilha[i];
            };

            pilha = pilhaNova;
        }
        pilha[topo++] = elemento;
    }
    public Object topo(){
        return pilha[topo];
    }

    public Object desempilha() {
        if(!estaVazia()) {
            Object elemento = pilha[topo];
            pilha[topo] = null;
            topo--;
            return elemento;
        }
        throw new IndexOutOfBoundsException("PILHA ESTÁ VAZIA!");
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public int comprimento(){
        return topo++;
    }

    public int capacidade(){
        return maximo;
    }

    public void limpa(){
        for (int i = 0; i < pilha.length; i++) {
            pilha[i] = null;
        }
    }
}
