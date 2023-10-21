public class Logitech extends Company {
    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }
}
