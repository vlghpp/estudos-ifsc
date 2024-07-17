package ads.poo;

public class Cavaleiro extends Personagem{

    private int saudeMontaria;

    public Cavaleiro(int ataque, double velocidade, int vida) {
        super(ataque, velocidade, vida);
    }

    public String ataqueEmMovimento(){
        return "O cavaleiro está usando seu super ataque em " + this.velocidade + "km/h (deu mais dano)";
    }

    public String recuperarVida(){
        if(saudeMontaria > 0){
            return "O pé de pano está sem vida! Dê um descanso à ele.";
        }
        return "O pé de pano está bem! Não precisa ser recuperado.";
    }

    @Override
    public String correr(){
        return "Cuidado cavaleiro! O pé de pano está à " + this.velocidade + "km/h";
    }

}
