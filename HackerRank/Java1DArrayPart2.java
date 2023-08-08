package javaTask;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int leap = Integer.parseInt(input[1]);

            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            boolean isCanWin = false;

            queue.offer(0);

            while (!queue.isEmpty()) {
                int i = queue.poll();

                if (i < 0) continue;

                if (i >= n) {
                    isCanWin = true;
                    System.out.println("YES");

                    break;
                }

                if (arr[i] == 1) continue;

                arr[i] = 1;

                queue.offer(i - 1);
                queue.offer(i + 1);
                queue.offer(i + leap);
            }

            if (!isCanWin) System.out.println("NO");
        }
    }
}
