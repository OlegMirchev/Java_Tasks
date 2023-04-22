import java.util.Scanner;

public class Loop1 {
    public static int multiple = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            multiple = number * i;

            System.out.printf("%d x %d = %d%n", number, i, multiple);
        }
    }
}
