public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    // Constructor to initialize the point with x, y, and label
    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    // toString method to return a string representation of the point
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ", Label: " + label + ")";
    }
}
