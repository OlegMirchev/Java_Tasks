package algorithms;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    public static Scanner scanner = new Scanner(System.in);
    public static int n = scanner.nextInt();
    public static int k = scanner.nextInt();

    public static int ENERGY_LEVEL = 100;
    public static int INDEX = 0;

    public static void main(String[] args) {

        int[] array = readInput();

        do {
            ENERGY_LEVEL--;
            INDEX = (INDEX + k) % n;

            if (array[INDEX] == 1) {
                ENERGY_LEVEL -= 2;
            }
        } while (INDEX != 0);

        System.out.println(ENERGY_LEVEL);
    }

    private static int[] readInput() {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
