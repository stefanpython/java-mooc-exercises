
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");

            String first = scanner.nextLine();
            if (first.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int second = Integer.valueOf(scanner.nextLine());

            books.add(new Book(first, second));
        }

        System.out.println(books.size() + " books in total.");

        System.out.println("\nBooks:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
