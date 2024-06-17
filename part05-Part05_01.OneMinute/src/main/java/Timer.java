public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;
    
    public Timer() {
        this.seconds = new ClockHand(60);  // Initialize seconds with a maximum value of 60
        this.hundredths = new ClockHand(100);  // Initialize hundredths with a maximum value of 100
    }
    
    public void advance() {
        this.hundredths.advance();  // Advance hundredths
        
        if (this.hundredths.value() == 0) {  // When hundredths roll over
            this.seconds.advance();  // Advance seconds
        }
    }
    
    public String toString() {
        return String.format("%02d:%02d", this.seconds.value(), this.hundredths.value());  // Format the output as "seconds:hundredths"
    }
}
