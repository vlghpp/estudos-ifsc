package ads.poo;

public abstract class Veiculo {
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;

    public Veiculo(int id, int velocidadeMaxima) {
        this.id = id;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int i) {
        if (velocidadeAtual + i <= velocidadeMaxima) {
            velocidadeAtual += i;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int i) {
        if (velocidadeAtual - i >= 0) {
            velocidadeAtual -= i;
        } else {
            velocidadeAtual = 0;
        }
    }

    public abstract boolean ligarDesligarFarol();

    public abstract boolean ativarDesativarTracao();
}