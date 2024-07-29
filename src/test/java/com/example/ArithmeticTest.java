package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    void toReturnFiveWhenThreeIsAddedWithTwo() {

        Arithmetic arithmetic = new Arithmetic();
        int two = 2, three = 3, five = 5;

        assertEquals(five, arithmetic.add(three, two));
    }
}
