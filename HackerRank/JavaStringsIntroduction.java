package javaTask;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static int SUM_STRINGS = 0;
    public static String COMPARE_STRINGS = "";
    public static String CONCAT_STRINGS = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        modifiedString(a, b);

        System.out.println(SUM_STRINGS);
        System.out.println(COMPARE_STRINGS);
        System.out.println(CONCAT_STRINGS);
    }

    private static void modifiedString(String a, String b) {

        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);

        int compare = a.compareTo(b);

        SUM_STRINGS = a.length() + b.length();

        if (compare > 0) {
            COMPARE_STRINGS = "Yes";
        }else {
            COMPARE_STRINGS = "No";
        }

        CONCAT_STRINGS = a + " " + b;
    }
}
