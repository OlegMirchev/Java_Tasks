package javaTask.JavaLambdaExpressions;

public class OddOrEven {
    public static String ODD = "ODD";
    public static String EVEN = "EVEN";

    public void isOddNumber(int number) {

        System.out.println(number % 2 != 0 ? ODD : EVEN);
    }
}
