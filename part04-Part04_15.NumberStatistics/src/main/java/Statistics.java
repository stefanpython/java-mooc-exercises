public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize count and sum
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // update count and sum with the new number
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        // return the count of numbers added
        return this.count;
    }
    
    public int sum() {
        // return the sum of numbers added
        return this.sum;
    }

    public double average() {
        // calculate and return the average of numbers added
        if (this.count == 0) {
            return 0.0; // handle case where no numbers are added
        }
        return (double) this.sum / this.count;
    }
}
