package javaTask.JavaAbstractClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        MyBook myBook = new MyBook();

        myBook.setTitle(input);
    }
}
