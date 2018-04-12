package com.peters.edx;

import java.util.Scanner;

public class Fibonacci {

    public static long calc_fib(int n) {
        if (n <= 1)
            return n;
        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    public static long fib_fast(int n){
        if (n <= 1) return n;
        long fib = 1;
        long prevFib = 1;

        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
