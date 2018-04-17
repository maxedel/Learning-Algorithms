package com.peters.edx;

import org.junit.Test;

import static com.peters.edx.FibonacciLastDigit.*;
import static com.peters.edx.FibonacciLastDigit.getFibonacciLastDigitFast;
import static org.junit.Assert.*;

public class FibonacciLastDigitTest {

    @Test
    public void resultEquilsSmallNumber() {
        int number = 10;
        int slow = getFibonacciLastDigitNaive(number);
        int fast = getFibonacciLastDigitFast(number);

        assertEquals(slow, fast);
    }

    @Test
    public void firstCase() {
        assertEquals(9, getFibonacciLastDigitFast(331));
    }

    @Test
    public void secondCase() {
        assertEquals(5, getFibonacciLastDigitFast(327305));
    }
}