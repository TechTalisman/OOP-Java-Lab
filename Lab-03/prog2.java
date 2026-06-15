import java.util.Scanner;

class Rectangle {
    
    double length, breadth, area, perimeter;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
        sc.close();
    }

   
    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    
    public void display() {
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class prog2 {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        
        rect.read();
        rect.calculate();
        rect.display();
    }
}

