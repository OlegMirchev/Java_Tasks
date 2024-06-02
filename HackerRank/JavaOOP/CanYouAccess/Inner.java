package javaTask.CanYouAccess;

public class Inner {

    private void powerOf(int number) {

        if ((number & number - 1) == 0) {
            System.out.println(number + " is power of 2");
            System.out.println("An instance of class: Solution.Inner.Private has been created");
        } else {
            System.out.println(number + " is not a power of 2");
            System.out.println("An instance of class: Solution.Inner.Private has been created");
        }
    }
}
