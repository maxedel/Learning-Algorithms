package com.peters.hackerrank.badge;

import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
