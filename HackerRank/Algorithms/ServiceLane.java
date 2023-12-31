package algorithms;

import java.util.Scanner;

public class ServiceLane {
    public static Scanner scanner = new Scanner(System.in);
    public static final int SIZE_OF_WIDTH = scanner.nextInt();
    public static final int CASES = scanner.nextInt();

    public static final int[] ARRAY = new int[SIZE_OF_WIDTH];

    public static void main(String[] args) {

        for (int i = 0; i < SIZE_OF_WIDTH; i++) {
            ARRAY[i] = scanner.nextInt();
        }

        for (int i = 0; i < CASES; i++) {
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();

            int width = Integer.MAX_VALUE;

            for (int j = startIndex; j <= endIndex; j++) {
                width = Math.min(width, ARRAY[j]);
            }

            System.out.println(width);
        }
    }
}
