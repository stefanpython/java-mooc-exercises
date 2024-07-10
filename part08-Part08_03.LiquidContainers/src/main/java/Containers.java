
public class Containers {

    private int first;
    private int second;

    public Containers(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void addAmount(int amount) {
        if (amount + this.first > 100) {
            this.first = 100;
        } else if (amount >= 100) {
            this.first = 100;
        } else {
            this.first += amount;
        }
    }

    public void moveAmount(int amount) {
        if (amount > this.first) {
            this.second += this.first;
            this.first = 0;
        } else if (amount + this.second > 100 && this.first - amount < 0) {
            this.second = 100;
            this.first = 0;
        }
    }

    public void removeAmount(int amount) {
        if (this.second - amount < 0) {
            this.second = 0;
        } else {
            this.second -= amount;
        }
    }
}
