package javaTask.JavaSingletonPattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void printMessage(String str) {
        System.out.printf("Hello I am a singleton! Let me say %s to you", str);
    }
}
