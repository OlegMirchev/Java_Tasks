package javaTask.JavaSort;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        }

        if (s1.getCgpa() > s2.getCgpa()) {
            return -1;
        }

        if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        }

        if (s1.getId() > s2.getId()) {
            return 1;
        }else {
            return -1;
        }
    }
}
