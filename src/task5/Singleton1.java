package task5;

public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private String message = "TOP SECRET";

    private Singleton1(){

    }
    public static Singleton1 getInstance() {
        return instance;
    }

    public String getMessage() {
        return message;
    }
}
