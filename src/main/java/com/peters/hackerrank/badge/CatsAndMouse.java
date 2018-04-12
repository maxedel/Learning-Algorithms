package com.peters.hackerrank.badge;

public class CatsAndMouse {

    static String[] catAndMouse(int x, int y, int z) {
        // Complete this function
        int catA = Math.abs(z - x);
        System.out.println("catA = " + catA);
        int catB = Math.abs(y - x);
        System.out.println("catB = " + catB);
        if (catB - catA > 0) return new String[]{"Cat A"};
        else if (catB - catA < 0) return new String[]{"Cat B"};
        else return new String[]{"Mouse C"};
    }

    public static void main(String[] args) {
        int abs = Math.abs(-45);
        System.out.println("abs = " + abs);
    }
}
