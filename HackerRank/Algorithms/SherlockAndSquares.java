package algorithms;

import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First solution!

        int q = Integer.parseInt(scanner.nextLine());

        while (q-- > 0) {
            int startRange = (int) Math.ceil(Math.sqrt(scanner.nextInt()));
            int endRange = (int) Math.floor(Math.sqrt(scanner.nextInt()));

            int countSquareIntegers = endRange - startRange + 1;

            System.out.println(countSquareIntegers);

        // Second solution!

//        int q = Integer.parseInt(scanner.nextLine());
//
//        while (q-- > 0) {
//            int startRange = scanner.nextInt();
//            int endRange = scanner.nextInt();
//
//            int countSquareIntegers = 0;
//
//            for (int i = startRange; i <= endRange; i++) {
//                double sqrt = Math.sqrt(i);
//
//                if (sqrt % 1 == 0) {
//                    countSquareIntegers++;
//                }
//            }
//
//            System.out.println(countSquareIntegers);
        }
    }
}
