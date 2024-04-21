package javaTask;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String SMALLEST = "text";
    public static String LARGEST = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int index = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < text.length(); i++) {
            if (index + i > text.length()) {
                break;
            }

            String word1 = text.substring(i, index + i);

            for (int j = 0; j < text.length(); j++) {
                if (index + j > text.length()) {
                    break;
                }

                String word2 = text.substring(j, index + j);

                if (LARGEST.compareTo(word1) < 0) {
                    LARGEST = word1;
                }
                if (word2.compareTo(SMALLEST) < 0) {
                    SMALLEST = word2;
                }
            }
        }

        System.out.println(SMALLEST);
        System.out.println(LARGEST);
    }
}
