package algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static Scanner scanner = new Scanner(System.in);

    public static final int n = Integer.parseInt(scanner.nextLine());
    public static List<Integer> LIST_OF_NUMBERS = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

    public static int LENGTH_ARRAY = 0;

    public static void main(String[] args) {

        Collections.sort(LIST_OF_NUMBERS);

        for (int i = 0; i < n; i++) {
            int digit = LIST_OF_NUMBERS.get(i);
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                int nextDigit = LIST_OF_NUMBERS.get(j);

                if (Math.abs(digit - nextDigit) <= 1) {
                    count++;
                }
            }

            LENGTH_ARRAY = Math.max(LENGTH_ARRAY, count);
        }

        System.out.println(LENGTH_ARRAY);
    }
}