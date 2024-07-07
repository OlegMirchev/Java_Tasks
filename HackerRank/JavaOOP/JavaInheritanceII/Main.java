package javaTask.JavaInheritanceII;

public class Main {
    public static void main(String[] args) {

        Adder adder = new Adder();

        adder.printClass();
        System.out.print(adder.add(40, 2) + " ");
        System.out.print(adder.add(7, 6) + " ");
        System.out.print(adder.add(8, 12) + " ");
    }
}
