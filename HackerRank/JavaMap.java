package javaTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static Map<String, Integer> MAP_PHONE_BOOK = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MAP_PHONE_BOOK = getPersonAndPhoneNumber(scanner);

        while (scanner.hasNext()) {
            String queryName = scanner.nextLine();

            if (MAP_PHONE_BOOK.containsKey(queryName)) {
                System.out.printf("%s=%d%n", queryName, MAP_PHONE_BOOK.get(queryName));
            } else {
                System.out.println("Not found");
            }
        }
    }

    private static Map<String, Integer> getPersonAndPhoneNumber(Scanner scanner) {
        Map<String, Integer> mapPersonAndNumber = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            int phone = Integer.parseInt(scanner.nextLine());

            mapPersonAndNumber.put(name, phone);
        }

        return mapPersonAndNumber;
    }
}
