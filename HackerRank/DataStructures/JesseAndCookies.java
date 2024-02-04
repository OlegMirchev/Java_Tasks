package DataStructures;

import java.util.*;

public class JesseAndCookies {
    public static int NUMBER_OF_OPERATIONS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> listOfSweetness = readInput(scanner, n);

        while (listOfSweetness.size() > 1) {

            if (getSweetNumb(k, listOfSweetness) == listOfSweetness.size()) {
                break;
            }

            Collections.sort(listOfSweetness);
            int mixedCookies = listOfSweetness.get(0) + 2 * listOfSweetness.get(1);
            listOfSweetness.remove(0);
            listOfSweetness.remove(0);
            listOfSweetness.add(mixedCookies);

            NUMBER_OF_OPERATIONS++;
        }

        System.out.println(listOfSweetness.size() <= 1 ? -1 : NUMBER_OF_OPERATIONS);
    }

    private static List<Integer> readInput(Scanner scanner, long n) {
        List<Integer> sweetness = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sweet = scanner.nextInt();

            sweetness.add(sweet);
        }

        return sweetness;
    }

    private static int getSweetNumb(long k, List<Integer> listOfSweetness) {
        int count = 0;

        for (Integer sweetness : listOfSweetness) {
            if (sweetness >= k) {
                count++;
            }
        }

        return count;
    }
}
