import Marketing.Sales;  
import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String ename = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Sales salesPerson = new Sales(empid, ename);

        double totalEarnings = salesPerson.earnings(basicSalary);
        double travellingAllowance = salesPerson.tallowance(totalEarnings);

        System.out.println("\nEmployee Details:");
        System.out.println("Employee Name: " + salesPerson.getEname());
        System.out.println("Employee ID: " + salesPerson.getEmpid());
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Travelling Allowance: " + travellingAllowance);
 
        scanner.close();
    }
}
