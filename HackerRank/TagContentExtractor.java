package javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static final String REGEX = "<(.+)>(([^<>]+))</\\1>";
    public static final Pattern PATTERN = Pattern.compile(REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();

            Matcher matcher = PATTERN.matcher(text);

            boolean isValid = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));

                isValid = true;
            }

            if (!isValid) {
                System.out.println("None");
            }
        }
    }
}
