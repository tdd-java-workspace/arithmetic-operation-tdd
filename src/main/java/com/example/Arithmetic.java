package com.example;

public class Arithmetic {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) throws ArithmeticException {
        try {
            return number1 / number2;
        }
        catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
