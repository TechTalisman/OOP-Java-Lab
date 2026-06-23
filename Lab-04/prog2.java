import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;  
        this.width = width;
    }

    void display() {
        System.out.print("Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    void display() {
        super.display();
        System.out.print(", Height = " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    void display() {
        super.display();
        System.out.println(", Thickness = " + thickness);
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Plate, 2 for Box, 3 for WoodBox: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length and width: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();

            Plate plate = new Plate(length, width);
            System.out.print("Plate dimensions: ");
            plate.display();
        } else if (choice == 2) {
            System.out.print("Enter length, width, and height: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);
            System.out.print("Box dimensions: ");
            box.display();
        } else if (choice == 3) {
            System.out.print("Enter length, width, height, and thickness: ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            double thickness = sc.nextDouble();

            WoodBox woodBox = new WoodBox(length, width, height, thickness);
            System.out.print("WoodBox dimensions: ");
            woodBox.display();
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
