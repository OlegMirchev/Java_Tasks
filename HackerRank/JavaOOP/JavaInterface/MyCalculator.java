package javaTask.JavaInterface;

import java.util.ArrayList;
import java.util.List;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                divisors.add(i);
            }
        }

        return divisors.stream().mapToInt(Integer::valueOf).sum();
    }
}
