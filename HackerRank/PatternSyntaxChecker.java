package javaTask;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String regex = scanner.nextLine();

            try {
                Pattern pattern = Pattern.compile(regex);
                System.out.println("Pattern: " + pattern + " is Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Pattern: " + regex + " is Invalid");
            }
        }
    }
}
