package javaTask.JavaMethodOverriding2SuperKeyword;

public class Motorcycle extends Bicycle {

    public String defineMe() {
        return "a cycle with an engine.";
    }

    public void printMotorcycle() {

        System.out.println("Hello I am a motorcycle, I am " + defineMe());

        String temp = super.defineMe();

        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
