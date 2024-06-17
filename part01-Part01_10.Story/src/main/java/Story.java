import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the main character's name
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String one = scanner.nextLine();

        // Prompting the user for the main character's job
        System.out.println("What is their job?");
        String two = scanner.nextLine();

        // Printing the story
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + one + ", who was " + two + ".");
        System.out.println("On the way to work, " + one + " reflected on life.");
        System.out.println("Perhaps " + one + " will not be " + two + " forever.");
    }
}
