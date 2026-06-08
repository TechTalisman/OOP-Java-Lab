import java.util.*;

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = sc.nextLine();

        String name = name2 + " " + name1;

        System.out.println(name);

        sc.close();
    }
}

