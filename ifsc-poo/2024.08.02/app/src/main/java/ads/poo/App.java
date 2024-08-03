package ads.poo;

public class App {
    public static void main(String[] args) {
        Caixa<Pessoa> c = new Caixa<>();

        Pessoa p = new Pessoa("JUCA");

        c.setConteudo(p);

        Pessoa h = c.getConteudo();

        System.out.println(h);
    }
}
