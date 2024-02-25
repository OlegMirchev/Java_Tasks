package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n--> 0) {
            int elements = Integer.parseInt(scanner.nextLine());

            List<Integer> digits = new ArrayList<>();

            for (int i = 0; i < elements; i++) {
                int digit = Integer.parseInt(scanner.nextLine());

                digits.add(digit);
            }

            Collections.reverse(digits);
            System.out.println(digits.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
