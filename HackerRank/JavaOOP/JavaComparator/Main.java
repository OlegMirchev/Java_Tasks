package javaTask.JavaComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Player> PLAYERS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            int score = Integer.parseInt(input[1]);

            Player player = new Player(name, score);

            PLAYERS.add(player);
        }

        PLAYERS.sort(new PlayerComparator());

        for (Player player : PLAYERS) {
            System.out.printf("%s %d%n", player.getName(), player.getScore());
        }
    }
}
