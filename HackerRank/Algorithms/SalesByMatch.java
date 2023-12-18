package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static int PAIRS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> colorSocks = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            int number = colorSocks.get(i);

            if (colorSocks.get(i) == 0) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (number == colorSocks.get(j)) {
                    colorSocks.set(i, 0);
                    colorSocks.set(j, 0);
                    PAIRS++;
                    break;
                }
            }
        }

        System.out.println(PAIRS);
    }
}
