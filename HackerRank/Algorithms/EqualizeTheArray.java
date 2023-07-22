package algorithms;

import java.util.*;

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] digits = new int[101];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            digits[number]++;

            max = Math.max(max, digits[number]);
        }

        System.out.println(n - max);
    }
}
