package Databases;

import java.util.*;
import java.util.stream.Collectors;

public class BasicsOfSetsAndRelations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstList = new HashSet<>(Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toUnmodifiableSet()));
        Set<Integer> secondList = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toUnmodifiableSet());

        firstList.addAll(secondList);

        System.out.println(firstList.size());
    }
}
