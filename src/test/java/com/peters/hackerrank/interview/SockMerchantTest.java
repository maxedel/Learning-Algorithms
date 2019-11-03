package com.peters.hackerrank.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class SockMerchantTest {


    @Test
    public void shouldReturnThree() {
        int numberOfSocks = 9;
        int[] colors = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = SockMerchant.sockMerchant(numberOfSocks, colors);

        assertEquals(3, result);
    }

    @Test
    public void shouldReturnZero() {
        int numberOfSocks = 9;
        int[] colors = {10, 20, 70, 80, 90, 30, 50, 40, 60};

        int result = SockMerchant.sockMerchant(numberOfSocks, colors);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWhenOnlyOneSock() {
        int numberOfSocks = 1;
        int[] colors = {10};

        int result = SockMerchant.sockMerchant(numberOfSocks, colors);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnSix() {
        int numberOfSocks = 15;
        int[] colors = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};

        int result = SockMerchant.sockMerchant(numberOfSocks, colors);

        assertEquals(6, result);
    }

    @Test
    public void shouldReturnFour() {
        int numberOfSocks = 10;
        int[] colors = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        int result = SockMerchant.sockMerchant(numberOfSocks, colors);

        assertEquals(4, result);
    }

}