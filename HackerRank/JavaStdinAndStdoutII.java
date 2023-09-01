package javaTask;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double decimal = Double.parseDouble(scanner.nextLine());
        String text = scanner.nextLine();

        System.out.println("String: " + text);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + number);
    }
}
