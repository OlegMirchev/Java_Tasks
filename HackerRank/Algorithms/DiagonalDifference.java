package algorithms;

import java.util.Scanner;

public class DiagonalDifference {
    public static int RIGHT_DIAGONALS = 0;
    public static int LEFT_DIAGONALS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(scanner, n);

        RIGHT_DIAGONALS = sumOfRight(matrix, n);

        LEFT_DIAGONALS = sumOfLeft(matrix, n);

        System.out.println(Math.abs(RIGHT_DIAGONALS - LEFT_DIAGONALS));
    }

    private static int[][] readMatrix(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        return matrix;
    }

    private static int sumOfRight(int[][] matrix, int n) {
        int result = 0;

        int row = 0;
        int col = 0;

        while (n-- > 0) {
            result += matrix[row++][col++];
        }

        return result;
    }

    private static int sumOfLeft(int[][] matrix, int n) {
        int result = 0;

        int row = 0;
        int col = matrix[row].length - 1;

        while (n-- > 0) {
            result += matrix[row++][col--];
        }

        return result;
    }
}
