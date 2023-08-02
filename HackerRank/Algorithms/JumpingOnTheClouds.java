package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnTheClouds {
       public static Scanner scanner = new Scanner(System.in);
       public static final int n = Integer.parseInt(scanner.nextLine());
       public static int[] CLOUD = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static void main(String[] args) {

        int jumps = calculateCumulus();

        System.out.println(jumps);
    }

    private static int calculateCumulus() {
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i + 2 > CLOUD.length - 1) {
                if (CLOUD[i] == 0 && CLOUD[i + 1] == 0) {
                    count++;
                }

                break;
            }

            if (CLOUD[i] == 0 && CLOUD[i + 1] == 0 && CLOUD[i + 2] == 0) {
                count++;
                i++;

                if (i + 1 == CLOUD.length - 1) {
                    break;
                }
            } else if (CLOUD[i] == 0 && CLOUD[i + 2] == 0) {
                count++;
            } else if (CLOUD[i] == 0 && CLOUD[i + 1] == 0) {
                count++;
            }
        }

        return count;
    }
}
