package javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static StringBuilder OUTPUT = new StringBuilder();
    public static int COUNT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            COUNT++;

            OUTPUT.append(matcher.group()).append(System.lineSeparator());
        }

        System.out.println(COUNT);

        System.out.println(OUTPUT.toString().trim());
    }
}
