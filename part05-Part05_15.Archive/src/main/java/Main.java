
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Item> list = new ArrayList<>();
        
        String identifier;
        String name;
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item newItem = new Item(identifier, name);
            
            if(!list.contains(newItem)) {
                list.add(newItem);
            }
            
            
        }
        System.out.println("\n==Items==");
        for(Item item: list) {
            System.out.println(item);
        }
        
    }
}
