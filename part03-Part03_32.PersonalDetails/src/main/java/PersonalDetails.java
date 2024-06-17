import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1]);
            
            // Find the longest name
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            // Sum birth years and count the number of entries
            sum += birthYear;
            count++;
        }

        // Calculate the average of the birth years
        double average = (double) sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
