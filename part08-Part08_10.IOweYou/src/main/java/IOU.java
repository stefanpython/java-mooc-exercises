
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    public IOU() {
        this.debts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double ammount) {
        this.debts.put(toWhom, ammount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if(this.debts.containsKey(toWhom)) {
            return debts.get(toWhom);
        }
        return 0;
    }
}
