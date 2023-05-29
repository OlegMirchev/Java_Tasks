package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTwoLinkedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());

            List<Integer> firstDigits = new ArrayList<>();
            List<Integer> secondDigits = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int digit = Integer.parseInt(scanner.nextLine());

                firstDigits.add(digit);
            }

            int m = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < m; i++) {
                int digit = Integer.parseInt(scanner.nextLine());

                secondDigits.add(digit);
            }

            System.out.println(compareToDigits(firstDigits, secondDigits));
        }
    }

    private static int compareToDigits(List<Integer> firstDigits, List<Integer> secondDigits) {

        if (firstDigits.size() != secondDigits.size()) {
            return 0;
        }

        boolean isValid = false;

        for (int i = 0; i < firstDigits.size(); i++) {
            if (firstDigits.get(i).equals(secondDigits.get(i))) {
                isValid = true;
            }else {
                isValid = false;
            }
        }

        if (isValid) {
            return 1;
        }else {
            return 0;
        }
    }
}
