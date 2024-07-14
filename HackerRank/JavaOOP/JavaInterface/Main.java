package javaTask.JavaInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        AdvancedArithmetic myCalculator = new MyCalculator();
        int sumOfDivisors = myCalculator.divisorSum(n);

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sumOfDivisors);
    }
}
