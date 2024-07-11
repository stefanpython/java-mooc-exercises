
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {

            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                String toAddString = this.scanner.nextLine();
                this.list.add(toAddString);
            }

            if (command.equals("list")) {
                for (int i = 1; i <= this.list.size(); i++) {
                    System.out.println(i + ": " + this.list.get(i - 1));
                }
            }
            
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                String toRemoveString = this.scanner.nextLine();
                this.list.remove(Integer.valueOf(toRemoveString));
            }
        }
    }

}
