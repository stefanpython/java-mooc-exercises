
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> list;

    public StorageFacility() {
        this.list = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.list.containsKey(unit)) {
            this.list.put(unit, new ArrayList<>());
        }
        this.list.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.list.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.list.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.list.containsKey(storageUnit)) {
            ArrayList<String> items = this.list.get(storageUnit);
            items.remove(item);
            if (items.isEmpty()) {
                this.list.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.list.keySet());
    }
}
