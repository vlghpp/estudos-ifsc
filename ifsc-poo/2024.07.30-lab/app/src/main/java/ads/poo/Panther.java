package ads.poo;

public class Panther extends Veiculo implements VeiculoAnfibio, Conversivel, VeiculoMarinho {
    private boolean rodasRecolhidas;
    private boolean capota;
    private boolean tracao;
    private int temperaturaGeladeira;
    private int lastro;

    public Panther(int id, int capacidadeLastro) {
        super(id, 140);
        this.temperaturaGeladeira = 0;
        this.capota = true;
        this.tracao = false;
        this.rodasRecolhidas = false; //True -> as rodas estão sendo usadas, False -> as rodas não estão sendo usadas
    }

    @Override
    public boolean ligarDesligarFarol() {
        return false;
    }

    @Override
    public boolean abrirFecharCapota() {
        if(velocidadeAtual == 0){
            capota = !capota;
            return true;
        }
        return false;
        //Caso conseguir fazer o evento ele retorna true, caso não, retorna false
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velocidadeAtual == 0){
            tracao = !tracao;
            return true;
        }
        return false;
        //Caso conseguir fazer o evento ele retorna true, caso não, retorna false
    }

    @Override
    public boolean abrirRecolherRodas() {
        if (velocidadeAtual == 0 && rodasRecolhidas) {
            //se não tiver em movimento ele faz o evento
            rodasRecolhidas = false;
            if (rodasRecolhidas) {
                //se tiver com as rodas recolhidas ele esvazia o lastro
                esvaziarLastro();
            }
            //retorna o estado das rodas
            return rodasRecolhidas;
        }
        //veiculo vai ta em movimento então não vai executar o evento
        return false;
    }

    @Override
    public String esvaziarLastro() {
        return "";
    }
}
