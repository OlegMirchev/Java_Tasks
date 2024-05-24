package javaTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == 0) {
                throw new ArithmeticException();
            }

            System.out.println(x / y);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
