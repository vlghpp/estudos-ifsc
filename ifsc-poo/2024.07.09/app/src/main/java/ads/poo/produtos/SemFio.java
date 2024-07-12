package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, Dimensao dim, double peso, String modelo, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, dim, peso, modelo);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + ", frequencia=" + this.frequencia + ", canais=" + this.canais + ", distancia=" + this.distancia + "}";
    }
}
