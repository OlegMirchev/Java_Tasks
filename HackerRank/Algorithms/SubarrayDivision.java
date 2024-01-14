package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayDivision {
    public static Scanner scanner = new Scanner(System.in);

    public static int SQUARES = Integer.parseInt(scanner.nextLine());

    public static int[] PIECES = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static int DAY = scanner.nextInt();
    public static int MONTH = scanner.nextInt();

    public static void main(String[] args) {

        int sum = 0;
        int countBar = 0;

        for (int i = 0; i < SQUARES; i++) {
            int index = i;
            int n = 0;

            while (n++ < MONTH) {
                if (index + 1 == SQUARES) {
                    sum += PIECES[index];
                    break;
                } else {
                    sum += PIECES[index++];
                }
            }

            if (sum == DAY) {
                countBar++;
            }

            sum = 0;
        }

        System.out.println(countBar);
    }
}
