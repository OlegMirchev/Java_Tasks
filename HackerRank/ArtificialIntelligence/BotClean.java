package artificial_Intelligence;

import java.util.Scanner;

public class BotClean {
    public static Integer rowD = 0;
    public static Integer colD = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rowB = Integer.parseInt(input[0]);
        int colB = Integer.parseInt(input[1]);

        char[][] matrix = readMatrix(scanner);

        for (int i = 0; i < 25; i++) {

            setDirtyCell(matrix);

            if (rowD == null && colD == null) {
                break;
            }

            while (rowD != null && colD != null) {

                matrix[rowB][colB] = '-';

                if (rowB > rowD) {
                    rowB--;
                    System.out.println("UP");

                    if (cleanDirtyCell(rowB, colB, matrix)) break;
                }

                if (rowB < rowD) {
                    rowB++;
                    System.out.println("DOWN");

                    if (cleanDirtyCell(rowB, colB, matrix)) break;
                }

                if (colB > colD) {
                    colB--;
                    System.out.println("LEFT");

                    if (cleanDirtyCell(rowB, colB, matrix)) break;
                }

                if (colB < colD) {
                    colB++;
                    System.out.println("RIGHT");

                    if (cleanDirtyCell(rowB, colB, matrix)) break;
                }
            }
        }
    }

    private static char[][] readMatrix(Scanner scanner) {

        char[][] matrix = new char[5][5];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine();

            matrix[row] = line.toCharArray();
        }

        return matrix;
    }

    private static void setDirtyCell(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            rowD = null;
            colD = null;

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'd') {
                    rowD = row;
                    colD = col;

                    return;
                }
            }
        }
    }

    private static boolean cleanDirtyCell(int rowB, int colB, char[][] matrix) {
        if (matrix[rowB][colB] == 'd') {
            System.out.println("CLEAN");

            matrix[rowB][colB] = 'b';

            return true;
        }

        return false;
    }
}
