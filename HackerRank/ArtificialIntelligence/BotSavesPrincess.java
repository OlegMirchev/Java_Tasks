package artificial_Intelligence;

import java.util.Scanner;

public class BotSavesPrincess {
    public static int rowM = 0;
    public static int colM = 0;
    public static int rowP = 0;
    public static int colP = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = readMatrix(scanner, size);

        setBotAndPrincess(matrix);

        do {

            if (rowM > rowP) {
                rowM--;
                System.out.println("UP");
            }

            if (rowM < rowP) {
                rowM++;
                System.out.println("DOWN");
            }

            if (colM > colP) {
                colM--;
                System.out.println("LEFT");
            }

            if (colM < colP) {
                colM++;
                System.out.println("RIGHT");
            }

        } while (matrix[rowM][colM] != 'p');
    }

    private static char[][] readMatrix(Scanner scanner, int size) {

        char[][] matrix = new char[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine();

            matrix[row] = line.toCharArray();
        }

        return matrix;
    }

    private static void setBotAndPrincess(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'm') {
                    rowM = row;
                    colM = col;
                }

                if (matrix[row][col] == 'p') {
                    rowP = row;
                    colP = col;
                }
            }
        }
    }
}
