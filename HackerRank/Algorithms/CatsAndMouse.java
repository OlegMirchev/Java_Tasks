package algorithms;

import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {
            boolean isValid = true;

            String[] input = scanner.nextLine().split("\\s+");

            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int z = Integer.parseInt(input[2]);

            while (isValid) {

                x += x < z ? 1 : -1;
                y += y < z ? 1 : -1;

                if (x == z && y == z) {
                    isValid = false;
                    System.out.println("Mouse C");
                } else if (x == z) {
                    isValid = false;
                    System.out.println("Cat A");
                } else if (y == z) {
                    isValid = false;
                    System.out.println("Cat B");
                }
            }
        }
    }
}
