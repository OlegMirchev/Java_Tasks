package javaTask;

import java.util.*;
import java.util.stream.Collectors;

public class JavaDequeue {
    public static int MAX_AMOUNT = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int size = Integer.parseInt(input[1]);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < (n + 1) - size; i++) {
            Set<Integer> uniqueNumbers = new HashSet<>();

            for (int j = i; j < size + i; j++) {
                uniqueNumbers.add(listOfNumbers.get(j));
            }

            MAX_AMOUNT = Math.max(MAX_AMOUNT, uniqueNumbers.size());
        }

        System.out.println(MAX_AMOUNT);
    }
}
