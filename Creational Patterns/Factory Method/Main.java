public class Main {
    public static void main(String[] args) {
        Factory factory = new BeefBurgerFactory();
        factory.orderBurger();  // prepares Beef Burger
        factory = new VeggieBurgerFactory();
        factory.orderBurger();  // prepares Veggie Burger
    }
}