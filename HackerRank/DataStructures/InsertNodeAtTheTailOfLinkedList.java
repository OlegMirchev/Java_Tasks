package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertNodeAtTheTailOfLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> digits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            digits.add(scanner.nextInt());
        }

        digits.forEach(System.out::println);
    }
}
