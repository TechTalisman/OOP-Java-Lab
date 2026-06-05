import java.util.*;

public class prog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks of the student (out of 100): ");
        int marks = in.nextInt();

        if(0<=marks && marks<=100) {
            System.out.print("Grade: ");
            if(marks>=90) {
                System.out.println("O");
            } else if(marks>=80) {
                System.out.println("E");
            } else if(marks>=70) {
                System.out.println("A");
            } else if(marks>=60) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("Marks is not in the range of 0-100");
        }
        in.close();
    }
}
