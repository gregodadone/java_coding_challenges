public class Singleton {
    private static final Singleton singleton = new Singleton("Hello World");
    public String str;

    private Singleton(String str) {
        this.str = str;
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
