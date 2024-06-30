package javaTask.JavaFactoryPattern;

public class Cake implements Food {

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
