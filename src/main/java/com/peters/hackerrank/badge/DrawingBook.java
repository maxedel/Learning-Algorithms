package com.peters.hackerrank.badge;

import java.util.Scanner;

public class DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        int counterForward = 0;
        int counterBackward = 0;
        for (int i = 0; i <= n; i += 2) {
            if (p != i && p != i + 1) counterForward++;
            else break;
        }
        int endBook = n % 2 == 0 ? n + 1 : n;
        for (int i = endBook; i > 0; i -= 2) {
            if (p != i && p != i - 1) counterBackward++;
            else break;
        }
        return counterForward > counterBackward ? counterBackward : counterForward;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int p = in.nextInt();
//        int result = solve(n, p);
//        int result = solve(6, 2);
        int result = solve(5, 4);
        System.out.println(result);
    }
}
