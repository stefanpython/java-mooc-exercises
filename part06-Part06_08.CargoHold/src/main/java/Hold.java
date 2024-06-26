import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    // Constructor
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    // Method to add a suitcase to the hold
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = this.totalWeight();
        if (currentWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    // Method to calculate the total weight of all suitcases in the hold
    private int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    // Method to return a string representation of the hold
    @Override
    public String toString() {
        int totalWeight = this.totalWeight();
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
    for (Suitcase suitcase : suitcases) {
        suitcase.printItems(); 
    }
}
}
