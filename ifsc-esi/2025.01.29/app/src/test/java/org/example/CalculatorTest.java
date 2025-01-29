package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Teste da soma")
    void add() {
        assertEquals(9, Calculator.add(2,3,4));
    }

    @Test
    @DisplayName("Teste da multiplacação")
    void multiply() {
        assertAll(
                () -> assertEquals(6, Calculator.multiply(2,3)),
                () -> assertEquals(6, Calculator.multiply(2,-3)),
                () ->  assertEquals(6, Calculator.multiply(2,5,0))

        );

    }
}