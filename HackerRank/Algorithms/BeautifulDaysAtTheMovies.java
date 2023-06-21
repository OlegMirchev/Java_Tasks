package algorithms;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static Scanner scanner = new Scanner(System.in);

    public static int START_DAY = scanner.nextInt();
    public static int END_DAY = scanner.nextInt();
    public static int DIVISOR = scanner.nextInt();

    public static int COUNT_BEAUTIFUL_DAYS = 0;

    public static void main(String[] args) {

        for (int day = START_DAY; day <= END_DAY; day++) {
            int reverseNumber = getReverseNumber(day);

            double number = Math.abs(day - reverseNumber);
            double calculationDay = number / DIVISOR;

            if (calculationDay % 1 == 0) {
                COUNT_BEAUTIFUL_DAYS++;
            }
        }

        System.out.println(COUNT_BEAUTIFUL_DAYS);
    }

    private static int getReverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            reverse = reverse * 10 + lastDigit;

            number /= 10;
        }

        return reverse;
    }
}
