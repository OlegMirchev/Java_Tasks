package DataStructures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LeftRotation {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] INPUT = scanner.nextLine().split("\\s+");

    public static final int n = Integer.parseInt(INPUT[0]);
    public static final int d = Integer.parseInt(INPUT[1]);

    public static List<Integer> LIST_OF_DIGIT = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

    public static int INDEX = 0;

    public static void main(String[] args) {

        for (int i = 0; i < d; i++) {
            int digit = LIST_OF_DIGIT.get(INDEX);

            LIST_OF_DIGIT.remove(INDEX);
            LIST_OF_DIGIT.add(n - 1, digit);
        }

        System.out.println(LIST_OF_DIGIT.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
