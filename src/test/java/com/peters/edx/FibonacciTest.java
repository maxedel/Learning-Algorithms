package com.peters.edx;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void resultHaveToBeEqual() {
        int number = 10;
        long slow = Fibonacci.calc_fib(number);
        long fast = Fibonacci.fib_fast(number);

        assertEquals(fast, slow);
    }

    @Test
    public void resultHaveToBeEqualHugeNumber() {
        int number = 42;
        long slow = Fibonacci.calc_fib(number);
        long fast = Fibonacci.fib_fast(number);
        System.out.println("fast = " + fast);
        assertEquals(fast, slow);
    }
}