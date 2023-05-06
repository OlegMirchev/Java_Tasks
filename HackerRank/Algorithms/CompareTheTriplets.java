package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTheTriplets {
    public static final int SIZE = 3;

    public static int POINTS_OF_ALICE = 0;
    public static int POINTS_OF_BOB = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alice = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] bob = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < SIZE; i++) {

            if (alice[i] > bob[i]) {
                POINTS_OF_ALICE++;
            }else if (alice[i] < bob[i]) {
                POINTS_OF_BOB++;
            }
        }

        System.out.printf("%d %d", POINTS_OF_ALICE, POINTS_OF_BOB);
    }
}
