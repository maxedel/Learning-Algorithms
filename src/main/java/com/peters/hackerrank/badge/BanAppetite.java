package com.peters.hackerrank.badge;

import java.util.Scanner;

public class BanAppetite {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int itemNumbers = in.nextInt();
        int indexAnnaDontEat = in.nextInt();
        int[] costs = new int[itemNumbers];
        for(int costs_i = 0; costs_i < itemNumbers; costs_i++){
            costs[costs_i] = in.nextInt();
        }
        int brainMoney = in.nextInt();
        checkTheBill(itemNumbers, indexAnnaDontEat, costs, brainMoney);
//        checkTheBill(4, 1, new int[]{3, 10, 2, 9}, 7);
        in.close();
    }

    private static void checkTheBill(int itemNumbers, int indexAnnaDontEat, int[] costs, int brainMoney) {
        int sum = 0;
        for (int i = 0; i < itemNumbers; i++) {
            if (i != indexAnnaDontEat) sum += costs[i];
        }
        int halfSum = sum / 2;
        System.out.println((halfSum == brainMoney) ? "Bon Appetit" : brainMoney - halfSum);
    }

}
