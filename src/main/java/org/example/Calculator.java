package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero!");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2,3));
    }
}
