package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class DesignerPDFViewer {
    public static Scanner scanner = new Scanner(System.in);
    public static int MAX = Integer.MIN_VALUE;

    public static int[] HEIGHTS_OF_LETTER = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    public static String[] LETTER_ARR = scanner.nextLine().split("");

    public static void main(String[] args) {

        for (int i = 0; i < LETTER_ARR.length; i++) {
            char symbol = LETTER_ARR[i].charAt(0);

            int asciiCode = (int) symbol - 97;

            MAX = Math.max(MAX, HEIGHTS_OF_LETTER[asciiCode]);
        }

        System.out.println(MAX * LETTER_ARR.length);
    }
}
