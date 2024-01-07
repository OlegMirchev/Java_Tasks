package algorithms;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < matrix.length; row++) {
            int size = n;
            int col = 0;

            while (size-- > row + 1) {
                matrix[row][col] = ' ';

                col++;
            }

            while (col < matrix[row].length) {
                matrix[row][col] = '#';

                col++;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }

            System.out.println();
        }
    }
}
