package DataStructures;

import java.util.Scanner;

public class BalancedBrackets {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            int length = n >= 1000 ? input.length() / 3 : input.length() / 2;

            for (int j = 0; j < length; j++) {
                do {
                    input = input.replaceAll("\\(\\)", "");

                } while (input.contains("()"));

                do {
                    input = input.replaceAll("\\[\\]", "");

                } while (input.contains("[]"));

                do {
                    input = input.replaceAll("\\{\\}", "");

                } while (input.contains("{}"));
            }

            System.out.println(input.isEmpty() ? "YES" : "NO");
        }
    }
}
