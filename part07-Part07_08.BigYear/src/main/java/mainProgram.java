
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine().trim();
                database.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine().trim();
                if (!database.addObservation(name)) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("All")) {
                database.printAllBirds();
            } else if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine().trim();
                database.printOneBird(name);
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            } else {
                System.out.println("Unknown command!");
            }
        }

        scanner.close();
    }
}
