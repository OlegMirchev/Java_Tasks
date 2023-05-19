package algorithms;

import java.util.Scanner;

public class CountingValleys {
    public static int NUMB_OF_VALLEYS = 0;
    public static int NUMB_OF_STEPS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int step = Integer.parseInt(scanner.nextLine());

        String[] path = scanner.nextLine().split("");

        for (int i = 0; i < step; i++) {
            if (path[i].equals("U")) {
                NUMB_OF_STEPS++;

                if (NUMB_OF_STEPS == 0) {
                    NUMB_OF_VALLEYS++;
                }
            }else {
                NUMB_OF_STEPS--;
            }
        }

        System.out.println(NUMB_OF_VALLEYS);
    }
}
