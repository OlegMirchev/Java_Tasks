package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeleteNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> digits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int digit = Integer.parseInt(scanner.nextLine());

            digits.add(digit);
        }

        int index = Integer.parseInt(scanner.nextLine());

        digits.remove(index);

        System.out.println(digits.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
