package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {
    public static int TALLEST_CANDLE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> candles = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            if (TALLEST_CANDLE < candles.get(i)) {
                TALLEST_CANDLE = candles.get(i);
            }
        }

        List<Integer> listOfTallestCandles = candles.stream().filter(digit -> digit == TALLEST_CANDLE).collect(Collectors.toList());

        System.out.println(listOfTallestCandles.size());
    }
}
