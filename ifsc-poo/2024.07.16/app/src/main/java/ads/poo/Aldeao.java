package ads.poo;

public class Aldeao extends Personagem{

    public Aldeao(int ataque, double velocidade, int vida) {
        super(ataque, velocidade, vida);
    }

    public String plantar(){
        return "O aldeão está plantando...";
    }

    public String coletar(){
        return "O aldeão está coletando...";
    }

    public String construir(){
        return "O aldeão está construindo";
    }

    @Override
    public String atacar() {
        return "O aldeão está atacando...";
    }

    @Override
    public String correr() {
        return "O aldeão está correndo...";
    }

    @Override
    public String andar() {
        return "O aldeão está andando...";
    }
}
