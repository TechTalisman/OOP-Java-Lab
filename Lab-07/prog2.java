import java.io.*;
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        
            System.out.print("Enter student Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();

            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter the name of the file to store details: ");
            String fileName = scanner.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(rollNo + "|" + name + "|" + subject + "|" + marks);
                writer.newLine();
                System.out.println("\nStudent details written to file successfully.");
            }

            System.out.println("\nContents of the file:");
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line = reader.readLine();
                if (line != null) {
                    String[] details = line.split("\\|");
                    System.out.println("Roll No: " + details[0]);
                    System.out.println("Name: " + details[1]);
                    System.out.println("Subject: " + details[2]);
                    System.out.println("Marks: " + details[3]);
                } else {
                    System.out.println("File is empty.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
