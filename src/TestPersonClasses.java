public class TestPersonClasses {
    public static void main(String[] args) {
        // Create instances of Student and Instructor
        Student student = new Student("John Doe", 2000, "Computer Science");
        Instructor instructor = new Instructor("Dr. Smith", 1975, 75000.0);

        // Print the information using toString methods
        System.out.println("Student: " + student.toString());
        System.out.println("Instructor: " + instructor.toString());
    }
}
