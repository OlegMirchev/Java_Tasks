public class Rabbit {
    public static int countOfJump = 0;

    public static void main(String[] args) {
        // R -> Rabbit
        // C -> Carrot

        char[][] garden = new char[4][4];

        garden[0][0] = 'R';

        for (int row = 0; row < garden.length; row++) {
            for (int col = 0; col < garden[row].length; col++) {
                if (garden[row][col] == 'C') {
                    garden[row][col] = 'R';
                    countOfJump++;
                }
            }
        }
    }
}
