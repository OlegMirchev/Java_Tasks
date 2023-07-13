package javaTask;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static final int[] ARRAY_INT = {1, 2, 3};
    public static final String[] ARRAY_STRING = {"Hello", "World"};

    public static void main(String[] args) {

        List<int[]> listOfIntegers = readInput(ARRAY_INT);
        List<String[]> listOfStrings = readInput(ARRAY_STRING);

        for (int[] listOfInteger : listOfIntegers) {
            System.out.println(listOfInteger[0]);
            System.out.println(listOfInteger[1]);
            System.out.println(listOfInteger[2]);
        }

        for (String[] listOfString : listOfStrings) {
            System.out.println(listOfString[0]);
            System.out.println(listOfString[1]);
        }
    }

    public static <T> List<T> readInput(T input) {
        List<T> listOfGenerics = new ArrayList<>();

        listOfGenerics.add(input);

        return listOfGenerics;
    }
}
