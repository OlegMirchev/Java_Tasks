package javaTask.PrimeChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prime prime = new Prime();

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int digit = scanner.nextInt();

            arr[i] = digit;
        }

       prime.checkPrime(arr[0]);
       prime.checkPrime(arr[0], arr[1]);
       prime.checkPrime(arr[0], arr[1], arr[2]);
       prime.checkPrime(arr[0], arr[1], arr[2], arr[3], arr[4]);
    }
}
