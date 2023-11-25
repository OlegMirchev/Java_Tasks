package javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegularExpression {
    public static final String REGEX = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
    public static final Pattern PATTERN = Pattern.compile(REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String username = scanner.nextLine();

            Matcher matcher = PATTERN.matcher(username);

            if (matcher.find()) {
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }
    }
}
