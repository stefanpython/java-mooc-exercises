import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                // Move from first container to second container
                int moveAmount = firstContainer.contains();
                if (moveAmount > amount) {
                    moveAmount = amount;
                }
                firstContainer.remove(moveAmount);
                secondContainer.add(moveAmount);
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
