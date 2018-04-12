package com.peters.hackerrank.badge;

import java.util.Scanner;

public class AppleAndOrange {

    static void countApplesAndOranges(int leftSideHouse, int rightSideHouse, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int larryScore = 0;
        int robScore = 0;
        for(int apple : apples){
            int sum = a + apple;
            if (sum >= leftSideHouse && sum <= rightSideHouse) larryScore++;
        }
        for(int orange : oranges){
            int sum = b + orange;
            if (sum >= leftSideHouse && sum <= rightSideHouse) robScore++;
        }
        System.out.println(larryScore);
        System.out.print(robScore);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
