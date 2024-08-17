package javaTask.PrimeChecker;

public class Prime {

    public void checkPrime(int... arr) {

        for (int index = 0; index < arr.length; index++) {
            int digit = arr[index];
            boolean isValid = true;

            if (digit <= 1) {
                isValid = false;
            }

            for (int i = 2; i <= Math.sqrt(digit); i++) {

                if (digit % i == 0) {
                    isValid = false;

                    break;
                }
            }

            if (isValid) {
                System.out.printf("%d ", digit);
            }
        }

        System.out.println();
    }
}
