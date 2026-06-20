import java.util.Scanner;

class RectangleConstructor {
    private double length, breadth;

    public RectangleConstructor() {
        this.length = 0;
        this.breadth = 0;
    }

    public RectangleConstructor(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
 
    public double calculateArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Area: " + calculateArea());
    }
}

public class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        RectangleConstructor rect = new RectangleConstructor(length, breadth);
        rect.display();

        RectangleConstructor defaultRect = new RectangleConstructor();
        System.out.println("Rectangle with default dimensions:");
        defaultRect.display();

        sc.close();
    }
}
