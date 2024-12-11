package ads.esd.estruturas;

public class ListaSequencialSimples {
    Object[] area;
    int len;
    final int defcap = 8;

    public ListaSequencialSimples() {
        area = new Object[defcap];
        this.len = 0;
    }

    public void adiciona(Object valor) {
        if(len == area.length){
            expande();
        }

        area[len] = valor;
        len++;
    }

    public void remove(int indice) {
        if (indice < 0 || indice >= len) {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }
        Object valorRemovido = area[indice];

        area[indice] = area[len - 1];
        len--;
    }

    public boolean esta_vazia() {
        return len == 0;
    }

    public int comprimento() {
        return len;
    }

    public int capacidade() {
        return area.length;
    }

    public void limpa() {
        for (int i = 0; i < area.length; i++) {
            area[i] = null;
        }

        len = 0;
    }

    public Object obtem(int indice) {
        if (indice < 0 || indice >= len) {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }
        return area[indice];
    }

    public int procura(Object valor) {
        for (int i = 0; i < len; i++) {
            if (area[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void ordena() {
        for (int i = 0; i < len - 1; i++) {
            Comparable x1 = (Comparable) this.area[i];
            Comparable x2 = (Comparable) this.area[i + 1];
            if (x1.compareTo(x2) > 0) {
                Object armazena = area[i];
                area[i] = area[i +1];
                area[i + 1] = armazena;
            }
        }
    }

    public void expande(){
        Object[] novaLista = new Object[capacidade()*2];
        for (int i = 0; i < len; i++){
            novaLista[i] = area[i];
        }
        area = novaLista;
    }
}
