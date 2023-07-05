package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] grid = readGrid(scanner, n);

        for (int row = 1; row < grid.length - 1; row++) {
            for (int col = 1; col < grid[row].length - 1; col++) {

                if (isMaxElement(grid, row, col)) {
                    grid[row][col] = 0;
                }
            }
        }

        printGrid(grid);
    }

    private static int[][] readGrid(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = numbers[col];
            }
        }

        return matrix;
    }

    private static void printGrid(int[][] grid) {

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(grid[row][col]);
                }
            }

            System.out.println();
        }
    }

    public static boolean isMaxElement(int[][] grid, int row, int col) {
        int max = Math.max(Math.max(grid[row - 1][col], grid[row + 1][col]), Math.max(grid[row][col - 1], grid[row][col + 1]));

        return max < grid[row][col] && (grid[row - 1][col] != 0 && grid[row + 1][col] != 0 && grid[row][col - 1] != 0 && grid[row][col + 1] != 0);
    }
}