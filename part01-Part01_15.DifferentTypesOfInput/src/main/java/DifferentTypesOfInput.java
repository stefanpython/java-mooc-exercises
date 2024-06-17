
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
    
        
        System.out.println("Give an integer:");
        Integer integer = Integer.valueOf(scan.nextLine());
   
        
        System.out.println("Give a double:");
        Double doubl = Double.valueOf(scan.nextLine());
    
        
        System.out.println("Give a boolean:");
        Boolean bool = Boolean.valueOf(scan.nextLine());
   
        
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubl);
        System.out.println("You gave the boolean " + bool);
    }
}
