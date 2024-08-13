package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.trim().isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name must not be null or empty and length must not be over 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be above 0 and lesser than 120.");
        }

        this.name = name;

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
