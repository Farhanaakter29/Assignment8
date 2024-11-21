public class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: $" + salary;
    }
}
