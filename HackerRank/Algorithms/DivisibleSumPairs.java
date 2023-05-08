package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSumPairs {
    public static Scanner scanner = new Scanner(System.in);

    public static String[] INPUT = scanner.nextLine().split("\\s+");

    public static int n = Integer.parseInt(INPUT[0]);
    public static int k = Integer.parseInt(INPUT[1]);

    public static int COUNT_OF_PAIRS = 0;

    public static int[] ARRAY = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            int index = i;
            int pairs = 1;

            while (pairs++ < n - i) {

                if ((ARRAY[i] + ARRAY[index + 1]) % k == 0) {
                    COUNT_OF_PAIRS++;
                }

                index++;
            }
        }

        System.out.println(COUNT_OF_PAIRS);
    }
}
