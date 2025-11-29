package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testSub() {
        Calculator c = new Calculator();
        assertEquals(1, c.sub(3, 2));
    }

    @Test
    void testMul() {
        Calculator c = new Calculator();
        assertEquals(6, c.mul(2, 3));
    }

    @Test
    void testDiv() {
        Calculator c = new Calculator();
        assertEquals(2, c.div(4, 2));
    }

    @Test
    void testDivByZero() {
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.div(4, 0));
    }
}
