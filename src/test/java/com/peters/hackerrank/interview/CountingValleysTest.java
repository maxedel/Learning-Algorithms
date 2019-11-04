package com.peters.hackerrank.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void shouldReturnOne() {
        int numberOfSteps = 8;
        String path = "UDDDUDUU";

        int valleys = CountingValleys.countingValleys(numberOfSteps, path);

        assertEquals(1, valleys);

    }
}