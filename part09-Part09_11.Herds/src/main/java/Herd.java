
import java.util.*;

public class Herd implements Movable {

    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Movable item : this.list) {
            sb.append(item.toString()).append("\n");
        }

        return sb.toString();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable item: this.list) {
            item.move(dx, dy);
        }
    }
}
