package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    public static int COUNT_NUMBER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (n == 1 && m == 1) {
            for (int i = firstArr[0]; i <= secondArr[0]; i++) {
                if (secondArr[0] % i == 0) {
                    COUNT_NUMBER++;
                }
            }
        }
        else if (n < 2) {
            for (int i = firstArr[0]; i <= secondArr[0]; i++) {
                if (m > 2) {
                    if (i % firstArr[0] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0 && secondArr[2] % i == 0) {
                        COUNT_NUMBER++;
                    }
                } else {
                    if (i % firstArr[0] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0) {
                        COUNT_NUMBER++;
                    }
                }
            }
        }
        else if (n > 2) {
            for (int i = firstArr[2]; i <= secondArr[0]; i++) {
                if (m > 2) {
                    if (i % firstArr[0] == 0 && i % firstArr[1] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0 && secondArr[2] % i == 0) {
                        COUNT_NUMBER++;
                    }
                } else {
                    if (i % firstArr[0] == 0 && i % firstArr[1] == 0 && i % firstArr[2] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0) {
                        COUNT_NUMBER++;
                    }
                }
            }
        }
        else if (n > 1) {
            for (int i = firstArr[1]; i <= secondArr[0]; i++) {
                if (m > 2) {
                    if (i % firstArr[0] == 0 && i % firstArr[1] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0 && secondArr[2] % i == 0) {
                        COUNT_NUMBER++;
                    }
                } else {
                    if (i % firstArr[0] == 0 && i % firstArr[1] == 0 && secondArr[0] % i == 0 && secondArr[1] % i == 0) {
                        COUNT_NUMBER++;
                    }
                }
            }
        }

        System.out.println(COUNT_NUMBER);
    }
}
