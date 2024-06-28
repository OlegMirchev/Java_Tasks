package javaTask.JavaAnnotations;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0) {
            String role = scanner.next();
            int spend = scanner.nextInt();

            try {
                Class<FamilyMember> annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();

                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);

                        String userRole = family.userRole();

                        int budgetLimit = family.budgetLimit();

                        if (userRole.equals(role)) {
                            if (spend <= budgetLimit) {
                                method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            testCases--;
        }
    }
}
