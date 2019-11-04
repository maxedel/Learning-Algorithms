package com.peters.hackerrank.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpingOnCloudsTest {

    @Test
    public void shouldReturnThree() {
        int[] clouds = {0, 0, 0, 0, 1, 0};

        int jumps = JumpingOnClouds.jumpingOnClouds(clouds);

        assertEquals(3, jumps);
    }
}