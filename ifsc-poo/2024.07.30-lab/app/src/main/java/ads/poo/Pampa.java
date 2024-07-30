package ads.poo;

public class Pampa extends Veiculo implements TracaoIntegral {
    private boolean cacamba = false; //Caçamba já começa fechada (false)
    private boolean tracao = false; //Começa com a tração desativada

    public Pampa(int id) {
        super(id, 140);
    }

    public boolean abrirFecharCacamba() {
        //True -> ta aberta, False -> Fechada
        if(velocidadeAtual == 0){
            cacamba = !cacamba;
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
    public boolean ligarDesligarFarol() {
        return false;
    }
}
