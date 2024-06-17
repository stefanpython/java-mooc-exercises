import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           
        // implement here the program that allows the user to enter 
        // book information and to examine them
         ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop to collect book information until an empty title is entered
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            // Add the collected book to the list
            books.add(new Book(title, pages, publicationYear));
        }

        // Prompt the user for what to print
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        // Print based on user choice
        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
