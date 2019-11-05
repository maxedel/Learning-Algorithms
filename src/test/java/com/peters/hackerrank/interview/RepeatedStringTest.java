package com.peters.hackerrank.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void shouldReturnSeven() {
        String s = "aba";
        int lettersNumber = 10;

        long result = RepeatedString.repeatedString(s, lettersNumber);

        assertEquals(7, result);
    }

    @Test
    public void shouldReturnMillion() {
        String s = "a";
        long lettersNumber = 1000000000000L;

        long result = RepeatedString.repeatedString(s, lettersNumber);

        assertEquals(1000000000000L, result);
    }

    @Test
    public void test1() {
        String s = "beeaabc";
        long lettersNumber = 711560125001L;

        long result = RepeatedString.repeatedString(s, lettersNumber);

        assertEquals(203302892858L, result);
    }
}