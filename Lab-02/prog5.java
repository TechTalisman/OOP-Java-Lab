public class prog5 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please enter a list of numbers.");
            return;
        }

        try {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            boolean[] processed = new boolean[numbers.length];

            System.out.println("Occurrences:");
            for (int i = 0; i < numbers.length; i++) {
                if (processed[i]) continue; 

                int count = 1; 
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        processed[j] = true; 
                    }
                }

                System.out.println(numbers[i] + " = " + count);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please ensure all inputs are valid integers.");
        }
    }
}


