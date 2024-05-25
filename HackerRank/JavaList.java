package javaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaList {
    public static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DIGITS = getElements(scanner);

        int numberOfCommand = scanner.nextInt();

        for (int i = 1; i <= numberOfCommand; i++) {
            String command = scanner.next();

            if (command.equals("Insert")) {
                int index = scanner.nextInt();
                int element = scanner.nextInt();

                DIGITS.add(index, element);
            }

            if (command.equals("Delete")) {
                int index = scanner.nextInt();

                DIGITS.remove(index);
            }
        }

        System.out.println(DIGITS.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static List<Integer> getElements(Scanner scanner) {
        List<Integer> listOfElement = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();

            listOfElement.add(number);
        }

        return listOfElement;
    }
}
