/* Aim of the program: Write a program to print the week day for the given day no. of the current month using switch case statement
Input: Mention the Day no in the program
Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday/Thursday/Friday/Saturday) */

import java.util.*;

public class prog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the day number of the current month: ");
        int day = in.nextInt();

        if(day >= 1 && day <= 31) {
            int ch = (day - 1) % 7;
            switch (ch) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Error occurred");
            }
        } else {
            System.out.println("Invalid day number! Please enter between 1 to 31.");
        }
        in.close();
    }
}
