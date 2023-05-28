package DataStructures;

import java.util.Scanner;

public class Array2DS {
    public static int HOURGLASS_OF_ROW = 4;
    public static int MAX_HOURGLASS = Integer.MIN_VALUE;

    public static int NEXT_ROW = 0;
    public static int NEXT_COL = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        maxSumOfHourglass(matrix);

        System.out.println(MAX_HOURGLASS);
    }

    private static int[][] readMatrix(Scanner scanner) {

        int[][] matrix = new int[6][6];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static void maxSumOfHourglass(int[][] matrix) {

        while (NEXT_ROW != HOURGLASS_OF_ROW) {
            NEXT_COL = 0;

            while (NEXT_COL != HOURGLASS_OF_ROW) {
                int sumOfHourglass = 0;

                for (int row = NEXT_ROW; row < 3 + NEXT_ROW; row++) {
                    for (int col = NEXT_COL; col < 3 + NEXT_COL; col++) {
                        if (row == NEXT_ROW + 1) {
                            sumOfHourglass += matrix[row][col + 1];

                            break;
                        }

                        sumOfHourglass += matrix[row][col];
                    }
                }

                NEXT_COL++;
                MAX_HOURGLASS = Math.max(MAX_HOURGLASS, sumOfHourglass);
            }

            NEXT_ROW++;
        }
    }
}
