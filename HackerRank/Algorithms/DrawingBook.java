package algorithms;

import java.util.Scanner;

public class DrawingBook {
    public static int START_PAGE = 0;
    public static int END_PAGE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        START_PAGE = p / 2;

        END_PAGE = (n - p) / 2;

        if (n % 2 == 0 && p + 1 == n) {
            END_PAGE++;
        }

        System.out.println(Math.min(START_PAGE, END_PAGE));
    }
}
