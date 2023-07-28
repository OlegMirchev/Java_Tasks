package algorithms;

import java.util.Scanner;

public class HalloweenSale {
    public static int BUY_GAMES = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceOfFirstGame = scanner.nextInt();
        int discount = scanner.nextInt();
        int minPriceOfGame = scanner.nextInt();
        int budget = scanner.nextInt();

        int sumOfAmountForAGame = 0;

        sumOfAmountForAGame += priceOfFirstGame;

        while (budget > sumOfAmountForAGame) {
            priceOfFirstGame -= discount;

            if (priceOfFirstGame < minPriceOfGame) {
                break;
            }

            sumOfAmountForAGame += priceOfFirstGame;

            BUY_GAMES++;
        }

        int restGames = (budget - sumOfAmountForAGame) / minPriceOfGame;

        if (budget < priceOfFirstGame) {
            System.out.println(0);
        } else {
            System.out.println(BUY_GAMES + restGames);
        }
    }
}
