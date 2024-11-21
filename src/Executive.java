public class Executive extends Manager {

    // Constructor
    public Executive(String name, double salary, String department) {
        super(name, salary, department); // Call the constructor of the superclass (Manager)
    }

    // toString method
    @Override
    public String toString() {
        return super.toString(); // Use the toString from Manager (which includes Employee details)
    }
}
