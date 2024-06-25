/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author tao
 */
public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }
    
    public boolean isEmpty() {
        if(list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return new ArrayList<>(list);
    }
    
    public Person shortest() {
        if(list.isEmpty()) {
            return null;
        }
        
        Person returnedObject = this.list.get(0);
        
        for(Person prs: this.list) {
            if(returnedObject.getHeight() > prs.getHeight()) {
                returnedObject = prs;
            }
        }
        
        return returnedObject;
    }
    
    public Person take() {
        if(this.list.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        this.list.remove(shortestPerson);
        return shortestPerson;
    }
}
