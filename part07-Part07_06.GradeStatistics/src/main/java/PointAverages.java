public class PointAverages {
    private int totalNumbers;
    private int count;
    private int passingTotal;
    private int passingCount;
    private int[] grades;

    public PointAverages() {
        this.totalNumbers = 0;
        this.count = 0;
        this.passingTotal = 0;
        this.passingCount = 0;
        this.grades = new int[6];  // 0 for failed, 1 for grade 1, ..., 5 for grade 5
    }
    
    public void addToTotal(int num) {
        this.totalNumbers += num;
    }
    
    public void incrementCount() {
        this.count++;
    }
    
    public void addToPassingTotal(int num) {
        this.passingTotal += num;
    }
    
    public void incrementPassingCount() {
        this.passingCount++;
    }

    public void addGrade(int num) {
        if (num < 50) {
            grades[0]++;
        } else if (num < 60) {
            grades[1]++;
        } else if (num < 70) {
            grades[2]++;
        } else if (num < 80) {
            grades[3]++;
        } else if (num < 90) {
            grades[4]++;
        } else {
            grades[5]++;
        }
    }

    public double average() {
        if (count == 0) {
            return 0.0;
        }
        return (double) totalNumbers / count;
    }
    
    public double passingAverage() {
        if (passingCount == 0) {
            return -1; 
        }
        return (double) passingTotal / passingCount;
    }
    
    public double passPercentage() {
        if (count == 0) {
            return 0.0;
        }
        
        return 100.0 * passingCount / count;
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
