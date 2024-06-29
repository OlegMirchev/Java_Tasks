package javaTask.JavaComparator;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {

        if (p1.getScore() > p2.getScore()) {
            return -1;
        }

        if (p1.getScore() < p2.getScore()) {
            return 1;
        }

        return p1.getName().compareTo(p2.getName());
    }
}
