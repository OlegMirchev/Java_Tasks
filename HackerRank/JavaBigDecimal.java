package javaTask;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> decimalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine();

            decimalList.add(string);
        }

        List<String> sortedList = decimalList.stream().sorted((a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a))).collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
