package task5;

public enum Singleton3 {
    INSTANCE;

    private String message = "TOP SECRET SINGLETON3";
    public String getMessage(){
        return message;
    }
}
