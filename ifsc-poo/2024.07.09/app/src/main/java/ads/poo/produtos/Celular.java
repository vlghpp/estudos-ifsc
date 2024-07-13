package ads.poo.produtos;

public class Celular extends SemFio{
    private String SO;

    public Celular(int codigo, String numSerie, Dimensao dim, double peso, String modelo, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, dim, peso, modelo, frequencia, canais, distancia);
    }

    public Celular(int codigo, String numSerie, Dimensao dim, double peso, String modelo, double frequencia, int canais, double distancia, String SO) {
        super(codigo, numSerie, dim, peso, modelo, frequencia, canais, distancia);
        this.SO = SO;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
}
