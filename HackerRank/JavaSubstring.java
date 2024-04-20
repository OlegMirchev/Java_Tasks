package javaTask;

import java.util.Scanner;

public class JavaSubstring {
    public static int START_INDEX = 0;
    public static int END_INDEX = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] array = scanner.nextLine().split("\\s+");

        START_INDEX = Integer.parseInt(array[0]);
        END_INDEX = Integer.parseInt(array[1]);

        String result = text.substring(START_INDEX, END_INDEX);

        System.out.println(result);
    }
}
