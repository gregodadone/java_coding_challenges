public class SingletonUsage {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); forbidden

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.str);

        singleton.str = "Something else";

        System.out.println(singleton.str);
    }
}
