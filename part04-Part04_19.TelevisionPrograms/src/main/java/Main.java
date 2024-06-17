
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop to collect television program information until an empty name is entered
        while (true) {
            System.out.print("Enter the name of the program, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the duration of the program: ");
            int duration = Integer.parseInt(scanner.nextLine());

            // Add the collected television program to the list
            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Enter the maximum duration: ");
        int max = Integer.parseInt(scanner.nextLine());

        // Print the names and durations of programs with duration less than or equal to the max duration
        System.out.println("Programs:");
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= max) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
