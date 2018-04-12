import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
//        int result = 0;
//        int n = numbers.length;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                if (numbers[i] * numbers[j] > result) {
//                    result = numbers[i] * numbers[j];
//                }
//            }
//        }
//        System.out.println("EDEL: numbers=" + Arrays.toString(numbers));
//        long[] longs = Arrays.stream(numbers)
//                .sorted()
//                .mapToLong(s -> s)
//                .toArray();
        //        System.out.println("EDEL: ints=" + Arrays.toString(longs));
//        System.out.println("sum = " + sum);
//        return longs[longs.length - 1] * longs[longs.length - 2];
        return 0;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
//        int[] numbers = {2, 9, 3, 1, 9};
        System.out.println(getMaxPairwiseProduct(numbers));
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