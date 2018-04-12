package com.peters.hackerrank.badge;

import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int n, int[] squares, int d, int m) {
        // Complete this function
        int counter = 0;
        if (m == 1) {
            for (int square : squares) {
                if (square == d) counter++;
            }
        } else {
            for (int i = 0; i <= squares.length - m; i++) {
                int sum = 0;
                for (int j = i; j < i + m; j++) sum += squares[j];
                System.out.println(i + ")sum = " + sum);
                if (sum == d) counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] s = new int[n];
//        for(int s_i=0; s_i < n; s_i++){
//            s[s_i] = in.nextInt();
//        }
//        int d = in.nextInt();
//        int m = in.nextInt();
//        int result = solve(5, new int[]{1, 2, 1, 3, 2}, 3, 2);
//        int result = solve(5, new int[]{4}, 4, 1);
        int result = solve(19, new int[]{2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1}, 18, 7);
        System.out.println(result);
    }

}
