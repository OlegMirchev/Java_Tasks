package algorithms;

import java.util.Scanner;

public class AngryProfessor {
       public static Scanner scanner = new Scanner(System.in);
       public static int t = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] arrivalTimes = readInput(n);

            for (int i = 0; i < n; i++) {
                if (arrivalTimes[i] <= 0){
                    k--;
                }
            }

            System.out.println(k <= 0 ? "NO" : "YES");
        }
    }

    private static int[] readInput(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
