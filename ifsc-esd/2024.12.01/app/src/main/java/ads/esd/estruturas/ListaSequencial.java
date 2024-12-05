package ads.esd.estruturas;

import java.util.Random;

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

    public void ordena(){
        for(int i = 0; i < len - 1; i++){
            Comparable x1 = (Comparable) area[i];
            Comparable x2 = (Comparable) area[i + 1];
            if (x1.compareTo(x2) > 0) {
                Object temp = area[i];
                area[i] = area[i + 1];
                area[i + 1] = temp;
            }
        }
    }

    public void embaralha(){
        Random gerador = new Random();

        for (int i = comprimento()-1; i > 1; i--) {
            int j = gerador.nextInt(0, comprimento());
            Object removedItem = obtem(j);
            substitui(j, obtem(i));
            substitui(i, removedItem);
        }

    }
}

