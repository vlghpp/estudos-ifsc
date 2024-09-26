package org.example.exercicio;

import java.util.Stack;

public class CalculadoraPolonesa {
    private Stack<Double> stack = new Stack<>();

    public void adicionaNumero(double numero) {
        stack.push(numero);
    }

    public void fazOperacao(String operacao) {
        switch (operacao) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(stack.pop() - stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                stack.push(stack.pop() / stack.pop());
        }
    }

    public Double calcula(String operacao){
        Stack<Double> pilha = new Stack<>();
        String[] expressao = operacao.split(" ");

        return 1.0;
    }

    public boolean completa(){
        if(stack.size() <= 1) {
            return false;
        }
        return true;
    }


    public Double resultado(){
        return stack.pop();
    }

}
