
public class ProductWarehouseWithHistory extends ProductWarehouse {

   private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        super.addToWarehouse(amount); // Update the super class's balance
        this.history.add(getBalance()); // Record the new balance in history
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        double taken = super.takeFromWarehouse(amount); // Update the super class's balance
        this.history.add(getBalance()); // Record the new balance in history
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
