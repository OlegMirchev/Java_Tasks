package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextLine());
        List<Integer> sticks = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (sticks.size() > 1) {
            int min = Collections.min(sticks);

            for (int index = 0; index < sticks.size(); index++) {
                int newElement = sticks.get(index) - min;

                sticks.set(index, newElement);
            }

            sticks = sticks.stream().filter(e -> e != 0).collect(Collectors.toList());

            if (sticks.size() == 0) {
                break;
            }

            System.out.println(sticks.size());
        }
    }
}
