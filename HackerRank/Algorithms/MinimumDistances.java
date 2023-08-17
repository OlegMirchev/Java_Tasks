package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDistances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int indexI;
        int indexJ;

        int distance = Integer.MAX_VALUE;

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            int numb = array[i];

            for (int j = i + 1; j < n; j++) {
                if (numb == array[j]) {
                    indexI = i;
                    indexJ = j;

                    distance = Math.min(distance, Math.abs(indexI - indexJ));
                }
            }
        }

        if (distance == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(distance);
        }
    }
}
