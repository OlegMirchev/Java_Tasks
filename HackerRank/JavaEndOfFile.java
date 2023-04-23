import java.util.Scanner;

public class JavaEndOfFile {
    public static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            System.out.println(++index + " " + input);
        }
    }
}
