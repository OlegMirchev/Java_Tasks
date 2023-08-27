package algorithms;

import java.util.Scanner;

public class NonDivisibleSubset {
       public static Scanner scanner = new Scanner(System.in);
       public static final int n = scanner.nextInt();
       public static final int k = scanner.nextInt();

    public static void main(String[] args) {

        int[] array = new int[n + 3];

        for (int i = 1; i <= n; i++) {
            int numb = scanner.nextInt();

            array[numb % k]++;
        }

        int maxCountOfSubset = Math.min(array[0], 1);

        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                maxCountOfSubset += Math.max(array[i], array[k - i]);
            } else if (array[i] > 0) {
                maxCountOfSubset++;
            }
        }

        System.out.println(maxCountOfSubset);
    }
}
