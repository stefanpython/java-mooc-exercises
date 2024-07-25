
import java.util.*;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (!this.prices.containsKey(product)) {
            return -99;
        }

        return this.prices.get(product);
    }

    public int stock(String product) {
        if (!this.stock.containsKey(product)) {
            return 0;
        }
        return this.stock.get(product);
    }

    public boolean take(String product) {
        if (!this.stock.containsKey(product)) {
            return false;
        }

        if (this.stock.get(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
       return this.stock.keySet();
    }
    
    
}
