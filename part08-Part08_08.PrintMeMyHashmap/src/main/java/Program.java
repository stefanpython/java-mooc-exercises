
import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String key: hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    
    
}
