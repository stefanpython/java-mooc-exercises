
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    // Constructor
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    // Method to add an item to the suitcase
    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        if (currentWeight + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    // Method to calculate the total weight of all items in the suitcase
    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    // Method to return a string representation of the suitcase
    @Override
    public String toString() {
        int totalWeight = this.totalWeight();
        if(this.items.size() == 0) {
            return "no items (0 kg)";
        } else if(this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight + " kg)";
        }
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item.toString());
        }
    }
    
   public Item heaviestItem() {
    
       if(this.items.isEmpty()) {
           return null;
       }
       
       Item heaviest = this.items.get(0);
       for(Item item: this.items) {
           if(item.getWeight() > heaviest.getWeight()) {
               heaviest = item;
           }
       }
       
       return heaviest;
   }
}
