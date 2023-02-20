package task5;

public class Singleton2 {

    //thread-safe inplementation
    private static volatile Singleton2 instance = null;
    private String message = "TOP SECRET SINGLETON 2";

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized(Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }

    public String getMessage() {
        return message;
    }
}
