
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    
}
