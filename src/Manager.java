public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call the constructor of the superclass (Employee)
        this.department = department;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
