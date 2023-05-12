package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static Scanner scanner = new Scanner(System.in);

    public static int n = Integer.parseInt(scanner.nextLine());
    public static List<Integer> birdId = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

    public static int LOW_TYPES = 0;

    public static void main(String[] args) {

        int type1 = 0, type2 = 0, type3 = 0, type4 = 0, type5 = 0;

        for (int i = 0; i < n; i++) {
            int number = birdId.get(i);

            switch (number) {
                case 1 -> type1++;
                case 2 -> type2++;
                case 3 -> type3++;
                case 4 -> type4++;
                case 5 -> type5++;
            }
        }

        numberOfBirds(type1, type2, type3, type4, type5);

        System.out.println(LOW_TYPES);
    }

    private static void numberOfBirds(int type1, int type2, int type3, int type4, int type5) {

        if (type1 != 0 && type1 != 2) {
            LOW_TYPES++;
        }

        if (type2 != 0 && type2 != 2) {
            LOW_TYPES++;
        }

        if (type3 != 0 && type3 != 2) {
            LOW_TYPES++;
        }

        if (type4 != 0 && type4 != 2) {
            LOW_TYPES++;
        }

        if (type5 != 0 && type5 != 2) {
            LOW_TYPES++;
        }
    }
}
