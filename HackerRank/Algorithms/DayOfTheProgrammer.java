package algorithms;

import java.util.Scanner;

public class DayOfTheProgrammer {
    public static int LEAP_YEAR;
    public static int OTHER_YEAR;
    public static int TRANSITION_YEAR;
    public static int PROGRAMMER_DAY = 256;
    public static int SUM_OF_TOTAL_NUMBERS_OF_DAYS_TRANSITION_YEAR = 31 + 15 + 31 + 30 + 31 + 30 + 31 + 31;
    public static int SUM_OF_TOTAL_NUMBERS_OF_DAYS_LEAP_YEAR = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
    public static int SUM_OF_TOTAL_NUMBERS_OF_DAYS_OTHER_YEAR = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());

        if (year == 1918) { // TRANSITION YEAR BETWEEN JULIAN_CALENDAR to the GREGORIAN_CALENDAR
            TRANSITION_YEAR = PROGRAMMER_DAY - SUM_OF_TOTAL_NUMBERS_OF_DAYS_TRANSITION_YEAR;

            System.out.printf("%d.09.%d", TRANSITION_YEAR, year);
        } else if (year >= 1700 && year <= 1917) { //  JULIAN_CALENDAR
            if (year % 4 == 0) {
                LEAP_YEAR = PROGRAMMER_DAY - SUM_OF_TOTAL_NUMBERS_OF_DAYS_LEAP_YEAR;

                System.out.printf("%d.09.%d", LEAP_YEAR, year);
            } else {
                OTHER_YEAR = PROGRAMMER_DAY - SUM_OF_TOTAL_NUMBERS_OF_DAYS_OTHER_YEAR;

                System.out.printf("%d.09.%d", OTHER_YEAR, year);
            }
        } else if (year >= 1919 && year <= 2700) { // GREGORIAN_CALENDAR
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                LEAP_YEAR = PROGRAMMER_DAY - SUM_OF_TOTAL_NUMBERS_OF_DAYS_LEAP_YEAR;

                System.out.printf("%d.09.%d", LEAP_YEAR, year);
            } else {
                OTHER_YEAR = PROGRAMMER_DAY - SUM_OF_TOTAL_NUMBERS_OF_DAYS_OTHER_YEAR;

                System.out.printf("%d.09.%d", OTHER_YEAR, year);
            }
        }
    }
}
