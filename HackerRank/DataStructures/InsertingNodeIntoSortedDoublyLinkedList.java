package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertingNodeIntoSortedDoublyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());

            List<Integer> digits = new ArrayList<>();

            for (int i = 0; i < n + 1; i++) {
                int digit = Integer.parseInt(scanner.nextLine());

                digits.add(digit);
            }

            Collections.sort(digits);

            System.out.println(digits.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
