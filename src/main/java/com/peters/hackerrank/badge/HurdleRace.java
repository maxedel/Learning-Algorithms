package com.peters.hackerrank.badge;

import java.util.Scanner;

public class HurdleRace {
    static int hurdleRace(int k, int[] heights) {
        // Complete this function
        int maxNumber = 0;
        for (int height : heights){
            if (maxNumber < height) {
                maxNumber = height;
            }
        }
        return k > maxNumber ? 0 : maxNumber - k ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
