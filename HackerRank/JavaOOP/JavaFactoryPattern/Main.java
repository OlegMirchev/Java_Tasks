package javaTask.JavaFactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(type);

        switch (food.getType()) {
            case "Pizza" -> System.out.println("The factory returned class Pizza\n" +
                    "Someone ordered Fast Food!");

            case "Cake" -> System.out.println("The factory returned class Cake\n" +
                    "Someone ordered a Dessert!");
        }
    }
}
