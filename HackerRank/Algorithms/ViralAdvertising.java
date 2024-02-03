package algorithms;

import java.util.Scanner;

public class ViralAdvertising {
    public static int LIKES = 2;
    public static double PEOPLE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < day; i++) {
            double cumulativeLike = Math.floor(PEOPLE / 2) * 3;

            LIKES += Math.floor(cumulativeLike / 2);

            PEOPLE = cumulativeLike;
        }

        System.out.println(LIKES);
    }
}
