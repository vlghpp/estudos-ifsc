package org.example;

public class Deque {
    Object[] area;
    int inicio, fim;
    int n;

    public Deque() {
        area = new Object[5];
        this.inicio = 0;
        this.n = 0;
        this.fim = 0;
    }

    public int comprimento() {
        return this.n;
    }

    public int capacidade() {
        return area.length;
    }


    public void adiciona(Object valor) {
        if (esta_cheia()) {
            Object[] novoArray = new Object[area.length * 2];

            for (int i = 0; i < n; i++) {
                int inicioNovo = (inicio + i) % area.length;
                novoArray[i] = area[inicioNovo];
            }

            area = novoArray;
            inicio = 0;
            fim = n;
        }

        area[fim] = valor;
        fim = (fim + 1) % area.length;
        n++;
    }

    public void insere(Object valor) {
        if (!esta_cheia()) {
            inicio = (inicio - 1 + area.length) % area.length;
            area[inicio] = valor;
            n++;
        } else {
            throw new IndexOutOfBoundsException("FILA TA CHEIA!");
        }
    }

    public Object extrai_inicio(){
        if(!esta_vazia()){
            if(fim == area.length){
                fim = 0;
            }

            Object elemento = area[inicio];
            area[inicio] = null;
            n--;
            inicio = (inicio + 1) % area.length;
            return elemento;
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }

    public Object extrai_final(){
        if(!esta_vazia()){
            fim = (fim - 1 + area.length) % area.length;
            Object elemento = area[fim];
            area[fim] = null;
            n--;
            return elemento;
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }

    public Object acessa_inicio() {
        if(!esta_vazia()){
            return area[inicio];
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }

    public Object acessa_final() {
        if(!esta_vazia()){
            int ultimoIndice = (fim - 1 + area.length) % area.length;
            return area[ultimoIndice];
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }
    public Object acessa(int index){
        if(!esta_vazia()){
            if (index < 0 || index >= n) {
                throw new IndexOutOfBoundsException("Indice invalido");
            }
            return area[index];
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }

    public boolean esta_vazia(){
        return n==0;
    }

    public boolean esta_cheia(){
        return n == area.length;
    }

    public void limpa() {
        for (int i = 0; i < area.length; i++) {
            area[i] = null;
        }
        inicio = 0;
        fim = 0;
        n = 0;
    }
}