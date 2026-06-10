public class prog2 {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

        int evenCount = 0, oddCount = 0;

        try {
            for (String arg : args) {
                int num = Integer.parseInt(arg); 
                if (num % 2 == 0) {
                    evenCount++; 
                } else {
                    oddCount++; 
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);
        } catch (NumberFormatException e) {
            System.out.println("Please ensure all inputs are valid integers.");
        }
    }
}
