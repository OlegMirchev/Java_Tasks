package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> gradeOfStudents = readInput(scanner, n);

        for (int i = 0; i < n; i++) {
            int grade = gradeOfStudents.get(i);

            int rest = grade % 5;

            if (grade >= 38) {
                int multiple = 5 - rest + grade;

                if (multiple - grade < 3) {
                    gradeOfStudents.set(i, multiple);
                }
            }
        }

        printGradesStudents(gradeOfStudents);
    }

    private static List<Integer> readInput(Scanner scanner, int n) {
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(Integer.valueOf(scanner.nextLine()));
        }

        return grades;
    }

    private static void printGradesStudents(List<Integer> students) {

        for (Integer student : students) {
            System.out.println(student);
        }
    }
}
