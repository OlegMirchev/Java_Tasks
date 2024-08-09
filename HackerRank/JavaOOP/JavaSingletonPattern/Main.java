package javaTask.JavaSingletonPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Singleton singleton = Singleton.getSingleInstance();

        singleton.printMessage(input);
    }
}
