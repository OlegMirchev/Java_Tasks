package algorithms;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n-- > 0) {
            int amountOfMoney = scanner.nextInt();
            int costBar = scanner.nextInt();
            int wrappers = scanner.nextInt();

            int countOfChocolates;
            int chocoWrapper;

            int buyBar = amountOfMoney / costBar;

            countOfChocolates = buyBar;
            chocoWrapper = buyBar;

            while (chocoWrapper >= wrappers) {
                buyBar = 0;

                chocoWrapper -= wrappers;

                countOfChocolates += ++buyBar;

                chocoWrapper += buyBar;
            }

            System.out.println(countOfChocolates);
        }
    }
}
