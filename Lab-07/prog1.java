import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a string (or type 'exit' to quit): ");
            String str = scanner.nextLine().trim();
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }
            
            if (str.isEmpty()) {
                System.out.println("Empty string detected. Please enter a valid string.");
                continue;
            }

            System.out.println("Choose an operation:");
            System.out.println("1. Change case");
            System.out.println("2. Reverse string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert to upper and lower case");
            System.out.println("6. Check character presence and position");
            System.out.println("7. Check palindrome");
            System.out.println("8. Count words, vowels, and consonants");
            System.out.println("9. Exit");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 9) {
                System.out.println("Exiting program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("The string after changing the case is: " + changeCase(str));
                    break;
                case 2:
                    System.out.println("The string after reversing is: " + reverseString(str));
                    break;
                case 3:
                    System.out.print("Enter the second string for comparison: ");
                    String str2 = scanner.nextLine();
                    compareStrings(str, str2);
                    break;
                case 4:
                    System.out.print("Enter the string to be inserted: ");
                    String insertStr = scanner.nextLine();
                    System.out.print("Enter the position (0-based index): ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input! Position must be a number.");
                        scanner.nextLine();
                        continue;
                    }
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("The string after insertion is: " + insertString(str, insertStr, position));
                    break;
                case 5:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter a character: ");
                    char ch = scanner.next().charAt(0);
                    scanner.nextLine();
                    checkCharacterPresence(str, ch);
                    break;
                case 7:
                    System.out.println("Entered string is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
                    break;
                case 8:
                    countWordsVowelsConsonants(str);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
        }
        scanner.close();
    }

    static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static void compareStrings(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result > 0) {
            System.out.println("String 1 is lexicographically greater.");
        } else {
            System.out.println("String 2 is lexicographically greater.");
        }
    }

    static String insertString(String original, String insert, int position) {
        if (position < 0 || position > original.length()) {
            return "Invalid position!";
        }
        return original.substring(0, position) + insert + original.substring(position);
    }

    static void checkCharacterPresence(String str, char ch) {
        boolean found = false;
        StringBuilder positions = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                if (positions.length() > 0) positions.append(", ");
                positions.append(i);
                found = true;
            }
        }
        System.out.println(found ? "Character '" + ch + "' found at positions: " + positions : "Character not found in the string.");
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    static void countWordsVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        String[] words = str.trim().split("\\s+");
        int wordCount = (str.isEmpty()) ? 0 : words.length;

        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
