package com.example;

import com.example.exceptions.ZeroDivisionException;

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

    public int divide(int number1, int number2) throws ZeroDivisionException {
        if(number2 == 0) {
            throw new ZeroDivisionException("Zero Division Error");
        }

        return number1 / number2;
    }
}
