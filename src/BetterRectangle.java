import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    // Constructor that calls the Rectangle class constructor
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height); // Call the constructor of the parent Rectangle class
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight();
    }
}
