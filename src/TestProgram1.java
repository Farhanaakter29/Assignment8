public class TestProgram1{
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 50000, 10000);

        System.out.println("Name: " + manager.getName());
        System.out.println("Bonus: " + 10000);
        System.out.println("Total Salary: " + manager.getSalary());
    }
}

