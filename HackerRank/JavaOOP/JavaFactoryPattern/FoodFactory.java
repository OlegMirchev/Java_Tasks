package javaTask.JavaFactoryPattern;

public class FoodFactory {

    public Food getFood(String type) {

        if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        }

        return new Cake();
    }
}
