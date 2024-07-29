package com.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Nested
    class Addition {
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

        @Test
        void toReturnThreeWhenFiveIsAddedWithMinusTwo() {

            Arithmetic arithmetic = new Arithmetic();
            int minusTwo = -2, three = 3, five = 5;

            int actualSum = arithmetic.add(five, minusTwo);

            assertEquals(three, actualSum);
        }

        @Test
        void toReturnThreeWhenThreeIsAddedWithZero() {

            Arithmetic arithmetic = new Arithmetic();
            int zero = 0, three = 3;

            int actualSum = arithmetic.add(three, zero);

            assertEquals(three, actualSum);
        }
    }

    @Nested
    class Subtraction {
        @Test
        void toReturnFiveWhenSevenIsSubtractedWithTwo() {

            Arithmetic arithmetic = new Arithmetic();
            int two = 2, five = 5, seven = 7;

            int actualDifference = arithmetic.sub(seven, two);

            assertEquals(five, actualDifference);
        }
    }
}
