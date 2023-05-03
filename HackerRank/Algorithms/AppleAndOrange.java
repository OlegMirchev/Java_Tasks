package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputST = scanner.nextLine().split("\\s+");

        int s = Integer.parseInt(inputST[0]);
        int t = Integer.parseInt(inputST[1]);

        String[] inputAB = scanner.nextLine().split("\\s+");

        int a = Integer.parseInt(inputAB[0]);
        int b = Integer.parseInt(inputAB[1]);

        String[] inputMN = scanner.nextLine().split("\\s+");

        int m = Integer.parseInt(inputMN[0]);
        int n = Integer.parseInt(inputMN[1]);

        List<Integer> apples = setApples(scanner, a, m).stream().filter(apple -> apple >= s && apple <= t).collect(Collectors.toList());
        List<Integer> oranges = setOranges(scanner, b, n).stream().filter(orange -> orange >= s && orange <= t).collect(Collectors.toList());

        System.out.println(apples.size());
        System.out.println(oranges.size());
    }

    private static List<Integer> setApples(Scanner scanner, int a, int m) {
        List<Integer> apples = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < m; i++) {
            int fallPosition = apples.get(i) + a;

            apples.set(i, fallPosition);
        }

        return apples;
    }

    private static List<Integer> setOranges(Scanner scanner, int b, int n) {
        List<Integer> oranges = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            int fallPosition = oranges.get(i) + b;

            oranges.set(i, fallPosition);
        }

        return oranges;
    }
}
