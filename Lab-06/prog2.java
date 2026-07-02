import java.util.Scanner;
class prog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        int numerator = in.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator = in.nextInt(); 

        try {
            System.out.println("Performing division: " + numerator + " / " + denominator);
            int result = numerator / denominator; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            in.close();
        }
    }
}
