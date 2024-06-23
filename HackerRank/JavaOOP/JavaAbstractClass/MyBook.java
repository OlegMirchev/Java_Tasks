package javaTask.JavaAbstractClass;

public class MyBook extends Book {

    @Override
    public void setTitle(String title) {

        super.title = title;

        System.out.printf("The title is: %s", super.getTitle());
    }
}
