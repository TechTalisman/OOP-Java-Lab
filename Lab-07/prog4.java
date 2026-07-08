import java.io.*;
import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
    
            System.out.print("Enter first binary file name: ");
            String file1 = scanner.nextLine();

            System.out.print("Enter second binary file name: ");
            String file2 = scanner.nextLine();

            try (FileInputStream fis1 = new FileInputStream(file1);
                 FileInputStream fis2 = new FileInputStream(file2)) {

                int pos = 1;
                int byte1, byte2;

                while (true) {
                    byte1 = fis1.read();
                    byte2 = fis2.read();

                    if (byte1 != byte2) {
                        System.out.println("Files are not equal. First difference at byte position: " + pos);
                        return;
                    }

                    if (byte1 == -1) {
                        System.out.println("Files are equal.");
                        return;
                    }
                    
                    pos++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: One or both files not found.");
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
