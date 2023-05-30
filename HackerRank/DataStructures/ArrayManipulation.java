package DataStructures;

import java.util.Scanner;

public class ArrayManipulation {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] INPUT = scanner.nextLine().split("\\s+");

    public static int n = Integer.parseInt(INPUT[0]);
    public static int m = Integer.parseInt(INPUT[1]);

    public static int MAX_VALUE = Integer.MIN_VALUE;

    public static void main(String[] args) {

        int operations = m;

        int[][] matrix = new int[++m][++n];

        int index = 1;

        while (operations-- > 0) {

            String[] line = scanner.nextLine().split("\\s+");
            int startIndex = Integer.parseInt(line[0]);
            int endIndex = Integer.parseInt(line[1]);
            int sum = Integer.parseInt(line[2]);

            for (int row = index; row < m; row++) {
                for (int col = 1; col < n; col++) {
                    if (col >= startIndex && col <= endIndex) {
                        matrix[row][col] += sum;

                    }
                }
            }

            index++;
        }

        System.out.println(getMaxValueFromMatrix(matrix));
    }

    private static int getMaxValueFromMatrix(int[][] matrix) {

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                MAX_VALUE = Math.max(MAX_VALUE, matrix[row][col]);
            }
        }

        return MAX_VALUE;
    }
}
