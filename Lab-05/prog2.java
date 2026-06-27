import java.util.Scanner;

interface Motor {
    void run();
    void consume();
}

class WashingMachine implements Motor {
    int capacity; 

    public WashingMachine(int capacity) {
        this.capacity = capacity;
    }

    public void run() {
        System.out.println("\nWashing machine is running...");
    }

    public void consume() {
        System.out.println("Washing machine is consuming energy...");
    }

    public void showCapacity() {
        System.out.println("Motor capacity is: " + capacity + " watts.");
    }
}
 
public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the motor capacity (in watts): ");
        int userCapacity = scanner.nextInt();

        WashingMachine wm = new WashingMachine(userCapacity);

        wm.run();
        wm.consume();
        wm.showCapacity();

        scanner.close();
    }
}

