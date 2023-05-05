package javaTask;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int number = Integer.parseInt(scanner.nextLine());

            System.out.println(number);
        }
    }

//       input: 42
//             100
//             125
}
