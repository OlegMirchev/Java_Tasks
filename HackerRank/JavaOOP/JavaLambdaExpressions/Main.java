package javaTask.JavaLambdaExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int numbCondition = scanner.nextInt();
            int number = scanner.nextInt();

            switch (numbCondition) {
                case 1 -> {
                    OddOrEven oddOrEven = new OddOrEven();
                    oddOrEven.isOddNumber(number);
                }

                case 2 -> {
                    PrimeOrComposite primeOrComposite = new PrimeOrComposite();
                    primeOrComposite.isPrimeNumber(number);
                }

                case 3 -> {
                    Palindrome palindrome = new Palindrome();
                    palindrome.isPalindromeNumber(number);
                }
            }
        }
    }
}
