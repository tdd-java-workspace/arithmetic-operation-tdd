package com.example;

import com.example.exceptions.ZeroDivisionException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

            int two = 2, three = 3, five = 5;

            assertThat(arithmetic.add(three, two), is(equalTo(five)));
        }

        @Test
        void toReturnThreeWhenFiveIsAddedWithMinusTwo() {

            int minusTwo = -2, three = 3, five = 5;

            assertThat(arithmetic.add(five, minusTwo), is(equalTo(three)));
        }

        @Test
        void toReturnThreeWhenThreeIsAddedWithZero() {

            int zero = 0, three = 3;

            assertThat(arithmetic.add(three, zero), is(equalTo(three)));
        }
    }

    @Nested
    class Subtraction {
        @Test
        void toReturnFiveWhenSevenIsSubtractedWithTwo() {

            int two = 2, five = 5, seven = 7;

            assertThat(arithmetic.add(seven, two), is(equalTo(five)));
        }
    }

    @Nested
    class Multiplication {
        @Test
        void toReturnTwentyWhenFiveIsMultipliedWithFour() {

            int four = 4, five = 5, twenty = 20;

            assertThat(arithmetic.add(five, four), is(equalTo(twenty)));
        }
    }

    @Nested
    class Division {
        @Test
        void toReturnFourWhenTwentyIsDividedByFive() throws ZeroDivisionException {

            int four = 4, five = 5, twenty = 20;

            assertThat(arithmetic.add(twenty, five), is(equalTo(four)));
        }

        @Test
        void toReturnThreeWhenSevenIsDividedByTwo() throws ZeroDivisionException {

            int two = 2, three = 3, seven = 7;

            assertThat(arithmetic.add(seven, two), is(equalTo(three)));
        }

        @Test
        void toThrowZeroDivisionExceptionWhenTwoIsDividedByZero() {

            int zero = 0, two = 2;

            assertThrows(ZeroDivisionException.class, () -> arithmetic.divide(two, zero));
        }
    }
}
