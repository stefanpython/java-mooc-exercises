
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

       
        
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            int n = Integer.parseInt(row);
            
            if(n < 0) {
                negatives.add(n);
            } else {
                positives.add(n);
            }
        }
        
        
        
        double negativeAverage = negatives.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double positiveAverage = positives.stream().mapToInt(Integer::intValue).average().getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String response = scanner.nextLine();
        
        if(response.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else if(response.equals("p")) {
             System.out.println("Average of the positive numbers: " + positiveAverage);
        }
    }
}
