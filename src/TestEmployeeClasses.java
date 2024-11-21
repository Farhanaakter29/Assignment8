public class TestEmployeeClasses {
    public static void main(String[] args) {
        // Create instances of Employee, Manager, and Executive
        Employee emp = new Employee("John Doe", 50000);
        Manager mgr = new Manager("Alice Smith", 75000, "Sales");
        Executive exec = new Executive("Bob Johnson", 120000, "Executive");

        // Print the information using toString methods
        System.out.println("Employee: " + emp.toString());
        System.out.println("Manager: " + mgr.toString());
        System.out.println("Executive: " + exec.toString());
    }
}
