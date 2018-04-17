package com.peters.edx;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void caseOne() {
        int a = 18;
        int b = 35;

        int slow = GCD.gcd_naive(a, b);
        long fast = GCD.gcdFast(a, b);

        assertEquals(slow, fast);
        assertEquals(1, fast);
    }

    @Test
    public void secondCase() {
        int a = 28851538;
        int b = 1183019;

        int slow = GCD.gcd_naive(a, b);
        long fast = GCD.gcdFast(a, b);

        assertEquals(slow, fast);
        assertEquals(17657, fast);
    }
}