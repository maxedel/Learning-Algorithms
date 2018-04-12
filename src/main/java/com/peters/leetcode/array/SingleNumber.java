package com.peters.leetcode.array;

import java.util.*;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
//        int arr[] = {2, 2, 1};
        int arr[] = {1, 1, 2, 2, 3, 4, 4};

        int n = new SingleNumber().singleNumber(arr);

        System.out.println("EDEL:n = " + n);
    }
}
