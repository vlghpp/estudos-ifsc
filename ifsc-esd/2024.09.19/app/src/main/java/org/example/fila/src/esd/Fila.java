package org.example.fila.src.esd;

public class Fila {
    Object[] area;
    int inicio, fim;
    int n; // quantidade de valores armazenados

    public Fila(int quantidade) {
        area = new Object[quantidade];
        this.inicio = 0;
        this.n = 0;
        this.fim = 0;
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

    public Object remove(){
        if(!estaCheia()){
            return area[inicio];
        }
    }


    public boolean estaVazia(){
        return n==0;
    }

    public boolean estaCheia(){
        return n == area.length;
    }

}
