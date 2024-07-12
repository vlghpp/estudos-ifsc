package ads.poo.produtos;

public class Telefone {
    private int codigo;
    private String numSerie;
    private String modelo;
    protected double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, Dimensao dim, double peso, String modelo) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.dim = dim;
        this.peso = peso;
        this.modelo = modelo;
    }

    public String imprimirDados() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dim=" + dim +
                '}';
    }
}
