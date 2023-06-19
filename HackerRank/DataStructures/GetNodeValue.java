package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetNodeValue {
    public static Scanner scanner = new Scanner(System.in);
    public static int t = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        while (t-- > 0) {

            int n = Integer.parseInt(scanner.nextLine());
            List<Integer> digits = readInput(n);

            int index = Integer.parseInt(scanner.nextLine());

            Collections.reverse(digits);

            System.out.println(digits.get(index));
        }
    }

    private static List<Integer> readInput(int size) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int digit = Integer.parseInt(scanner.nextLine());

            numbers.add(digit);
        }

        return numbers;
    }
}
