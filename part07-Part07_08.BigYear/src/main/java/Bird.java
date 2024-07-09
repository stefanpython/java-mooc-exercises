import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a bird
class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}