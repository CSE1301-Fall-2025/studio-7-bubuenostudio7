public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (2 * length) + (2 * width);
    }

    public boolean isSmaller(Rectangle r) {
        if (this.area() < r.area()) {
            return true;
        }
        return false;
    }

    public boolean isSquare() {
        if (width == length) {
            return true;
        }
        return false;
    }

public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 3);
    Rectangle r2 = new Rectangle(5, 5);
    Rectangle r3 = new Rectangle(100, 1);

    System.out.println(r1.area()); // 15
    System.out.println(r2.area()); // 25

    System.out.println(r2.perimeter()); // 20
    System.out.println(r3.perimeter()); // 202

    System.out.println(r1.isSmaller(r2)); // true
    System.out.println(r3.isSmaller(r1)); // false

    System.out.println(r2.isSquare()); // true
    System.out.println(r3.isSquare()); // false
}
}