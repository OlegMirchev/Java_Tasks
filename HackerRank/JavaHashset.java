package javaTask;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = Integer.parseInt(scanner.nextLine());

    public static Set<String> SET_PAIRS = new LinkedHashSet<>();

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            SET_PAIRS.add(scanner.nextLine());

            System.out.println(SET_PAIRS.size());
        }
    }
}
