package ads.poo.enumplanetas;

public enum Planetas {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETURO(8);

    private int posicao;

    Planetas(int posicao) {
        this.posicao = posicao;
    }
}
