public class Teacher extends Person {
    private int earnings;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.earnings = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + earnings + " euro/month";
    }
}
