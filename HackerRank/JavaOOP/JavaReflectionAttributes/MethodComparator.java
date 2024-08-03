package javaTask.JavaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodComparator implements Comparator<Method> {

    @Override
    public int compare(Method m1, Method m2) {

        return m1.getName().compareTo(m2.getName());
    }
}
