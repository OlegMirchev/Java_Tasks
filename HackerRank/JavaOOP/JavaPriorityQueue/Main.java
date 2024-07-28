package javaTask.JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            events.add(input);
        }

        Priority priority = new Priority();
        List<Student> students = priority.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            students.forEach(s -> System.out.println(s.getName()));
        }
    }
}
