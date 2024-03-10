package DataStructures;

import java.util.Scanner;

public class SparseArrays {
    public static Scanner scanner = new Scanner(System.in);

    public static int n = Integer.parseInt(scanner.nextLine());
    public static String[] LIST_STRING = readInput(scanner, n);
    public static int m = Integer.parseInt(scanner.nextLine());
    public static String[] QUERIES = readInput(scanner, m);

    public static void main(String[] args) {

        for (int i = 0; i < m; i++) {
            int countOccurs = 0;
            for (int j = 0; j < n; j++) {
                if (QUERIES[i].equals(LIST_STRING[j])) {
                    countOccurs++;
                }
            }

            System.out.println(countOccurs);
        }
    }

    private static String[] readInput(Scanner scanner, int size) {
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();

            arr[i] = input;
        }

        return arr;
    }
}
