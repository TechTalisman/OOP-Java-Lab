import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class Kiitian extends Student {
    
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }   
}
 
public class prog1 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = in.nextInt();
        System.out.print("Enter Registration Number: ");
        long regNo = in.nextLong();

        Kiitian stud = new Kiitian();

        stud.getInput(rollNo, regNo);

        System.out.println("\nRollno - " + stud.rollNo);
        System.out.println("Registration no - " + stud.regNo);
        stud.course(); 

        in.close();
    }
}

