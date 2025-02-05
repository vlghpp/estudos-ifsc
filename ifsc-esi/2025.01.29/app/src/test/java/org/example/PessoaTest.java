package org.example;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PessoaTest {

    @Test
    void constructor() {
        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa(null, null);
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa("", null);
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa(null, "");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa(null, "");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa("", "");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa("Eduardo", "12345678909");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Pessoa p = new Pessoa("Eduardo Ferraz", "12345678920");
        });

        assertDoesNotThrow(() -> {
            Pessoa p = new Pessoa("Eduardo Ferraz", "08730718910");
        });
    }

    @Test
    void setNome(){
        Pessoa p = new Pessoa("Eduardo Teste", "08730718910");

        assertEquals("Eduardo Teste", p.getNome());

        assertThrows(InvalidParameterException.class, () -> {
            p.setNome("Eduardo");
        });

        assertThrows(InvalidParameterException.class, () -> {
            p.setNome("");
        });

        assertThrows(InvalidParameterException.class, () -> {
            p.setNome(null);
        });

        assertEquals("Eduardo Teste", p.getNome());

        assertDoesNotThrow(() -> {p.setNome("Fa Sa");});

        assertEquals("Fa Sa", p.getNome());

        assertDoesNotThrow(() -> {
            p.setNome("Eduardo Teste");
        });
    }

    @Test
    void setCpf() {
    }

    @Test
    void validarCpf() {
    }
}