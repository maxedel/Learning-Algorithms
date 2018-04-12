package com.peters.hackerrank.sorting;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] numbers = new int[arraySize];
                for (int i = 0; i < arraySize; i++) {
            numbers[i] = s.nextInt();
        }
        bubbleSort(numbers);
    }

    private static void bubbleSort(int[] numbers) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]){
                    swap(numbers, i, i + 1);
                    counter++;
                    isSorted = false;
                }
            }
        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length - 1] );
    }

    private static void swap(int[] array, int firstNumber, int secondNumber) {
        int tempNumber = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = tempNumber;
    }
}
