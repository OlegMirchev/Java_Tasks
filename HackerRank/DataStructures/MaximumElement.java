package DataStructures;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt();

    public static ArrayDeque<Integer> STACK = new ArrayDeque<>();

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 1) {
                int digit = scanner.nextInt();
                STACK.push(digit);
            } else if (x == 2) {
                STACK.pop();
            } else if (x == 3) {
                System.out.println(Collections.max(STACK));
            }
        }
    }
}
