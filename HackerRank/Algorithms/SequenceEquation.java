package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SequenceEquation {
    public static int SEQUENCE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> digits = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (n-- > 0) {
            SEQUENCE++;

            int indexOfX = digits.indexOf(SEQUENCE);
            int indexOfP = digits.indexOf(++indexOfX);

            System.out.println(++indexOfP);
        }
    }
}
