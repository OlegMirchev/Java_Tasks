import java.util.Scanner;

public class JavaOutputFormatting {
    public static final int CHARACTERS = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] input = scanner.nextLine().split("\\s+");

            String text = input[0];
            int number = Integer.parseInt(input[1]);

            int whitespace = CHARACTERS - input[0].length();

            for (int i = 0; i < whitespace; i++) {
                text += " ";
            }

            if (input[1].length() < 2) {
                System.out.printf("%s00%d%n", text, number);
            }else if (input[1].length() < 3) {
                System.out.printf("%s0%d%n", text, number);
            }else {
                System.out.printf("%s%d%n", text, number);
            }
        }
    }
}
