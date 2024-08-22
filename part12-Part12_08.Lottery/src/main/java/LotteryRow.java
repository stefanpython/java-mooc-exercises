import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();

        // Generate numbers until the list has 7 unique numbers
        while (this.numbers.size() < 7) {
            int num = random.nextInt(40) + 1; // Generate a number between 1 and 40
            if (!this.containsNumber(num)) {
                this.numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
