/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tao
 */
public class Fitbyte {
    private int age;
    private int rate;
  
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.rate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxRate = 206.3 - (0.711 * this.age);
        double target = (maxRate - this.rate) * percentageOfMaximum + this.rate;
        return target;
    }
}
