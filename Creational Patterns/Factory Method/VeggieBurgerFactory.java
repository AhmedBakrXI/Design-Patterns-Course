public class VeggieBurgerFactory extends Factory{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
