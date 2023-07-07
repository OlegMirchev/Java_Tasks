package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
    public static Scanner scanner = new Scanner(System.in);
    public static int t = Integer.parseInt(scanner.nextLine());

    public static List<Integer> FIRST_LINKED_LIST = new ArrayList<>();
    public static List<Integer> SECOND_LINKED_LIST = new ArrayList<>();

    public static void main(String[] args) {

        while (t-- > 0) {
            List<Integer> listResult = new ArrayList<>();

            int n = Integer.parseInt(scanner.nextLine());
            FIRST_LINKED_LIST = readInput(n);

            int m = Integer.parseInt(scanner.nextLine());
            SECOND_LINKED_LIST = readInput(m);

            listResult.addAll(FIRST_LINKED_LIST);
            listResult.addAll(SECOND_LINKED_LIST);

            Collections.sort(listResult);

            for (Integer digit : listResult) {
                System.out.print(digit + " ");
            }

            System.out.println();
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
