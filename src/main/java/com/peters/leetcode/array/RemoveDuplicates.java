package com.peters.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};

        int n = removeDuplicates(arr);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
