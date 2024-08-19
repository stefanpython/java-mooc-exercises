
import java.util.*;

public class Pipe<T> {

    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }

        T lastValue = this.values.get(0);
        this.values.remove(0);

        return lastValue;
    }

    public boolean isInPipe() {
        if(this.values.isEmpty()) {
            return false;
        }
        return true;
    }
}
