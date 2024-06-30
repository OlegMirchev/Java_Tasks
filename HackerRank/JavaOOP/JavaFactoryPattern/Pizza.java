package javaTask.JavaFactoryPattern;

public class Pizza implements Food {

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
