package javaTask.JavaLambdaExpressions;

public class Palindrome {
    public static String PALINDROME = "PALINDROME";
    public static String NOT_PALINDROME = "NOT PALINDROME";

    public void isPalindromeNumber(int number) {

        StringBuilder reverseNumb = new StringBuilder();
        reverseNumb.append(number);
        reverseNumb.reverse();

        System.out.println(number == Integer.parseInt(reverseNumb.toString()) ? PALINDROME : NOT_PALINDROME);
    }
}
