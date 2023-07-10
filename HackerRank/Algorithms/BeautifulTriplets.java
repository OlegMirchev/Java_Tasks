package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BeautifulTriplets {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(input[1]);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (Integer number : listOfNumbers) {
            if (listOfNumbers.contains(number + k) && listOfNumbers.contains(number + (k * 2))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
