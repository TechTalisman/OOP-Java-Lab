import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24)
            throw new HrsException("Hour should be between 0 and 24.");
        if (m < 0 || m > 60)
            throw new MinException("Minutes should be between 0 and 60.");
        if (s < 0 || s > 60)
            throw new SecException("Seconds should be between 0 and 60.");
    }
}

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();

        System.out.print("Enter hours: ");
        int h = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int m = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int s = scanner.nextInt();

        try {
            time.setTime(h, 0, 0);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        } finally {
            try {
                time.setTime(0, m, 0);
            } catch (HrsException | MinException | SecException e) {
                System.out.println("Caught the exception");
                System.out.println("Exception occurred: " + e);
            } finally {
                try {
                    time.setTime(0, 0, s);
                    System.out.println("Correct Time -> " + h + ":" + m + ":" + s);
                } catch (HrsException | MinException | SecException e) {
                    System.out.println("Caught the exception");
                    System.out.println("Exception occurred: " + e);
                }
            }
        }
        scanner.close();
    }
}
