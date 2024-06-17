
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 6);
    }
    
    public static void divisibleByThreeInRange(int a, int b) {
        // Ensure a is the smaller number and b is the larger number
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
