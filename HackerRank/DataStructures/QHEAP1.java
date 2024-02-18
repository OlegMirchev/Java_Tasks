package DataStructures;

import java.util.*;

public class QHEAP1 {
    public static PriorityQueue<Integer> QUEUE_OF_ELEMENTS = new PriorityQueue<>();
    //public static List<Integer> LIST_OF_ELEMENTS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int query = scanner.nextInt();

            switch (query) {
                case 1 -> {
                    int element = scanner.nextInt();
                    QUEUE_OF_ELEMENTS.add(element);
                    //LIST_OF_ELEMENTS.add(element);
                }

                case 2 -> {
                    int removeElement = scanner.nextInt();
                    QUEUE_OF_ELEMENTS.removeIf(e -> e == removeElement);
                    //LIST_OF_ELEMENTS.removeIf(e -> e == removeElement);
                }

                case 3 -> {
                    System.out.println(QUEUE_OF_ELEMENTS.peek());
                    //System.out.println(Collections.min(LIST_OF_ELEMENTS));
                }
            }
        }
    }
}
