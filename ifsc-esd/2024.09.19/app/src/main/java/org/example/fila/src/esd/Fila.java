package esd;

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

    public int length() {
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

    public Object remove(){
        if(!estaVazia()){
            if(fim == area.length){
                fim = 0;
            }

            Object elemento = area[inicio];
            area[inicio] = null;
            n--;
            inicio = (inicio + 1) % area.length;
            return elemento;
        }else{
            throw new IndexOutOfBoundsException("FILA TA CHEIA!");
        }
    }

    public Object frente() {
        if(!estaVazia()){
            return area[inicio];
        }else{
            throw new IndexOutOfBoundsException("FILA TA CHEIA!");
        }
    }

    public boolean estaVazia(){
        return n==0;
    }

    public boolean estaCheia(){
        return n == area.length;
    }
    public void limpa() {
        for (int i = 0; i < area.length; i++) {
            area[i] = null;
        }//area = new Object[];
    }
}
