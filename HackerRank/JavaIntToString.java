import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (String.valueOf(number).isBlank()) {
            System.out.println("Wrong answer");
        }else {
            System.out.println("Good job");
        }
    }
}
