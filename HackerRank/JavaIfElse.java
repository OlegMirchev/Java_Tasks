import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 != 0) {
            System.out.println("Weird");
        }else if (number >= 2 && number <= 5) {
            System.out.println("Not Weird");
        }else if (number >= 6 && number <= 20) {
            System.out.println("Weird");
        }else if (number > 20) {
            System.out.println("Not Weird");
        }
    }
}
