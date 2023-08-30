package algorithms;

import java.util.Scanner;

public class NumberLineJumps {
    public static Scanner scanner = new Scanner(System.in);

    public static String[] INPUT = scanner.nextLine().split("\\s+");

    public static void main(String[] args) {

        int x1 = Integer.parseInt(INPUT[0]);
        int v1 = Integer.parseInt(INPUT[1]);
        int x2 = Integer.parseInt(INPUT[2]);
        int v2 = Integer.parseInt(INPUT[3]);

        int jumps = v1 * x2;

        for (int i = 0; i < jumps; i++) {
            if (x1 + (v1 * i) == x2 + (v2 * i)) {
                System.out.println("YES");

                return;
            }
        }

        System.out.println("NO");
    }
}
