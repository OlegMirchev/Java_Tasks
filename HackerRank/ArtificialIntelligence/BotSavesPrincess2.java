package artificial_Intelligence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotSavesPrincess2 {
       public static Scanner scanner = new Scanner(System.in);

       public static int SIZE = Integer.parseInt(scanner.nextLine());
       public static String[] INPUT = scanner.nextLine().split("\\s+");

       public static int rowM = Integer.parseInt(INPUT[0]);
       public static int colM = Integer.parseInt(INPUT[1]);

       public static int rowP = 0;
       public static int colP = 0;

       public static char[][] MATRIX = readMatrix(scanner, SIZE);

    public static void main(String[] args) {

        List<String> output = new ArrayList<>();

        setPrincess(MATRIX);

        do {

            if (rowM > rowP) {
                rowM--;
                output.add("UP");
            }

            if (rowM < rowP) {
                rowM++;
                output.add("DOWN");
            }

            if (colM > colP) {
                colM--;
                output.add("LEFT");
            }

            if (colM < colP) {
                colM++;
                output.add("RIGHT");
            }

        } while (MATRIX[rowM][colM] != 'p');

        System.out.println(output.get(output.size() - 1));

    }

    private static char[][] readMatrix(Scanner scanner, int size) {

        char[][] matrix = new char[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine();

            matrix[row] = line.toCharArray();
        }

        return matrix;
    }

    private static void setPrincess(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'p') {
                    rowP = row;
                    colP = col;
                }
            }
        }
    }
}
