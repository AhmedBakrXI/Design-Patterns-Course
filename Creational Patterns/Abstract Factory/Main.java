public class Main {
    public static void main(String[] args) {
        Company company1 = new Razer();
        Keyboard k1 = company1.createKeyboard();
        k1.assemble();
        Mouse m1 = company1.createMouse();
        m1.assemble();

        Company company2 = new Logitech();
        Keyboard k2 = company2.createKeyboard();
        k2.assemble();
        Mouse m2 = company2.createMouse();
        m2.assemble();
    }
}