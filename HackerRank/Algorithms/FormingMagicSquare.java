package algorithms;

import java.util.Scanner;

public class FormingMagicSquare {
    public static final int[][][] SQUARE = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int minCost = 100;

        for (int i = 0; i < 8; i++) {
            int cost = 0;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    cost += Math.abs(matrix[row][col] - SQUARE[i][row][col]);
                }
            }

            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);
    }

    private static int[][] readMatrix(Scanner scanner) {

        int[][] matrix = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
