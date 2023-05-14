package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BillDivision {
    public static Scanner scanner = new Scanner(System.in);

    public static String[] INPUT = scanner.nextLine().split(" ");

    public static List<Integer> PORTIONS = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

    public static int b = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) {

        PORTIONS.remove(PORTIONS.get(Integer.parseInt(INPUT[1])));

        int costPerPerson = PORTIONS.stream().mapToInt(Integer::valueOf).sum() / 2;

        int amountOfAnna = b - costPerPerson;

        if (costPerPerson < b) {
            System.out.println(amountOfAnna);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
