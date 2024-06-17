
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNums = 0;
        int totalSum = 0;
        double average = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            totalNums += 1;
            totalSum += num;
        }

        average = (double) totalSum / totalNums;
        System.out.println("Average of the numbers: " + average);
    }
}
