import java.util.*;

class prog4 {
    public static void main(String[] args) {
        int r = 0, rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is a palindrome or not: ");
        int n = sc.nextInt();

        int num = n; 
        while (num > 0) {
            r = num % 10; 
            rev = rev * 10 + r; 
            num = num / 10;
        }

        if (rev == n) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}

