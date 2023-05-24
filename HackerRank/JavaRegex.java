package javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    public static final String REGEX = "^(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}" +
            "|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while (scanner.hasNext()){
            String ip = scanner.nextLine();

            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(ip);

            if (matcher.find()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
