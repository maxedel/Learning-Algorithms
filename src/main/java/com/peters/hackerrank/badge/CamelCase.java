package com.peters.hackerrank.badge;

import java.util.Scanner;

public class CamelCase {

    static int camelcase(String s) {
        // Complete this function
        char[] words = s.toCharArray();
        int result = 1;
//        for (char letter : words){
//            if (letter.)
//        }
        char[] chars = s.toLowerCase().toCharArray();
        for (char aChar : chars) {
//            if (s.contains())
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
