public class prog1 {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Please enter exactly three numbers as command-line arguments.");
            return;
        }

        try {
            
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

            System.out.println("Largest number is: " + max);
        } catch (NumberFormatException e) {
            System.out.println("Please ensure all inputs are valid integers.");
        }
    }
}
