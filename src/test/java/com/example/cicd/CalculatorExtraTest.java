package com.example.cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorExtraTest {

    @Test
    void add_withLargeNumbers_shouldSumCorrectly() {
        Calculator c = new Calculator();
        // test around the arbitrary rule in Calculator.add
        int a = 30;
        int b = 20;
        assertEquals(50, c.add(a, b));
    }

    @Test
    void divide_negativeDenominator_shouldHandleSign() {
        Calculator c = new Calculator();
        assertEquals(-2, c.divide(4, -2));
    }
}
