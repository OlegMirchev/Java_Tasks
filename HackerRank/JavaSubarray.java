package javaTask;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = Integer.parseInt(scanner.nextLine());
    public static int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static int COUNT_NEGATIVE_NUMBERS = 0;

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

                sum = arr[j] + sum;

                if (sum < 0) {
                    COUNT_NEGATIVE_NUMBERS++;
                }
            }
        }

        System.out.println(COUNT_NEGATIVE_NUMBERS);
    }
}
