package DataStructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static ArrayDeque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int query = scanner.nextInt();

            switch (query) {
                case 1 -> {
                    int number = scanner.nextInt();
                    queue.offer(number);
                }
                case 2 -> queue.poll();
                case 3 -> System.out.println(queue.peek());
            }
        }
    }
}
