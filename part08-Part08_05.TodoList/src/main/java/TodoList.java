
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<String>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        if (this.list.size() > 0) {
            for (int i = 1; i <= this.list.size(); i++) {
                System.out.println(i + ": " + this.list.get(i - 1));
            }
        } else return;
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }

    public int size() {
        return this.list.size();
    }
    
    public String get(int index) {
        return this.list.get(index);
    }
}
