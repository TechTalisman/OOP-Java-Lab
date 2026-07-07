import java.io.*;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String sourceFile = scanner.nextLine();

        System.out.println("Enter destination file name:");
        String destinationFile = scanner.nextLine();

        System.out.println("Choose copy method: ");
        System.out.println("1. Character Stream (for text files)");
        System.out.println("2. Byte Stream (for binary files)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            copyUsingCharacterStream(sourceFile, destinationFile);
        } else if (choice == 2) {
            copyUsingByteStream(sourceFile, destinationFile);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader fr = new FileReader(source); FileWriter fw = new FileWriter(destination)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully using Character Stream.");
        } catch (IOException e) {
            System.out.println("Error in Character Stream: " + e.getMessage());
        }
    }

    public static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Byte Stream.");
        } catch (IOException e) {
            System.out.println("Error in Byte Stream: " + e.getMessage());
        }
    }
}
