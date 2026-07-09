import java.io.*;
import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        int charCount = 0, wordCount = 0, lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                //String[] words = line.trim().split("\\s+");
                //wordCount += (words.length > 0 && !words[0].isEmpty()) ? words.length : 0;
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
