package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    void toReturnFiveWhenThreeIsAddedWithTwo() {

        Arithmetic arithmetic = new Arithmetic();

        assertEquals(5, arithmetic.add(3, 2));
    }
}
