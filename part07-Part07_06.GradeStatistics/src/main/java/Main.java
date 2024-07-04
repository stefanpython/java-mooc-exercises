import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointAverages points = new PointAverages();
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number >= 0 && number <= 100) {
                points.addToTotal(number);
                points.incrementCount();
                points.addGrade(number);

                if (number >= 50) {
                    points.addToPassingTotal(number);
                    points.incrementPassingCount();
                }
            }
        }

        System.out.println("Point average (all): " + points.average());

        double passingAverage = points.passingAverage();
        if (passingAverage == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
        
        System.out.println("Pass percentage: " + points.passPercentage());

        points.printGradeDistribution();
    }
}
