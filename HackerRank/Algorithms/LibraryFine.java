package algorithms;

import java.util.Scanner;

public class LibraryFine {
    public static int PENALTY = 0;
    public static int LATE_DAYS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int returnedDay = scanner.nextInt(), returnedMonth = scanner.nextInt(), returnedYear = scanner.nextInt();
        int dueDay = scanner.nextInt(), dueMonth = scanner.nextInt(), dueYear = scanner.nextInt();

        if (returnedDay > dueDay && returnedMonth == dueMonth && returnedYear == dueYear) {
            LATE_DAYS = returnedDay - dueDay;

            PENALTY = 15;
        }else if (returnedMonth > dueMonth && returnedYear == dueYear) {
            LATE_DAYS = returnedMonth - dueMonth;

            PENALTY = 500;
        }else if (returnedYear > dueYear) {
            LATE_DAYS = returnedYear - dueYear;

            PENALTY = 10000;
        }

        int amountOfFine = LATE_DAYS * PENALTY;

        System.out.println(amountOfFine == 0 ? PENALTY : amountOfFine);
    }
}
