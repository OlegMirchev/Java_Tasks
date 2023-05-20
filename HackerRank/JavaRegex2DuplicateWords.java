package javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static final String REGEX = "(\\b\\w+)(\\W+\\1\\b)+";
    public static final Pattern PATTERN = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();

            Matcher matcher = PATTERN.matcher(text);

            while (matcher.find()) {
                text = text.replace(matcher.group(0), matcher.group(1));
            }

            System.out.println(text);
        }
    }
}
