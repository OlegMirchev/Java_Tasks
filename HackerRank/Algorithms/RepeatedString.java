package algorithms;

import java.util.Scanner;

public class RepeatedString {
       public static Scanner scanner = new Scanner(System.in);
       public static String INPUT = scanner.nextLine();
       public static final long n = Long.parseLong(scanner.nextLine());

       public static long COUNT = 0;

    public static void main(String[] args) {

        if (weatherContainsA()) return;

        if (checkOfLength()) return;

        for (char symbol : INPUT.toCharArray()) {
            if (symbol == 'a') {
                COUNT++;
            }
        }

        COUNT = n / INPUT.length() * COUNT;

        long repeat = n % INPUT.length();

        for (int i = 0; i < repeat; i++) {
            if (INPUT.charAt(i) == 'a') {
                COUNT++;
            }
        }

        System.out.println(COUNT);
    }

    private static boolean weatherContainsA() {

        if (!INPUT.contains("a")) {
            System.out.println(0);

            return true;
        }
        return false;
    }

    private static boolean checkOfLength() {

        if (INPUT.length() == 1) {
            System.out.println(n);

            return true;
        }
        return false;
    }
}
