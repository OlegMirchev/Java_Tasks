package algorithms;

import java.util.*;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            // This is solution 1

            int prisoners = scanner.nextInt();
            int sweets = scanner.nextInt();
            int numbOfChair = scanner.nextInt();

            int calculationSeat = (numbOfChair + sweets - 1) % prisoners;

            System.out.println(calculationSeat == 0 ? prisoners : calculationSeat);

            // This is solution 2

//            for (int seat = numbOfChair; seat <= prisoners; seat++) {
//
//                if (--sweets == 0) {
//                    System.out.println(seat);
//
//                    break;
//                }
//            }
//
//            while (sweets != 0) {
//
//                for (int seat = 1; seat <= prisoners; seat++) {
//
//                    if (--sweets == 0) {
//                        System.out.println(seat);
//
//                        break;
//                    }
//                }
//            }
//        }
        }
    }
}
