package ads.poo;

public class Arqueiro extends Personagem{
    public Arqueiro(int ataque, double velocidade, int vida) {
        super(ataque, velocidade, vida);
    }

    public String atirarFlecha(){
        return "O arqueiro está atirando!";
    }

    @Override
    public String andar(){
        return "O arqueiro está andando...";
    }

    @Override
    public String correr(){
        return "O arqueiro está correndo...";
    }
}
