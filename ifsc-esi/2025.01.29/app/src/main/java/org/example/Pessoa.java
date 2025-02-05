package org.example;

import java.security.InvalidParameterException;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public Boolean setNome(String nome) {

        if (nome == null)
            throw new InvalidParameterException("Nome não pode ser nulo");


        if (nome.isEmpty())
            throw new InvalidParameterException("Nome não pode ser vazio");

        if (nome.split(" ").length >= 2) {
            this.nome = nome;
            return true;
        } else {
            throw new InvalidParameterException("Nome não é válido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean setCpf(String cpf) {

        if (cpf == null) {
            throw new InvalidParameterException("CPF não pode ser nulo");
        }

        if (validarCpf(cpf)) {
            this.cpf = cpf;
            return true;
        } else {
            throw new InvalidParameterException("CPF não é valido");
        }
    }

    public static boolean validarCpf(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (caso inválido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int firstDigit = 11 - (sum % 11);
        if (firstDigit >= 10) {
            firstDigit = 0;
        }

        // Verifica o primeiro dígito verificador
        if (firstDigit != (cpf.charAt(9) - '0')) {
            return false;
        }

        // Cálculo do segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int secondDigit = 11 - (sum % 11);
        if (secondDigit >= 10) {
            secondDigit = 0;
        }

        // Verifica o segundo dígito verificador
        return secondDigit == (cpf.charAt(10) - '0');
    }

}