import java.util.Scanner;

class TwoD {
    double length, width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateCost() {
        return 40 * length * width;
    }
} 

class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double calculateCost() {
        return 60 * length * width * height;
    }
}

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for 2D sheet or 2 for 3D box: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length and width of 2D sheet (in feet): ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();

            TwoD sheet = new TwoD(length, width);
            System.out.println("Cost of the 2D sheet: Rs " + sheet.calculateCost());
        } else if (choice == 2) {
            System.out.print("Enter length, width, and height of 3D box (in feet): ");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double height = sc.nextDouble();

            ThreeD box = new ThreeD(length, width, height);
            System.out.println("Cost of the 3D box: Rs " + box.calculateCost());
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

