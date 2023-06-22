package javaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java1DArray {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = Integer.parseInt(scanner.nextLine());

    public static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            DIGITS.add(number);
        }

        DIGITS.forEach(System.out::println);
    }
}
