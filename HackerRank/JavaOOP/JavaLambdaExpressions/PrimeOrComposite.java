package javaTask.JavaLambdaExpressions;

public class PrimeOrComposite {
    public static String PRIME = "PRIME";
    public static String COMPOSITE = "COMPOSITE";

    public void isPrimeNumber(int number) {
        boolean isPrime = number > 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrime = false;

                break;
            }
        }

        System.out.println(isPrime ? PRIME : COMPOSITE);
    }
}
