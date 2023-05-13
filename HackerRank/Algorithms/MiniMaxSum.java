package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static Scanner scanner = new Scanner(System.in);

    public static long MAX = 0L;
    public static long MIN = 1000000000000000000L;

    public static int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static long SUM = 0L;
    public static int INDEX = 0;

    public static int n = array.length;

    public static void main(String[] args) {

        while (n-- > 0) {

            for (int i = 0; i < array.length; i++) {
                if (i != INDEX) {
                    SUM += array[i];
                }
            }

            if (MAX <= SUM) {
                MAX = SUM;
            }

            if (MIN > SUM) {
                MIN = SUM;
            }

            SUM = 0;
            INDEX++;
        }

        System.out.println(MIN + " " + MAX);
    }
}
