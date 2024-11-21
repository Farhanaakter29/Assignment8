public class Instructor extends Person {
    private double salary;

    // Constructor
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth); // Call the constructor of the superclass (Person)
        this.salary = salary;
    }

    // Getter method
    public double getSalary() {
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}
