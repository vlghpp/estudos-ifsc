package ads.poo;

public class Ferrari extends Veiculo implements Conversivel {
    private boolean farol;
    private boolean tracao;
    private boolean capota;

    public Ferrari(int id) {
        super(id, 200);
        this.farol = true;
        this.tracao = false;
        this.capota = false;
    }

    @Override
    public boolean ligarDesligarFarol() {
        farol = !farol;
        return farol;
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
    public boolean abrirFecharCapota() {
        if(velocidadeAtual == 0){
            capota = !capota;
            return true;
        }
        return false;
        //Caso conseguir fazer o evento ele retorna true, caso não, retorna false
    }
}
