import java.util.Scanner;

public class JavaDataTypes {
    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            output = new StringBuilder();

            if (scanner.hasNextByte()) {
                output.append("* byte").append(System.lineSeparator());
            }

            if (scanner.hasNextShort()) {
                output.append("* short").append(System.lineSeparator());
            }

            if (scanner.hasNextInt()) {
                output.append("* int").append(System.lineSeparator());
            }

            if (scanner.hasNextLong()) {
                output.append("* long").append(System.lineSeparator());
            }else {
                System.out.println(scanner.nextLine() + " can't be fitted anywhere.");
                continue;
            }

            System.out.println(scanner.nextLine() + " can be fitted in:");

            System.out.println(output.toString().trim());
        }
    }
}
