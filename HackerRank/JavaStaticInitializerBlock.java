package java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static Scanner scanner = new Scanner(System.in);

    public static int breadth = Integer.parseInt(scanner.nextLine());
    public static int height = Integer.parseInt(scanner.nextLine());

    public static void main(String[] args) throws Exception {

        if (breadth <= 0 || height <= 0) {
            throw new Exception("Breadth and height must be positive");
        }

        long area = (long) breadth * height;

        System.out.println(area);
    }
}
