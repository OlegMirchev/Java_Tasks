package javaTask;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
       public static Scanner scanner = new Scanner(System.in);

       public static BigInteger a = new BigInteger(String.valueOf(scanner.nextLine()));
       public static BigInteger b = new BigInteger(String.valueOf(scanner.nextLine()));

    public static void main(String[] args) {

        BigInteger sumInteger = a.add(b);
        BigInteger multiplyInteger = a.multiply(b);

        System.out.println(sumInteger);
        System.out.println(multiplyInteger);
    }
}
