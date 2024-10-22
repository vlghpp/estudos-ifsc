package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaSequencial extends ListaSequencialSimples{

    public void insere(int indice, Object valor) throws Exception{
        if(len > capacidade()){
            throw new ArrayIndexOutOfBoundsException("Lista cheia!");
        }

        for (int i = len-1; i >= indice; i--) {
            this.area[i+1] = this.area[i];
        }
        this.area[indice] = valor;
    }

    public void substitui(int indice, Object valor){
        this.area[indice] = valor;
    }

}