package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {
    public static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            if (array[i] > MAX) {
                MAX = array[i];
            }
        }

        int result = MAX - k;

        System.out.println((MAX - k) > 0 ? result : 0);
    }
}
