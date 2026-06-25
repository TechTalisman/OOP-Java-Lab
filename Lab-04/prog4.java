import java.util.Scanner;

class Account {
    String acc_no;
    double balance;

    public void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    public void input(Scanner sc) {
        super.input(sc); 
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    public void disp() {
        super.disp(); 
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEntering details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDisplaying details of all persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + ":");
            persons[i].disp();
        }

        sc.close(); 
    }
}

