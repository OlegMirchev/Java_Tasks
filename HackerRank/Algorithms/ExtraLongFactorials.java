package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
       public static Scanner scanner = new Scanner(System.in);
       public static final int n = Integer.parseInt(scanner.nextLine());

       public static BigInteger FACTORIAL = BigInteger.ONE;

    public static void main(String[] args) {

        for (int i = 2; i <= n; i++) {
            FACTORIAL = FACTORIAL.multiply(BigInteger.valueOf(i));
        }

        System.out.println(FACTORIAL);
    }
}
