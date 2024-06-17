import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int total = 0;
        int odd = 0;
        int even = 0;

        System.out.println("Give numbers:");
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += num;
            total++;
        }
        
        // Calculate the average only if total is greater than 0 to avoid division by zero
        double average = total > 0 ? (double) sum / total : 0;
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
