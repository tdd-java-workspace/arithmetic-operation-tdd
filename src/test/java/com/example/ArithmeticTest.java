package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    private static Arithmetic arithmetic;

    @BeforeAll
    static void beforeAll() {
        arithmetic = new Arithmetic();
    }

    @Nested
    class Addition {
        @Test
        void toReturnFiveWhenThreeIsAddedWithTwo() {


    //        AAA
    //        Arrange
            int two = 2, three = 3, five = 5;

    //        Act
            int actualSum = arithmetic.add(three, two);

    //        Assert
            assertEquals(five, actualSum);
        }

        @Test
        void toReturnThreeWhenFiveIsAddedWithMinusTwo() {

            int minusTwo = -2, three = 3, five = 5;

            int actualSum = arithmetic.add(five, minusTwo);

            assertEquals(three, actualSum);
        }

        @Test
        void toReturnThreeWhenThreeIsAddedWithZero() {

            int zero = 0, three = 3;

            int actualSum = arithmetic.add(three, zero);

            assertEquals(three, actualSum);
        }
    }

    @Nested
    class Subtraction {
        @Test
        void toReturnFiveWhenSevenIsSubtractedWithTwo() {

            int two = 2, five = 5, seven = 7;

            int actualDifference = arithmetic.sub(seven, two);

            assertEquals(five, actualDifference);
        }
    }
}
