package algorithms;

import java.util.*;

public class BetweenTwoSets {
    public static int NUMBERS = 0;
    public static int COUNT_NUMBER = 0;

    public static List<Integer> listOfDigit = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n + m; i++) {
            int numb = scanner.nextInt();
            listOfDigit.add(numb);
        }

        int startNumb = listOfDigit.get(n - 1);
        int endNumb = listOfDigit.get(n);

        int index = 0;

        for (int i = startNumb; i <= endNumb; i++) {
            while (index < n + m) {
                if (i > listOfDigit.get(index)) {
                    if (i % listOfDigit.get(index) == 0) {
                        NUMBERS++;
                    }
                } else {
                    if (listOfDigit.get(index) % i == 0) {
                        NUMBERS++;
                    }
                }

                index++;
            }

            if (NUMBERS == n + m) {
                COUNT_NUMBER++;
            }

            NUMBERS = 0;
            index = 0;
        }

        System.out.println(COUNT_NUMBER);
    }
}
