package javaTask.CanYouAccess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        Class<Inner> clazz = Inner.class;

        int n = Integer.parseInt(scanner.nextLine());

        Method methodPowerOf = clazz.getDeclaredMethod("powerOf", int.class);

        methodPowerOf.setAccessible(true);

        methodPowerOf.invoke(clazz.newInstance(), n);
    }
}
