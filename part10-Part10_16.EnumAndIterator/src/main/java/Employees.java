
import java.util.*;

public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.list.add(person);
        }
    }

    public void print() {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {

                iterator.remove();
            }
        }
    }
}
