package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean onOff;
    private Random random;

    public TemperatureSensor() {
        this.onOff = false;
        this.random = new Random();
    }

    @Override
    public int read() {
        if (!this.onOff) {
            throw new IllegalStateException("Sensor is off. Cannot read temperature.");
        }
        // Generate a random integer in the range -30 to 30
        return random.nextInt(61) - 30;
    }

    @Override
    public boolean isOn() {
        return this.onOff;
    }

    @Override
    public void setOn() {
        this.onOff = true;
    }

    @Override
    public void setOff() {
        this.onOff = false;
    }
}
