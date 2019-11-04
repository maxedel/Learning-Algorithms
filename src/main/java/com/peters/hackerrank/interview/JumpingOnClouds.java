package com.peters.hackerrank.interview;

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0 && i+2 < c.length && c[i+2] != 1){
                i++;
                jumps++;
            } else if (c[i] == 0 && i+1 < c.length){
                jumps++;
            }
        }

        return jumps;
    }
}
