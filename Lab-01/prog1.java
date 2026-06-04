/* Aim of the program - Write a program to print your name, roll no, section and branch in separate lines.
Input: Name, Roll no, Section and branch
Output: Display Name
        Display Roll No 
        Display Section 
        Display Branch */

import java.util.*;

public class L1_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter Roll No.: ");
        int roll = in.nextInt();
        in.nextLine(); 
        System.out.print("Enter Section: ");
        String sec = in.nextLine();
        System.out.print("Enter Branch: ");
        String str = in.nextLine();

        System.out.println("\nName: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Section: "+sec);
        System.out.println("Branch: "+str);
        in.close();
    }
}
