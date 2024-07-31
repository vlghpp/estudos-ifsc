package ads.poo.exerciciobaralho;

import java.util.ArrayList;

public class App {
    private ArrayList<ValorCartas> valorCartas;

    public App(ArrayList<ValorCartas> valorCartas) {
        this.valorCartas = new ArrayList<>();
    }

    public static void main(String[] args) {
        for(ValorCartas b : ValorCartas.values()){
            System.out.println(b);
        }
    }
}
