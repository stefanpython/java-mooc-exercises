public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. For example, division(3, 5);
        // should print "0.6"
        
        division(3, 5);
    }

    // Implement the method here
    public static void division(int numerator, int denominator) {
        
        // Cast numerator to double to ensure the division is done with floating-point precision
        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}
