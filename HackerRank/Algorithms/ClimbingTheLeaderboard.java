package algorithms;

import java.util.*;

public class ClimbingTheLeaderboard {
    public static Scanner scanner = new Scanner(System.in);
    public static int m = 0;

    public static void main(String[] args) {
        List<Integer> ranked = readRank();
        List<Integer> players = readRank();

        Set<Integer> setDuplicateNumb = new LinkedHashSet<>(ranked);

        ranked = new ArrayList<>(setDuplicateNumb);

        for (int i = 0; i < m; i++) {
            int playerScore = players.get(i);
            boolean isValid = false;

            for (int j = 0; j < ranked.size(); j++) {
                int rankScore = ranked.get(j);

                if (playerScore >= rankScore) {
                    System.out.println(ranked.indexOf(rankScore) + 1);
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                System.out.println(ranked.size() + 1);
            }
        }
    }

    private static List<Integer> readRank() {
        List<Integer> ranked = new ArrayList<>();

        int n = scanner.nextInt();

        m = n;

        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();

            ranked.add(score);
        }

        return ranked;
    }
}
