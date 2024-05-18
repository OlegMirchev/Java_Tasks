package javaTask;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            try {
                int n = scanner.nextInt();
                int p = scanner.nextInt();

                if (n == 0 && p == 0) {
                    throw new Exception("java.lang.Exception: n and p should not be zero.");
                }

                if (n < 0 || p < 0) {
                    throw new Exception("java.lang.Exception: n or p should not be negative.");
                }

                System.out.println((int) Math.pow(n, p));
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
