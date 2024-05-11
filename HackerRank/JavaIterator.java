package javaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        List<Object> objects = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            objects.add(scanner.nextInt());
        }

        objects.add("###");

        for (int i = 0; i < t; i++) {
            objects.add(scanner.next());
        }

        for (Object object : objects) {

            if (object instanceof String && !object.equals("###")) {
                System.out.println(object);
            }
        }
    }
}
