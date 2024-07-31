package ads.poo.diassemana;

public enum DiasDaSemana {
    DOM(0, "Domingo"),
    SEG(1, "Segunda-feira"),
    TER(2, "Terça-feira"),
    QUA(3, "Quarta-feira"),
    QUI(4, "Quinta-feira"),
    SEX(5, "Sexta-feira"),
    SAB(6, "Sabádo");

    private int codigo;
    private String nome;

    DiasDaSemana(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
