package algorithms;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = scanner.nextInt();
            int height = 1;

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    height *= 2;
                }else {
                    height += 1;
                }
            }

            System.out.println(height);
        }
    }
}
