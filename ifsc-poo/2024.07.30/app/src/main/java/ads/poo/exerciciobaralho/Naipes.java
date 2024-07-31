package ads.poo.exerciciobaralho;

public enum Naipes {
    PAUS("\u2663"),
    COPAS("\u2665"),
    ESPADAS("\u2660"),
    OUROS("\u2666");

    private String unicode;

    Naipes(String unicode) {
        this.unicode = unicode;
    }
}
