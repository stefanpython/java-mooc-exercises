import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        System.out.println("First number?");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());

        if (num <= last) {
            for (int i = num; i <= last; i++) {
                result += i;
            }
            System.out.println("The sum is " + result);
        } else {
            System.out.println("Invalid range. The first number should be less than or equal to the last number.");
        }
    }
}
