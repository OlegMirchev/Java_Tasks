package algorithms;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            String[] splitNumb = String.valueOf(digit).split("");

            int countDivisors = 0;

            for (String numb : splitNumb) {
                int divide = Integer.parseInt(numb);

                if (divide == 0) {
                    continue;
                } else if (digit % divide == 0) {
                    countDivisors++;
                }
            }

            System.out.println(countDivisors);
        }
    }
}
