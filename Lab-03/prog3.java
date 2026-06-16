import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class prog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = in.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll, name, and CGPA of student " + (i + 1) + ":");
            int roll = in.nextInt();
            in.nextLine();
            String name = in.nextLine();
            double cgpa = in.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        Student lowestCgpaStudent = students[0];
        for (Student s : students) {
            if (s.cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = s;
            }
        }

        System.out.println();
        System.out.println("Details of students:");
        for (Student s : students) {
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", CGPA: " + s.cgpa);
        }

        System.out.println("Student with the lowest CGPA: " + lowestCgpaStudent.name);
        in.close();
    }
}
