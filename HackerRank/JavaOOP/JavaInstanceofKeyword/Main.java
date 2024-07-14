package javaTask.JavaInstanceofKeyword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int COUNT_STUDENT = 0;
    public static int COUNT_ROCKSTAR = 0;
    public static int COUNT_HACKER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Object> listOfObjects = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String type = scanner.nextLine();

            switch (type) {
                case "Student" -> listOfObjects.add(new Student());
                case "Rockstar" -> listOfObjects.add(new Rockstar());
                case "Hacker" -> listOfObjects.add(new Hacker());
            }
        }

        for (Object object : listOfObjects) {

            if (object instanceof Student) {
                COUNT_STUDENT++;
            }else if (object instanceof Rockstar) {
                COUNT_ROCKSTAR++;
            }else if (object instanceof Hacker){
                COUNT_HACKER++;
            }
        }

        System.out.printf("%d %d %d", COUNT_STUDENT, COUNT_ROCKSTAR, COUNT_HACKER);
    }
}
