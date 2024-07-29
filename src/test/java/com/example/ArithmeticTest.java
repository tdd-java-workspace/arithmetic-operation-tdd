package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    void toReturnFiveWhenThreeIsAddedWithTwo() {


//        AAA
//        Arrange
        Arithmetic arithmetic = new Arithmetic();
        int two = 2, three = 3, five = 5;

//        Act
        int actualSum = arithmetic.add(three, two);

//        Assert
        assertEquals(five, actualSum);
    }
}
