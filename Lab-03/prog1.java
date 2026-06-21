
class Box {
    private double length, width, height;
 
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}

class prog1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter length, width, and height of the box:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Box box = new Box(length, width, height);
        System.out.println("Volume of the box: " + box.volume());
        sc.close();
    }
}
