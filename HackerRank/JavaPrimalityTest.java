package javaTask;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigInteger = new BigInteger(scanner.nextLine());

        boolean probablePrime = bigInteger.isProbablePrime(100);

        System.out.println(probablePrime ? "prime" : "not prime");
    }
}
