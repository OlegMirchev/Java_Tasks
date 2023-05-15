package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {
    public static int BEST_RECORD = 0;
    public static int WORST_RECORD = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());

        int[] score = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int high = score[0];
        int low = score[0];

        for (int i = 1; i < games; i++) {
            if (high < score[i]) {
                high = score[i];

                BEST_RECORD++;
            }

            if (low > score[i]) {
                low = score[i];

                WORST_RECORD++;
            }
        }

        System.out.printf("%d %d", BEST_RECORD, WORST_RECORD);
    }
}
