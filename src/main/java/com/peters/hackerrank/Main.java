package com.peters.hackerrank;

public class Main {

    public static void main(String[] args) {
//        String ex = "Example one maxedel1234";
//        String regex = " ";
//        String[] split = ex.trim().split(regex);
//        int maxLenght = 0;
//        String result = null;
//        for (String s : split) {
//            System.out.println("s = " + s);
//            if (s.length() > maxLenght) {
//                maxLenght = s.length();
//                result = s;
//            }
//        }
//        System.out.println("result = " + result);
        String s = replaceNth("Vader said: No, I am your father!", 2, 'a', 'o');
        System.out.println("s = " + s);
    }

    public static String replaceNth(String text, int n, char oldValue, char newValue){
        if (n <= 0) return text;
        int counter = 0;
        char[] chars = text.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : chars){
            if(c == oldValue){
                counter++;
            }
            int i = counter % n;
            if(c == oldValue && i == 0){
                c = newValue;
            }
            result.append(c);
        }
        return String.valueOf(result);

    }

    public static int numberNeeded(String first, String second) {
        int counter1 = first.length();
        int counter2 = second.length();
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        for (char c : secondChar) {
            for (char c1 : firstChar) {
                if (c == c1) counter2--;
            }

        }
        for (char c : firstChar) {
            for (char c1 : secondChar) {
                if (c == c1) counter1--;
            }

        }
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2);
        return counter1+counter2;
    }
}
