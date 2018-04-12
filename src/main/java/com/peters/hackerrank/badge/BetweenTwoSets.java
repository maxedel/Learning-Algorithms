package com.peters.hackerrank.badge;

import java.util.Scanner;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int result = 0;
        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            int divA = 0;
            int divB = 0;
            for (int a1 : a) {
                if (i%a1 == 0){
                    divA++;
                }
            }
            for (int b1 : b) {
                if (b1%i == 0){
                    divB++;
                }
            }
//            System.out.println(i + ") divA=" + divA + ", divB=" + divB);
            result += divA == a.length && divB == b.length ? 1 : 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i = 0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int[] b = new int[m];
//        for(int b_i = 0; b_i < m; b_i++){
//            b[b_i] = in.nextInt();
//        }
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
