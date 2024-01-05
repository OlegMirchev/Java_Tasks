package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {
    public static int SUM = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < size; i++) {
            SUM += arr[i];
        }

        System.out.println(SUM);
    }
}
