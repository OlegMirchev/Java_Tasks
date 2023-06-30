package algorithms;

import java.util.*;

public class CircularArrayRotation {
    public static Scanner scanner = new Scanner(System.in);
    public static int n = scanner.nextInt();
    public static int k = scanner.nextInt();
    public static int q = scanner.nextInt();

    public static List<Integer> DIGITS = new ArrayList<>();
    public static List<Integer> INDEX = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            DIGITS.add(scanner.nextInt());
        }

        for (int i = 0; i < q; i++) {
            INDEX.add(scanner.nextInt());
        }

        for (int i = 1; i <= k; i++) {
            int number = DIGITS.remove(DIGITS.size() - 1);

            DIGITS.add(0, number);
        }

        for (Integer index : INDEX) {
            System.out.println(DIGITS.get(index));
        }
    }
}
