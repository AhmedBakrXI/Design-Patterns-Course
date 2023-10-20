public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1); // Singleton@7b23ec81
        System.out.println(singleton2); // Singleton@7b23ec81

        singleton1.setData("singleton");
        System.out.println(singleton2.getData()); // singleton
    }
}