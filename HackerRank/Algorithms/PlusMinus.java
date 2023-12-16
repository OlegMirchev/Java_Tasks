package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {
    public static int POSITIVE_NUMBS = 0;
    public static int NEGATIVE_NUMBS = 0;
    public static int ZERO_NUMBS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                POSITIVE_NUMBS++;
            }else if (arr[i] < 0) {
                NEGATIVE_NUMBS++;
            }else {
                ZERO_NUMBS++;
            }
        }

        System.out.printf("%.6f%n", POSITIVE_NUMBS * 1.00 / n);
        System.out.printf("%.6f%n", NEGATIVE_NUMBS * 1.00 / n);
        System.out.printf("%.6f", ZERO_NUMBS * 1.00 / n);
    }
}
