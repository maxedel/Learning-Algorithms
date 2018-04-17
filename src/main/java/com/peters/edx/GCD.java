package com.peters.edx;

public class GCD {

    public static int gcd_naive(int a, int b){
        int currentGcd = 1;
        for (int d = 2; d <= a && d <= b; d++){
            if (a % d == 0 && b % d == 0){
                if (d > currentGcd) currentGcd = d;
            }
        }
        return currentGcd;
    }

    public static long gcdFast(int a, int b){
        if (b == 0) return a;

        return gcdFast(b, a % b);
    }
}
