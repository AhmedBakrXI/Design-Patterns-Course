public class Razer extends Company{
    @Override
    public Mouse createMouse() {
        return new RazerMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }
}
