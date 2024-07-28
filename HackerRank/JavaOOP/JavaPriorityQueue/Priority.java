package javaTask.JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class Priority {

    private List<Student> students;

    public Priority() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents(List<String> events) {
        for (String text : events) {
            String[] dataOfStudent = text.split("\\s+");

            String priority = dataOfStudent[0];

            switch (priority) {
                case "ENTER" -> {
                    String name = dataOfStudent[1];
                    double cgpa = Double.parseDouble(dataOfStudent[2]);
                    int id = Integer.parseInt(dataOfStudent[3]);

                    this.students.add(new Student(id, name, cgpa));
                    this.students.sort(new StudentComparator());
                }

                case "SERVED" -> {
                    if (this.students.isEmpty()) {
                        continue;
                    }

                    this.students.remove(0);
                }
            }
        }

        return this.students;
    }
}
