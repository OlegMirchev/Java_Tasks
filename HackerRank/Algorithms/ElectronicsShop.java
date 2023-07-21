package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
       public static Scanner scanner = new Scanner(System.in);
       public static String[] INPUT = scanner.nextLine().split("\\s+");

       public static int b = Integer.parseInt(INPUT[0]);
       public static int n = Integer.parseInt(INPUT[1]);
       public static int m = Integer.parseInt(INPUT[2]);

       public static int[] KEYBOARD = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
       public static int[] USB_DRIVES = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static void main(String[] args) {

        int maxPrice = -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int priceKeyboard = KEYBOARD[i];
            for (int j = 0; j < m; j++) {
                int priceUsbDriver = USB_DRIVES[j];

                sum = priceKeyboard + priceUsbDriver;

                if (sum > maxPrice && sum <= b) {
                    maxPrice = sum;
                }
            }
        }

        System.out.println(maxPrice);
    }
}
