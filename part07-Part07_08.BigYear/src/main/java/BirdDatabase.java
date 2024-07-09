import java.util.ArrayList;

class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public boolean addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.addObservation();
                return true;
            }
        }
        return false;
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}