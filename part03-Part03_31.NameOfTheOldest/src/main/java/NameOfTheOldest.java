
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            if (Integer.valueOf(parts[1]) > sum) {
                sum = Integer.valueOf(parts[1]);
                name = parts[0];
            }

        }
        System.out.println("Name of the oldest: " + name);
    }

}

