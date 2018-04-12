package com.peters.edx;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciLastDigitTest {

    @Test
    public void resultEquilsSmallNumber() {
        int number = 10;
        int slow = FibonacciLastDigit.getFibonacciLastDigitNaive(number);
        int fast = FibonacciLastDigit.getFibonacciLastDigitFast(number);

        assertEquals(slow, fast);
    }
}