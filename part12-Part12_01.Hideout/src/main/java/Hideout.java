import java.util.ArrayList;

public class Hideout<T> {
    ArrayList<T> values;

    public Hideout() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        this.values.clear();
        this.values.add(toHide);
    }

    public T takeFromHideout() {
        if(this.values.isEmpty()) {
            return null;
        }
        
        T object = this.values.get(0);
        
        this.values.clear();
        
        return object;
    }
    
    public boolean isInHideout() {
        if(!this.values.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
}
