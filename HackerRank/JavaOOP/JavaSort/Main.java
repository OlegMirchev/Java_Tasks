package javaTask.JavaSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> listOfStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();

            Student student = new Student(id, name, cgpa);

            listOfStudents.add(student);
        }

        listOfStudents.sort(new StudentComparator());

        for (Student student : listOfStudents) {
            System.out.println(student.getName());
        }
    }
}
