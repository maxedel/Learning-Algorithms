package com.peters.hackerrank.interview;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int valley = 0;
        int level = 0;

        for (char c : s.toCharArray()) {
            if (c == 'U'){
                ++level;
            }
            if (c == 'D'){
                --level;
            }
            if (c == 'U' && level == 0){
                ++valley;
            }
        }

        return valley;

    }
}
