package com.peters.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static long countInversions(int[] arr) {
        // Complete this function
        int counter = mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        return counter;
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int counter = 0;
        if (left >= right) return counter;
        int middle = (left + right) / 2;
        mergeSort(arr, temp, left, middle);
        mergeSort(arr, temp, middle + 1, right);
        counter += mergeHalves(arr, temp, left, right, counter);
        return counter;
    }

    private static int mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd, int counter) {
        System.out.println("counter start= " + counter);
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightStart - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
//        int counter = 0;
        while (left <= leftEnd && right <= rightEnd){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
            counter++;
        }
        System.out.println("counter = " + counter);
        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr,leftStart, size);
        return counter;
    }

    private static void swap(int[] array, int firstNumber, int secondNumber) {
        int tempNumber = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tempNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
        int t = 1;
        for (int a0 = 0; a0 < t; a0++) {
//            int n = in.nextInt();
            int[] arr = {1, 1, 1, 2, 2};
//            int[] arr = {2, 1, 3, 1, 2};
//            for (int arr_i = 0; arr_i < n; arr_i++) {
//                arr[arr_i] = in.nextInt();
//            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }
}
