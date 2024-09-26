package org.example.exercicio;

public class Pilha {
    public static void main(String[] args) {
        CalculadoraPolonesa calc = new CalculadoraPolonesa();

        calc.adicionaNumero(1);
        calc.adicionaNumero(2);
        calc.fazOperacao("-");
        System.out.printf("Resultado:  \n" + calc.resultado());
    }
}
