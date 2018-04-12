package com.peters.hackerrank.badge;

import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int counter = 0;
        if (ar.length == 0) return counter;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                boolean firstCond = (ar[i] + ar[j]) % k == 0;
                boolean secondCond = i < j;
                if (firstCond && secondCond){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
//        int result = divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2});
//        int result = divisibleSumPairs(7, 3, new int[]{1, 3, 2, 6, 1, 2, 1});
//        int result = divisibleSumPairs(7, 3, new int[]{29, 97, 52, 86, 27, 89, 77, 19, 99, 96});
        int result = divisibleSumPairs(7, 40, new int[]{13, 91, 5, 100, 5, 12, 5, 79, 99, 87, 59, 65, 62, 73, 93, 73, 63, 65, 59, 46, 67, 35, 22, 55, 50, 53, 38, 79, 75, 44, 95, 53, 5, 73, 44, 94, 95, 21, 60, 2, 32, 48, 72, 13, 91, 74, 79, 99, 17, 31, 53, 20, 88, 17, 54, 47, 56, 79, 23, 49, 95, 81, 9, 50, 12, 20, 45, 82, 44, 82, 93, 15, 73, 51, 65, 96, 4, 77, 37, 41, 30, 11, 65, 100, 62, 51, 64, 48, 12, 11, 68, 81, 46, 37, 10, 46, 75, 82, 21, 23});
//        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
