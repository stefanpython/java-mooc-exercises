package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("AverageSensor is off.");
        }
        if (this.sensors.isEmpty()) {
            throw new IllegalStateException("No sensors have been added.");
        }

        int totalSensors = 0;
        for (Sensor sensor : sensors) {
            totalSensors += sensor.read();
        }
        
        int average = totalSensors / this.sensors.size();

        readings.add(average);
        
        return average;

    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }
}
