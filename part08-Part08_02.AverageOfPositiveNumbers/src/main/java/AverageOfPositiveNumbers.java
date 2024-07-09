
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int count = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number > 0) {
                average += number;
                count++;
            }
            
            if(number < 0) {
                System.out.println("Cannot calculate the average");
            }
            
            if(number == 0) {
                break;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) average / count);
        }
    }
}
