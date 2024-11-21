public class TestBetterRectangle {
    public static void main(String[] args) {
        // Create a BetterRectangle object with x=10, y=20, width=30, and height=40
        BetterRectangle rect = new BetterRectangle(10, 20, 30, 40);

        // Print the area and perimeter of the rectangle
        System.out.println("Rectangle's Area: " + rect.getArea());
        System.out.println("Rectangle's Perimeter: " + rect.getPerimeter());
    }
}
