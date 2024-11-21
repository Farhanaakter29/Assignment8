import java.awt.Point;

public class LabeledPoint {
    private Point point;  // Point object to store x, y coordinates
    private String label; // Label for the point

    // Constructor to initialize the point with x, y, and label
    public LabeledPoint(int x, int y, String label) {
        this.point = new Point(x, y); // Initialize the Point object
        this.label = label;           // Set the label
    }

    // toString method to return a string representation of the point
    @Override
    public String toString() {
        // Using the toString method of the Point class and appending the label
        return point.toString() + ", Label: " + label;
    }
}

