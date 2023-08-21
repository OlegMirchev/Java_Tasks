package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static List<Long> KAPREKAR_NUMBERS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        for (int startNumb = n; startNumb <= q; startNumb++) {
            long powNumber = (long) Math.pow(startNumb, 2);
            long lastNumb = 0L;

            String value = String.valueOf(powNumber);

            if (powNumber == 1) {
                KAPREKAR_NUMBERS.add(powNumber);
                continue;
            } else if (value.length() == 1) {
                continue;
            } else if (value.length() == 2) {
                lastNumb = powNumber % 10;
                powNumber /= 10;
            } else if (value.length() == 4) {
                lastNumb = powNumber % 100;
                powNumber /= 100;
            } else if (value.length() == 5 || value.length() == 6) {
                lastNumb = powNumber % 1000;
                powNumber /= 1000;
            } else if (value.length() == 7 || value.length() == 8) {
                lastNumb = powNumber % 10000;
                powNumber /= 10000;
            } else if (value.length() == 9 || value.length() == 10) {
                lastNumb = powNumber % 100000;
                powNumber /= 100000;
            }

            long result = powNumber + lastNumb;

            if (result == startNumb) {
                KAPREKAR_NUMBERS.add(result);
            }
        }

        if (KAPREKAR_NUMBERS.isEmpty()) {
            System.out.print("INVALID RANGE");
        } else {
            KAPREKAR_NUMBERS.forEach(d -> System.out.print(d + " "));
        }
    }
}
