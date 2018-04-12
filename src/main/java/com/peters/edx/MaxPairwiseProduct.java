package com.peters.edx;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class MaxPairwiseProduct {
    static int getMaxPairwiseProductSlow(int[] numbers) {
        int result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    static long getMaxPairwiseProductFast(int[] numbers) {
/*        long largestNumber = 0;
        for (int number : numbers) {
            if (number > largestNumber) largestNumber = number;
        }

        long secondLargestNumber = 0;
        for (int number : numbers) {
            if (number > secondLargestNumber && largestNumber != number) secondLargestNumber = number;
        }
        return largestNumber * secondLargestNumber;*/
        List<Long> list = Arrays.stream(numbers)
                .sorted()
                .mapToLong(s -> (long) s)
                .boxed()
                .collect(Collectors.toList());
        return list.size() >= 2 ? list.get(list.size() - 1) * list.get(list.size() - 2) : 0;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//        double n = Math.random();
//        for (int i = 0; i < n; i++) {
//            nimbe
//        }

/*        while (true){
            Random r = new Random();
             int n = r.ints(0, 6).limit(1).findFirst().getAsInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = r.ints(0, (500 + 1)).limit(1).findFirst().getAsInt();
            }
            System.out.println("numbers = " + Arrays.toString(numbers));
            int maxPairwiseProductSlow = getMaxPairwiseProductSlow(numbers);
            long maxPairwiseProductFast = getMaxPairwiseProductFast(numbers);
            System.out.println(maxPairwiseProductSlow + ", " + maxPairwiseProductFast + ", diif =" + (maxPairwiseProductSlow - maxPairwiseProductFast));
            if (maxPairwiseProductFast == maxPairwiseProductSlow) System.out.println("OK");
            else{
                System.out.println("Wrong: " + maxPairwiseProductFast + " !=  " + maxPairwiseProductSlow);
                return;
            }
        }*/
        int[] numbers = {100000, 90000};
        System.out.println(getMaxPairwiseProductSlow(numbers));
        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
