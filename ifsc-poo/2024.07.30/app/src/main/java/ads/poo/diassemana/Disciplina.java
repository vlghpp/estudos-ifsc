package ads.poo.diassemana;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias){
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        StringBuilder formato = new StringBuilder();
        for(DiasDaSemana dia : dias){
            formato.append("- ").append(dia.getNome()).append("\n");
        }
        return "Sigla: " + sigla + "\n Dias:" + "\n" + formato;
    }
}
