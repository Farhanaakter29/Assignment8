public class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth); // Call the constructor of the superclass (Person)
        this.major = major;
    }

    // Getter method
    public String getMajor() {
        return major;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
