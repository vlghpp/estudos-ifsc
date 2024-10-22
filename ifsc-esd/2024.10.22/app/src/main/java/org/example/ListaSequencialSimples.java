package org.example;

public class ListaSequencialSimples {

    Object[] area;
    int len;
    final int defcap = 8;

    public ListaSequencialSimples() {
        area = new Object[defcap];
        this.len = 0;
    }

    public void adiciona (Object valor) {
        if (len < capacidade()) {
            area[len] = valor;
            len++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Lista cheia!");
        }
    }

    public void remove(int indice) {
        if (indice < 0 || indice >= len) {
            throw new IndexOutOfBoundsException("Índice inválido!");
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
            throw new IndexOutOfBoundsException("Índice inválido!");
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
}