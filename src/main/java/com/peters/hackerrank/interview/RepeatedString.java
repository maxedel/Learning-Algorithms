package com.peters.hackerrank.interview;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long letterA = 0;
        long whole = n / s.length();
        int remains = (int) (n % s.length());
        for (char c : s.toCharArray()) {
            if (c == 'a') letterA++;
        }
        if (letterA == 0) return 0;
        letterA *= whole;
        String remainString = s.substring(0, remains);
        for (char c : remainString.toCharArray()) {
            if (c == 'a') letterA++;
        }
        return letterA;
    }
}
