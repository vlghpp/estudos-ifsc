package org.example;


public class ListaSequencialOrdenada<T extends Comparable> extends ListaSequencial{

    @Override
    public void adiciona(Object valor) {
        super.adiciona(valor);
        if(comprimento() == 0){
            this.area[0] = valor;
            return;
        }
    }

    private boolean buscaBinaria(Object[] vetor, int inicio, int fim, T alvo){
        while(inicio <= fim){
            var meio = inicio + (fim-inicio)/2;
            if(alvo.compareTo(this.area[meio]) == 0){
                return true;
            }else if(alvo.compareTo(this.area[meio]) > 0){
                return buscaBinaria(vetor, inicio, meio-1, alvo);
            }else{
                return buscaBinaria(vetor, meio+1, fim, alvo);
            }
        }
        return false;
    }
}