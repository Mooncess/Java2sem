package task5;


public class Task5 {
    private static Singleton1 s = Singleton1.getInstance();

    private static Singleton2 s2 = Singleton2.getInstance();
    private static Singleton3 s3 = Singleton3.INSTANCE;

    public static void main(){
        System.out.println(s.getMessage());
        System.out.println(s2.getMessage());
        System.out.println(s3.getMessage());
    }
}
