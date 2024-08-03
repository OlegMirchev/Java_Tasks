package javaTask.JavaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Student> clazz = Student.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

        List<Method> sortMethods = Arrays.stream(declaredMethods).sorted(new MethodComparator()).collect(Collectors.toList());

        sortMethods.forEach(m -> System.out.println(m.getName()));
    }
}
