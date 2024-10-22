package org.example;


public class ListaSequencialOrdenada<T extends Comparable> extends ListaSequencial{

    public void adiciona(T valor) throws Exception {
        for (int i = 0; i < comprimento(); i++) {
            if(valor.compareTo(area[i]) <= 0){
                super.insere(i, valor);
                return;
            }
        }
        super.adiciona(valor);
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