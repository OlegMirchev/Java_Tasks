package javaTask.CovariantReturnTypes;

import java.util.Scanner;

public class Main {
    public static Flower flower;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeClass = scanner.nextLine();

        if (typeClass.equals(WestBengal.class.getSimpleName())) {
            WestBengal westBengal = new WestBengal();
            flower = westBengal.yourNationalFlower();
        } else {
            AndraPradesh andraPradesh = new AndraPradesh();
            flower = andraPradesh.yourNationalFlower();
        }

        System.out.println(flower.whatsYourName());
    }
}
