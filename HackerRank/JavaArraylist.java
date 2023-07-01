package javaTask;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = input;
        }

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y < matrix[x - 1].length) {
                int digit = matrix[x - 1][y];

                System.out.println(digit);
            }else {
                System.out.println("ERROR!");
            }

//          Second solution: For finding on such position or not!

//            try {
//                int digit = matrix[x - 1][y];
//
//                System.out.println(digit);
//            } catch (ArrayIndexOutOfBoundsException ex) {
//                System.out.println("ERROR!");
//            }
        }
    }
}
