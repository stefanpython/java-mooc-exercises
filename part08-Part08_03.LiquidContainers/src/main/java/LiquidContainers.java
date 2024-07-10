import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            } else if (command.equals("move")) {
                if (amount > first) {
                    amount = first;
                }
                first -= amount;
                if (second + amount > 100) {
                    second = 100;
                } else {
                    second += amount;
                }
            } else if (command.equals("remove")) {
                if (second - amount < 0) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }
}
