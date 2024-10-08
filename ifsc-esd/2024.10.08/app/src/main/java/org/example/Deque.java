package org.example;

public class Deque {
    Object[] area;
    int inicio, fim;
    int n; // quantidade de valores armazenados

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
        return this.fim - this.inicio;
    }


    public void adiciona(Object valor){
        if(!estaCheia()){
            if(fim == area.length){
                fim = 0;
            }
            area[fim] = valor;
            fim++;
            n++;
        }else{
            throw new IndexOutOfBoundsException("FILA TA CHEIA!");
        }
    }

    public void insere(Object valor){
        if(!estaCheia()){
            area[inicio] = valor;
            inicio++;
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

    public Object extrai_fim(){
        if(!esta_vazia()){
            Object elemento = area[fim];
            area[fim] = null;
            n--;
            fim = (fim + 1) % area.length;
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

    public Object acessa_fim() {
        if(!esta_vazia()){
            return area[fim];
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }
    public Object acessa(int index){
        if(!esta_vazia()){
            return area[index];
        }else{
            throw new IndexOutOfBoundsException("FILA TA VAZIA!");
        }
    }

    public boolean esta_vazia(){
        return n==0;
    }

    public boolean estaCheia(){
        return n == area.length;
    }
    public void limpa() {
        for (int i = 0; i < area.length; i++) {
            area[i] = null;
        }
    }
}