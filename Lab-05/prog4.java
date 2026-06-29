import java.util.Scanner;

interface Employee {
    void getDetails(); 
}
 
interface Manager extends Employee {
    void getDeptDetails(); 
}

class Head implements Manager {

    int empId;
    String empName;
    int deptId;
    String deptName;

    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public void getDeptDetails() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }

    public void printAllDetails() {
        getDetails(); 
        getDeptDetails(); 
    }
}

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Department ID: ");
        int deptId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Department Name: ");
        String deptName = scanner.nextLine();

        Head head = new Head(empId, empName, deptId, deptName);

        System.out.println("\nHead of the Department Details:");
        head.printAllDetails();
        scanner.close();
    }
}
