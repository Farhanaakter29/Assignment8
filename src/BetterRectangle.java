import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    // Constructor that calls the constructor of the Rectangle class using `super`
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height); // Explicitly invoke the Rectangle constructor
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight()); // Using inherited methods to get width and height
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight(); // Using inherited methods to get width and height
    }
}
