package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class AVeryBigSum {
    public static long SUM_DIGIT = 0L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();

        Arrays.stream(arr).forEach(digit -> {
                   SUM_DIGIT += digit;
                });

        System.out.println(SUM_DIGIT);
    }
}
