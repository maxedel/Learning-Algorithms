package com.peters.hackerrank.badge;

import java.util.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i : ar){
            if (map.get(i) == null){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(i, list);
            } else {
                map.get(i).add(i);
            }
        }
        return getMaxArraySize(map);
    }

    private static int getMaxArraySize(Map<Integer, List<Integer>> map) {
        int size = 0;
        int result = 0;
        for (Map.Entry<Integer, List<Integer>> integerListEntry : map.entrySet()) {
            int arraySize = integerListEntry.getValue().size();
            if (size < arraySize){
                size = arraySize;
                result = integerListEntry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
        int result = migratoryBirds(6, new int []{1, 4, 4, 4, 5, 3});
        System.out.println(result);
    }
}
