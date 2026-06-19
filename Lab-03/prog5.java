class Area {
    public double calculate(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculate(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculate(float side) {
        return side * side;
    }
}

class prog5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Area area = new Area();

        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        System.out.printf("Area of Circle: %.2f%n", area.calculate(radius)); // 2 decimal places

        System.out.println("Enter base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.printf("Area of Triangle: %.2f%n", area.calculate(base, height)); // 2 decimal places

        System.out.println("Enter side of the square:");
        float side = sc.nextFloat();
        System.out.printf("Area of Square: %.2f%n", area.calculate(side)); // No decimal for integer
        sc.close();
    }
     
}

