public class prog3 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter the numbers to sort.");
            return;
        }

        int[] num = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                num[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter only valid integers.");
            return;
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted numbers in ascending order:");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
