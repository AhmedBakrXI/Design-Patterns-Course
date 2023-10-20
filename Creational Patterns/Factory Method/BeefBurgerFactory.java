public class BeefBurgerFactory extends Factory {

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
