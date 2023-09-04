package algorithms;

import java.util.Scanner;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[][] matrix = readMatrix(scanner, n);

            int result = 0;

            for (int row = 0; row < matrix.length; row++) {
                int balls = 0, capacity = 0;

                for (int col = 0; col < matrix[row].length; col++) {
                    balls += matrix[row][col];
                    capacity += matrix[col][row];
                }

                result ^= balls ^ capacity;
            }

            System.out.println(result == 0 ? "Possible" : "Impossible");
        }
    }

    private static int[][] readMatrix(Scanner scanner, int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
