import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<String>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.print(parts.get(i) + " ");
        }
    }
}
