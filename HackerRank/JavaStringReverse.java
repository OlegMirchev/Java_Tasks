package javaTask;

import java.util.Scanner;

public class JavaStringReverse {
       public static Scanner scanner = new Scanner(System.in);
       public static String TEXT = scanner.nextLine();

    public static void main(String[] args) {
        StringBuilder reverseText = new StringBuilder();

        reverseText.append(TEXT).reverse();

        if (TEXT.equals(reverseText.toString().trim())) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
