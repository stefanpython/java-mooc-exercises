import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid range. 'Where from?' should be less than or equal to 'Where to?'");
        }
    }
}
