package ads.poo;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int ataque, double velocidade, int vida) {
        this.ataque = ataque;
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public String atacar(){
        return "Está atacando...";
    }

    public String andar(){
        return "Está andando...";
    }

    public String correr(){
        return "Está correndo...";
    }
}
