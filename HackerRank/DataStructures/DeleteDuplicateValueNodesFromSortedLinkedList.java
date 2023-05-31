package DataStructures;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteDuplicateValueNodesFromSortedLinkedList {
       public static Scanner scanner = new Scanner(System.in);
       public static int t = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());

            Set<Integer> digits = new LinkedHashSet<>();

            for (int i = 0; i < n; i++) {
                int digit = Integer.parseInt(scanner.nextLine());

                digits.add(digit);
            }

            System.out.println(digits.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
