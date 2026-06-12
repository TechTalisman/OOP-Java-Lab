import java.util.Scanner;

class ObjectCounter {

    static int objectCount = 0;

    ObjectCounter() {
        objectCount++;
    }

    static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}
 
public class prog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of objects to create: ");
        int numberOfObjects = in.nextInt();

        for (int i = 0; i < numberOfObjects; i++) {
            new ObjectCounter();
        }

        ObjectCounter.displayObjectCount();

        in.close();
    }
}


