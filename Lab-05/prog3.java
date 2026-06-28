import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Salary { // Declaring Manager as an abstract class
    double basic;

    public Manager(double basic) {
        this.basic = basic;
    }

    public double earnings() {
        double DA = 0.80 * basic; 
        double HRA = 0.15 * basic; 
        return basic + DA + HRA;
    }

    public double deductions() {
        return 0.12 * basic; 
    }
    
    // Do NOT implement bonus() here. Subclasses must implement it.
}

class Substaff extends Manager {
    public Substaff(double basic) {
        super(basic);
    }

    public double bonus() {
        return 0.50 * basic;
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary amount: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        System.out.println("\nSubstaff Details:");
        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());

        scanner.close();
    }
}

